package com.example.myapp0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


    }

    public void salir(View view) {
        finish();
    }
}

/* para dar seguimiento a los proyectos
 Log.i("info ","Valor Informacion");
        Log.d("debug ","Valor debug");
        Log.w("warning ","Valor warning");
        Log.e("Error ","Valor Error");
        Log.v("verbose","Valor verbose");*/