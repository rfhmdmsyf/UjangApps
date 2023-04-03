package com.example.ujangapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] kegiatan = new String[]{"Belanja","Olahraga","Rapat", "Belajar","Tidur","Main","Ibadah"};

        ListView listKegiatan = findViewById(R.id.list_kegiatan);

        ArrayAdapter adapter = new ArrayAdapter( this, android.R.layout.simple_list_item_1, kegiatan);
        listKegiatan.setAdapter(adapter);

        listKegiatan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(ListActivity.this, "ID" +position + "\n Nama Kegiatan :"
                        + kegiatan[position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}