package com.example.viajapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Button;
import android.content.Intent;

public class comidatip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comidatip);
        final Button volverac  = (Button)findViewById(R.id.btnvolvera);

        volverac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volverac = new Intent(comidatip.this,menu.class);
                startActivity(volverac);
            }
        });

    }
}