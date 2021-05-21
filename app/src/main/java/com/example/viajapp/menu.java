package com.example.viajapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final Button btnAtracciones = (Button)findViewById(R.id.btnatracciones);

        final Button btnComida = (Button)findViewById(R.id.btncomida);

        final Button btnTradiciones = (Button)findViewById(R.id.btntradiciones);

        btnAtracciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent llevara = new Intent(menu.this,atracciones.class);
                startActivity(llevara);

            }

        });

        btnComida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent llevara = new Intent(menu.this,comidatip.class);
                startActivity(llevara);

            }
        });

        btnTradiciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent llevara = new Intent(menu.this,tradiciones.class);
                startActivity(llevara);
            }
        });

    }
}