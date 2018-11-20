package com.example.android.codingpodcasts;

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
