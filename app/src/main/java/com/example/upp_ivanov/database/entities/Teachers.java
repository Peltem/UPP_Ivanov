package com.example.upp_ivanov.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "teachers")
public class Teachers {
    @PrimaryKey(autoGenerate = true)
    private long Id;
    @ColumnInfo (name = "name")
    private String name;
    @ColumnInfo (name = "surname")
    private String surename;
    public Teachers(){}
}
