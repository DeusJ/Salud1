package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuPrincipal extends AppCompatActivity {
    ImageButton btnam , btnzr, btnrt,btndirc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        btnam = findViewById(R.id.btnAM);
        btnzr=findViewById(R.id.btnZR);
        btnrt=findViewById(R.id.btnRT);
        btndirc=findViewById(R.id.btnlink);

        btnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MenuPrincipal.this,AsistenciaMedica.class);
                startActivity(intent);
            }
        });

        btnzr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this,ZonaRiesgo.class);
                startActivity(intent);
            }
        });

        btnrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuPrincipal.this,Rutas.class);
                startActivity(intent);
            }
        });



        btndirc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l1 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSe-W7Gmy5Du5Id6mavfH1x7YyiNuCxLlEuEObM2_YvEqGD6FQ/viewform?usp=sf_link"));
                startActivity(l1);

            }
        });



    }
}