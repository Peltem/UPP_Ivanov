package com.example.upp_ivanov.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "timetable", foreignKeys = {@ForeignKey(entity = Classrooms.class, parentColumns = "Id",
        childColumns = "classroom") @ForeignKey(entity = )}, indices = {@Index(value = {"classroom"})})
public class TimeTable {
        @PrimaryKey
        private long Id;
        @ColumnInfo (name = "lesson")
        private int lesson;
        @ColumnInfo(name = "classroom")
        private long classroom;
        @ColumnInfo(name ="group")
        private int group;
        public TimeTable(){}
    }

