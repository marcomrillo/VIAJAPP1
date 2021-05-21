package com.example.viajapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class atracciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atracciones);
        final Button btnvolveraa = (Button)findViewById(R.id.btnvolvera);
        btnvolveraa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volverat = new Intent(atracciones.this,menu.class);
                startActivity(volverat);
            }
        });
    }
}