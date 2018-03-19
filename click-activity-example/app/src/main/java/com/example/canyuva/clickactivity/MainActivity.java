package com.example.canyuva.clickactivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    boolean tektik = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.buton1);
        ImageView img = findViewById(R.id.resim);
        final TextView tv = findViewById(R.id.yazi);
        final Intent wb = new Intent(Intent.ACTION_VIEW, Uri.parse("http://github.com/canyuva"));
        Intent digerActivity = new Intent(getApplication(),Main2Activity.class);
        EditText yazial = findViewById(R.id.yaziyaz);



        findViewById(R.id.btact).setOnClickListener(v->{
            digerActivity.putExtra("yazi",yazial.getText().toString());
            startActivity(digerActivity);
        });


         img.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                startActivity(wb);
             }
         });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tektik){
                    tv.setTextColor(Color.BLUE);
                    tv.setText("Selamun aleyküm");
                    tektik = true;
                }else if (tektik){
                    tv.setTextColor(Color.RED);
                    tv.setText("Aleykum selam");
                    tektik = false;
                }
            }
        });
    }


}
