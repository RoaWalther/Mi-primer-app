package com.example.myapp0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
    Button btn1, btn2;
    TextView mostrar, estado, swit,nomMsj,telMsj;
    CheckBox c1,c2;
    RadioButton r1,r2;
    ToggleButton tbtn;
    Switch btnSwit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mostrar = findViewById(R.id.titulo);
        btn1 = findViewById(R.id.boton1);
        btn2 = findViewById(R.id.boton2);
        c1= findViewById(R.id.check1);
        c2= findViewById(R.id.check2);
        r1 = findViewById(R.id.radio1);
        r2 = findViewById(R.id.radio2);
        estado= findViewById(R.id.estado);
        tbtn = findViewById(R.id.tbtn);
        swit = findViewById(R.id.estadoSwit);
        btnSwit = findViewById(R.id.switc);
        nomMsj = findViewById(R.id.nombremensaje);
        telMsj = findViewById(R.id.telmensaje);
        //trae el parametro de la otra activity
        Bundle miBundle = this.getIntent().getExtras();
        if (miBundle!= null){
            String nombre = miBundle.getString("nombre");
            String tel = miBundle.getString("telefono");
            String msj = getString(R.string.Mensaje); //otra forma de optener el mensaje de bienvenido desde el archivo string
            nomMsj.setText(msj+ nombre); //nomMsj.setText("Bienvenido: "+ nombre);
            telMsj.setText("Telefono: "+tel);
        }

        btn2.setOnClickListener(this);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar.setText("Se cambia titulo");
                Toast.makeText(getApplicationContext(),"Boton llamado clase anonima",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        String cad="Selecionado: \n";

        if (c1.isChecked()==true){
            cad+="opcion 1";
        }
        else{
            cad+="opcion 2";
        }


        Toast.makeText(getApplicationContext(),cad,Toast.LENGTH_LONG).show();
    }

    public void boton3(View view) {

        String cad="Selecionado: \n";

        if (r1.isChecked()==true){
            cad+="radio opcion 1";
        }
        else{
            cad+="radio opcion 2";
        }
        Toast.makeText(getApplicationContext(),cad,Toast.LENGTH_LONG).show();
    }

    public void Estado(View view) {
        if (tbtn.isChecked()==true){
            estado.setText("Estado: Activo");
        }
        else{
            estado.setText("Estado: Inactivo");
        }

    }

    public void botonSwitch(View view) {
        if (btnSwit.isChecked()==true){
            swit.setText("Fue Activo");
        }
        else{
            swit.setText("Fue Inactivo");
        }
    }

    public void siguiente(View view) {
        Intent miIntent = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(miIntent);
    }

    public void regresar(View view) {
        Intent miIntent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(miIntent);
    }
}