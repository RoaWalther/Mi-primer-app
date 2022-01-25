package com.example.myapp0;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainListViewArray extends AppCompatActivity {
    private ListView listaArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view_array);
       listaArray = findViewById(R.id.listViewArray);
       listViewAdapter();
    }

    private void listViewAdapter(){

        ArrayList<String> listconArray = new ArrayList<>();
        listconArray.add("walter 0");
        for (int i=0;i<10;i++){
            listconArray.add("walter "+i);
        }
        ArrayAdapter<CharSequence> ListViewConArray = new ArrayAdapter(this,
                R.layout.support_simple_spinner_dropdown_item,listconArray);
        listaArray.setAdapter(ListViewConArray);

        listaArray.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),"seleccionaste: "+
                        parent.getItemAtPosition(position),Toast.LENGTH_LONG).show();
            }
        });
    }

    public void enviar(View view) {

    }
}