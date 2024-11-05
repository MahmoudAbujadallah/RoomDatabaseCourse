package com.example.roomdatabasecourse;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "word_table")
class Word {


    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    String mWord;

    public Word(@NonNull String word) {
        this.mWord = word;
    }

    @NonNull
    public String getmWord() {
        return mWord;
    }
}
