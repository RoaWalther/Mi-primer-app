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

import java.util.ArrayList;

public class MainSpinnerArrayList extends AppCompatActivity {
    private TextView estado;
    private Spinner comboDiasList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_spinner_array_list);

        estado= findViewById(R.id.comboSpinerArray);
        comboDiasList = findViewById(R.id.spinerArray);
            spinnerArrayList();
    }

    private void spinnerArrayList(){
        ArrayList<String> arrayListCombo = new ArrayList<>();
        arrayListCombo.add("Seleccione: ");
        for (int i=0;i<10;i++){
            arrayListCombo.add("opcion "+i);
        }

        ArrayAdapter<CharSequence> adapterArrayList = new ArrayAdapter(this,
                R.layout.support_simple_spinner_dropdown_item,arrayListCombo);
        comboDiasList.setAdapter(adapterArrayList);

        comboDiasList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
        Intent intent = new Intent(getApplicationContext(),MainListview.class);
        startActivity(intent);
    }
}