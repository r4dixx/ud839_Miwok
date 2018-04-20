package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String[] numbersList = new String[10];
        numbersList[0] = getResources().getString(R.string.numbers_1);
        numbersList[1] = getResources().getString(R.string.numbers_2);
        numbersList[2] = getResources().getString(R.string.numbers_3);
        numbersList[3] = getResources().getString(R.string.numbers_4);
        numbersList[4] = getResources().getString(R.string.numbers_5);
        numbersList[5] = getResources().getString(R.string.numbers_6);
        numbersList[6] = getResources().getString(R.string.numbers_7);
        numbersList[7] = getResources().getString(R.string.numbers_8);
        numbersList[8] = getResources().getString(R.string.numbers_9);
        numbersList[9] = getResources().getString(R.string.numbers_10);
    }
}
