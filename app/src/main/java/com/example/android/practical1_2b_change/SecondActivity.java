package com.example.android.practical1_2b_change;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String count = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView setCount = findViewById(R.id.display_count);
        setCount.setText(count);
    }


}