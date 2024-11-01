package com.example.roomdatabasecourse;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
interface WordDao  {

 @Insert
 void insert(Word word);

 @Query("DELETE FROM word_table")
 void deleteAll();

 @Query("SELECT * FROM word_table ORDER BY word ASC")
 LiveData<List<Word>> getAlphabetizedWords();


}
