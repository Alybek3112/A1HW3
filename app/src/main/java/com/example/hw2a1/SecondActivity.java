package com.example.hw2a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
         button = findViewById(R.id.b2);




         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String text = getIntent().getStringExtra("1");
                 Intent intent = new Intent(getApplicationContext(),ThirdActivity.class);
                 intent.putExtra("2", text);
                 startActivity(intent);
             }
         });

    }
}