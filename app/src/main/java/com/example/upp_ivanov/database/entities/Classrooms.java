package com.example.upp_ivanov.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity (tableName = "classrooms")

public class Classrooms {
    @PrimaryKey(autoGenerate = true)
    private long Id;
    @ColumnInfo(name = "name")
    private String name;
    public Classrooms(){}
}
