package com.example.upp_ivanov.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "groups")
public class Groups {
    @PrimaryKey(autoGenerate = true)
    private long Id;
    @ColumnInfo(name = "name")
    private String name;
    public Groups(){}
}