package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button addButton, subtractButton;
//    private int number = 0;
    private MainViewModel mainViewModel;
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.addButton:
                    addition();
                    break;
                case R.id.subtractButton:
                    subtraction();
                    break;
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        textView = findViewById(R.id.number);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);

        addButton.setOnClickListener(clickListener);
        subtractButton.setOnClickListener(clickListener);

        textView.setText(String.valueOf(mainViewModel.number));
    }

    public void addition(){
        mainViewModel.addition();
        textView.setText(mainViewModel.number + "");
    }

    public void subtraction(){
        mainViewModel.subtraction();
        textView.setText(mainViewModel.number + "");
    }
}