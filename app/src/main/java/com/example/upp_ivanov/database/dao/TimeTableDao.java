package com.example.upp_ivanov.database.dao;

import static java.nio.charset.CodingErrorAction.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.upp_ivanov.database.entities.TimeTable;

import java.util.List;

@Dao
public interface TimeTableDao {
    @Insert(onConflict = REPLACE)
    void insert(TimeTable classroom);
    @Update
    void update (TimeTable classroom);
    @Delete
    void delete (TimeTable classroom);


    @Query("SELECT * FROM timetable WHERE classroom=:classroom")
    List<TimeTable> getlAllClassrooms(int classroom);
}
