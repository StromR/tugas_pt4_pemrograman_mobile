package com.example.tugas_pt4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button);
        EditText username = findViewById(R.id.username);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = username.getText().toString();

                Intent sendusername = new Intent(MainActivity.this, home.class);
                sendusername.putExtra("user", a);
                startActivity(sendusername);
            }
        });
    }
}