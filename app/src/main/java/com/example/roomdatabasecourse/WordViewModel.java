package com.example.roomdatabasecourse;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository repository;
    private final LiveData<List<Word>> allWords;

    public WordViewModel(@NonNull Application application) {
        super(application);
        repository = new WordRepository(application);
        allWords = repository.getAllWord();
    }

    LiveData<List<Word>> getAllWords(){ return  allWords;}

    public void insert (Word word) {
        repository.insert(word);
    }

}
