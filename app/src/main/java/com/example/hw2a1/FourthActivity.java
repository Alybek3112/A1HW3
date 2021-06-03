package com.example.hw2a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        button=findViewById(R.id.b4);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=getIntent().getStringExtra("3");
                Intent intent=new Intent(getApplicationContext(),FifthActivity.class);
                intent.putExtra("4",text);
                startActivity(intent);
            }
        });
    }
}