package ru.mirea.egerasimovich.employeedb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface HeroDao {
    @Query("SELECT * FROM Hero")
    List<Hero> getAll();
    @Query("SELECT * FROM Hero WHERE id = :id")
    Hero getById(long id);
    @Insert
    void insert(Hero employee);
    @Update
    void update(Hero employee);
    @Delete
    void delete(Hero employee);
}
