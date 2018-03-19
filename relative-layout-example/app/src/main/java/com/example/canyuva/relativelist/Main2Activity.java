package com.example.canyuva.relativelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tx = findViewById(R.id.txt);

        Intent intent = getIntent();

        String sehir = intent.getStringExtra("keyList");

        tx.setText(sehir);
    }
}
