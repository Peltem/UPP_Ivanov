package com.example.upp_ivanov.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "lessons", foreignKeys = {@ForeignKey(entity = Teachers.class, parentColumns = "Id",
childColumns = "teacher")}, indices = {@Index(value = {"teacher"})})
public class Lessons {
    @PrimaryKey(autoGenerate = true)
    private long Id;
    @ColumnInfo (name = "name")
    private String name;
   @ColumnInfo (name = "teacher")
    private long teacher;
   public Lessons(){}
}
