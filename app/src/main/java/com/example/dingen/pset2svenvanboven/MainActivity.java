package com.example.dingen.pset2svenvanboven;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSecond(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String text = editText.getText().toString();



        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("ourText", text);
        startActivity(intent);
        finish();
    }
}
