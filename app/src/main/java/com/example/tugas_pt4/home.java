package com.example.tugas_pt4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        TextView getusername = findViewById(R.id.username1);
        String username = getIntent().getExtras().getString("user");
        getusername.setText(username);
    }
}