package ru.mirea.egerasimovich.employeedb;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppDatabase db = App.getInstance().getDatabase();
        HeroDao employeeDao = db.employeeDao();


        Hero employee_1 = new Hero();
        employee_1.name = "Super Man";
        employee_1.feature = "flying";

        Hero employee_2 = new Hero();
        employee_2.name = "Spyder Man";
        employee_2.feature = "cobweb";


// запись героев в базу
        employeeDao.insert(employee_1);
        employeeDao.insert(employee_2);


        List<Hero> heroes = employeeDao.getAll();
        for (Hero hero : heroes) {
            Log.i(TAG, hero.name + " " + hero.feature);
        }

    }
}