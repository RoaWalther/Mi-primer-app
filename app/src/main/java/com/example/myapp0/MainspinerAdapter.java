package com.example.myapp0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainspinerAdapter extends AppCompatActivity {
    private TextView estado;
    private Spinner comboDias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainspiner_adapter);

        estado= findViewById(R.id.comboSpinerAdapter);
        comboDias = findViewById(R.id.spinerAdapter);

        spiner();

    }
    private void spiner(){
        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this
                ,R.array.combo_dias,R.layout.support_simple_spinner_dropdown_item);
        comboDias.setAdapter(adapter);

        comboDias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),"seleccionaste: "+
                        parent.getItemAtPosition(position),Toast.LENGTH_LONG).show();
                estado.setText("seleccion: "+parent.getItemAtPosition(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void enviar(View view) {
        Intent intent = new Intent(MainspinerAdapter.this,MainSpinnerArrayList.class);
        startActivity(intent);
    }
}