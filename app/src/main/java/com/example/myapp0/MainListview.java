package com.example.myapp0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainListview extends AppCompatActivity {
    private ListView listaDias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_listview);
        listaDias = findViewById(R.id.listViewId);

        listViewAdapter();
    }

    private void listViewAdapter(){
        ArrayAdapter<CharSequence> adapterListView = ArrayAdapter.createFromResource(this,
                R.array.combo_dias,R.layout.support_simple_spinner_dropdown_item);
        listaDias.setAdapter(adapterListView);

        listaDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),"seleccionaste: "+
                        parent.getItemAtPosition(position),Toast.LENGTH_LONG).show();
            }
        });
    }

    public void enviar(View view) {

        Intent intent = new Intent(getApplicationContext(),MainListViewArray.class);
        startActivity(intent);
    }
}