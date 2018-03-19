package com.example.canyuva.relativelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bt = findViewById(R.id.btn);
        EditText yazi = findViewById(R.id.etx);
        ListView list = findViewById(R.id.lv);


        final ArrayList<String> cities = new ArrayList<>();

        cities.add("Ankara");
        cities.add("İstanbul");
        cities.add("Urfa");

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,cities);
        list.setAdapter(adapter);

        bt.setOnClickListener(v->{
            if(!yazi.getText().toString().isEmpty()){
                cities.add(yazi.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

        final Intent intent = new Intent(this,Main2Activity.class);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                intent.putExtra("keyList", cities.get(position));
                intent.putExtra("keyIndex",position + 1);
                startActivity(intent);
            }
        });
    }
}
