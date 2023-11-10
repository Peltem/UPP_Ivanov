package com.example.upp_ivanov.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "timetable", foreignKeys = {@ForeignKey(entity = Classrooms.class, parentColumns = "Id",
        childColumns = "classroom")}, indices = {@Index(value = {"classrooms"})},  @ForeignKey(entity = Lessons.class,
        parentColumns = "Id", childColumns = "lesson"), indices = {@Index(value = {"lesson"})}
public class TimeTable {
        @PrimaryKey(autoGenerate = true)
        private long Id;
        @ColumnInfo (name = "lesson")
        private int lesson;
        @ColumnInfo(name = "classroom")
        private long classroom;
        @ColumnInfo(name ="group")
        private int group;
        public TimeTable(){}
    }

