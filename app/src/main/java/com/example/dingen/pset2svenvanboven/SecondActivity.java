package com.example.dingen.pset2svenvanboven;

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
        String receivedText = intent.getStringExtra("ourText");

        TextView textView = findViewById(R.id.textView);
        textView.setText(receivedText);
    }
}
