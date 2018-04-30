package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        LinearLayout rootView = findViewById(R.id.rootView);

        String[] numbersList = getResources().getStringArray(R.array.numbers);
        for (int index = 0; index < numbersList.length; index++) {
            TextView numbersListView = new TextView(this);
            numbersListView.setText(String.valueOf(numbersList[index]));
            rootView.addView(numbersListView);
        }
    }
}
