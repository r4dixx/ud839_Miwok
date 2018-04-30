package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<>();

        words.add(getResources().getString(R.string.numbers_1));
        words.add(getResources().getString(R.string.numbers_2));
        words.add(getResources().getString(R.string.numbers_3));
        words.add(getResources().getString(R.string.numbers_4));
        words.add(getResources().getString(R.string.numbers_5));
        words.add(getResources().getString(R.string.numbers_6));
        words.add(getResources().getString(R.string.numbers_7));
        words.add(getResources().getString(R.string.numbers_8));
        words.add(getResources().getString(R.string.numbers_9));
        words.add(getResources().getString(R.string.numbers_10));

        LinearLayout rootView = findViewById(R.id.rootView);

        int index = 0;
        while (index < words.size()) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);
            index++;
        }
    }
}
