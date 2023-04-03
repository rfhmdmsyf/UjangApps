package com.example.ujangapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ListenerInterface extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener_interface);

        Button btnpertama = findViewById(R.id.btn_1);
        Button btnkedua = findViewById(R.id.btn_2);

        btnpertama.setOnClickListener(this);
        btnkedua.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String label = ((Button)v).getText().toString();
        Log.i( "Status", label + "Telah ditekan");
    }
}