package ru.mirea.egerasimovich.employeedb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Hero.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract HeroDao employeeDao();
}
