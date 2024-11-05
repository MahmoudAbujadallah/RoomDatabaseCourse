package com.example.roomdatabasecourse;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

class WordListAdapter extends ListAdapter<Word, WordViewHolder> {

   public WordListAdapter(@NonNull DiffUtil.ItemCallback<Word> diffCallback) {
      super(diffCallback);
   }

   @Override
   public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      return WordViewHolder.create(parent);
   }

   @Override
   public void onBindViewHolder(WordViewHolder holder, int position) {
      Word current = getItem(position);
      holder.bind(current.getmWord());
   }

   static class WordDiff extends DiffUtil.ItemCallback<Word> {

      @Override
      public boolean areItemsTheSame(@NonNull Word oldItem, @NonNull Word newItem) {
         return oldItem == newItem;
      }

      @Override
      public boolean areContentsTheSame(@NonNull Word oldItem, @NonNull Word newItem) {
         return oldItem.getmWord().equals(newItem.getmWord());
      }
   }
}