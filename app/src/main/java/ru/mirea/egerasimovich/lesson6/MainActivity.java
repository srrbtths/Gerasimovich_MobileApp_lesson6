package ru.mirea.egerasimovich.lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import ru.mirea.egerasimovich.lesson6.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        SharedPreferences sharedPref = getSharedPreferences("mirea_settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        binding.group.setText(sharedPref.getString("GROUP", "XXXX-XX-XX"));
        binding.number.setText(sharedPref.getString("NUMBER", "XX"));
        binding.film.setText(sharedPref.getString("FILM", "FILM"));

        binding.send.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("GROUP", String.valueOf(binding.group.getText()));
                editor.putString("NUMBER", String.valueOf(binding.number.getText()));
                editor.putString("FILM",String.valueOf(binding.film.getText()));
                editor.apply();
            }
        });
    }
}