package com.example.android.codingpodcasts;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView offHeap = (TextView) findViewById(R.id.offHeap);

        offHeap.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent offHeapIntent = new Intent(MainActivity.this, OffHeapActivity.class);

                startActivity(offHeapIntent);
            }
        });

        TextView codeNewbie = (TextView) findViewById(R.id.codeNewbie);

        codeNewbie.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent codeNewbieIntent = new Intent(MainActivity.this, CodeNewbieActivity.class);

                startActivity(codeNewbieIntent);
            }
        });

        TextView fcc = (TextView) findViewById(R.id.fcc);

        fcc.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent fccIntent = new Intent(MainActivity.this, FccActivity.class);

                startActivity(fccIntent);
            }
        });

        TextView javaPubHouse = (TextView) findViewById(R.id.javaPubHouse);

        javaPubHouse.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent javaPubHouseIntent = new Intent(MainActivity.this, JavaPubHouseActivity.class);

                startActivity(javaPubHouseIntent);
            }
        });

        TextView syntax = (TextView) findViewById(R.id.syntax);

        syntax.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent syntaxIntent = new Intent(MainActivity.this, SyntaxActivity.class);

                startActivity(syntaxIntent);
            }
        });
    }
}
