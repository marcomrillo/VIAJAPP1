package com.example.viajapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class tradiciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tradiciones);

        final Button btnvolverat = (Button)findViewById(R.id.btnvolvera);
        btnvolverat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent llevarat = new Intent(tradiciones.this,menu.class);
                startActivity(llevarat);
            }
        });

    }
}