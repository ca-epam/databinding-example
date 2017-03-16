package com.example.adrian.databindingexample.model;

import android.databinding.ObservableField;

/**
 * Created by Adrian_Czigany on 3/14/2017.
 */

public class SampleDataViewModel {

    public int id;
    public final ObservableField<String> text = new ObservableField<>();

    public SampleDataViewModel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ObservableField<String> getText() {
        return text;
    }

    // @={...}
//    public TextWatcher watcher = new TextWatcherAdapter() {
//        @Override
//        public void afterTextChanged(Editable s) {
//            if (!Objects.equals(text.get(), s.toString())) {
//                text.set(s.toString());
//            }
//        }
//    };

}
