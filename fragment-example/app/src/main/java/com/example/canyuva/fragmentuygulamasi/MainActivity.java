package com.example.canyuva.fragmentuygulamasi;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Frag3.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSag = findViewById(R.id.btnSag);
        Button btnSol = findViewById(R.id.btnSol);

        ImageView img = findViewById(R.id.imageView);

        final Frag1 f1 = new Frag1();
        final Frag3 f3 = new Frag3();

        assert btnSag != null;
        btnSag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.relativeFragmentArea, f1);
                fragmentTransaction.commit();
            }
        });

        assert btnSol != null;
        btnSol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.relativeFragmentArea, f3);
                fragmentTransaction.commit();
            }
        });


    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
