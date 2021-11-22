package com.example.parcha2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bienvenidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_actividad);
    }
    public void env_login(View vista){
        Intent irlogin= new Intent(this, Logins.class);
        startActivity(irlogin);
    }

}