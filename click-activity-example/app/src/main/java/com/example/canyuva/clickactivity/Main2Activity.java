package com.example.canyuva.clickactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView yazi2 = findViewById(R.id.yazi2);
        yazi2.setText(getIntent().getStringExtra("yazi"));
    }
}
