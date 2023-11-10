package com.example.upp_ivanov.database.entities;

import androidx.constraintlayout.widget.Group;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "timetable", foreignKeys = {@ForeignKey(entity = Classrooms.class, parentColumns = "Id",
        childColumns = "classroom"), @ForeignKey(entity = Lessons.class,
        parentColumns = "Id", childColumns = "lesson"), @ForeignKey(entity = Groups.class,
        parentColumns = "Id", childColumns = "group")},
        indices = {@Index(value = {"classroom"}), @Index(value = {"lesson"}), @Index(value = "group")})
public class TimeTable {
        @PrimaryKey(autoGenerate = true)
        private long Id;
        @ColumnInfo (name = "lesson")
        private int lesson;
        @ColumnInfo(name = "classroom")
        private long classroom;
        @ColumnInfo(name ="group")
        private long group;
        public TimeTable(){}
    }

