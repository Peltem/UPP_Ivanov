package com.example.upp_ivanov.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "lessons", foreignKeys = @ForeignKey(entity = Teachers.class, parentColumns = "Id",
childColumns = ""))
public class Lessons {
    @PrimaryKey
    private long Id;
    @ColumnInfo (name = "name")
    private String name;
   @ColumnInfo (name = "teacher")
    private long teacher;
   public Lessons(){}
}
