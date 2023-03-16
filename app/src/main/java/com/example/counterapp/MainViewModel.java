package com.example.counterapp;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public int number = 0;

    public MainViewModel(){
    }

    public void addition(){
        this.number++;
    }

    public void subtraction(){
        this.number--;
    }
}
