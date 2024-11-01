package com.example.roomdatabasecourse;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

class WordRepository {

   private WordDao wordDao;
   private LiveData<List<Word>> allWord;


   WordRepository(Application application){
      WordRoomDatabase db = WordRoomDatabase.getRoomDatabase(application);
      wordDao = db.wordDao();
      allWord = wordDao.getAlphabetizedWords();
   }

   LiveData<List<Word>> getAllWord(){
      return allWord;
   }

   void insert (Word word){
      WordRoomDatabase.databaseWriteExecutor.execute(() -> {
         wordDao.insert(word);

              }
      );
   }
}
