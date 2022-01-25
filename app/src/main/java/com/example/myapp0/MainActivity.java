package com.example.myapp0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nombre, tel;
    private TextView mostrar;
    String sNombre="";
    String sTel="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre= findViewById(R.id.txtNombre);
        tel= findViewById(R.id.txtTel);
        mostrar= findViewById(R.id.mostar);
    }

    public void ingresar(View view) {

        sNombre= nombre.getText().toString();
        sTel= tel.getText().toString();
        mostrar.setText(sNombre+" "+sTel);
    }
    //envia el dato a la proxima actividad
    public void siguiente(View view) {
        Intent miIntent = new Intent(MainActivity.this, MainActivity2.class);
        Bundle miBundle= new Bundle();
        miBundle.putString("nombre",nombre.getText().toString());
        miBundle.putString("telefono",tel.getText().toString());
        miIntent.putExtras(miBundle);
        startActivity(miIntent);
    }
}