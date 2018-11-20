package com.example.android.codingpodcasts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FccActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast_list);

        //ArrayList of podcasts
        ArrayList<Podcast> podcasts = new ArrayList<Podcast>();
        podcasts.add(new Podcast("fcc test title 1"));
        podcasts.add(new Podcast("fcc test title 2"));
        podcasts.add(new Podcast("fcc test title 3"));
        podcasts.add(new Podcast("fcc test title 4"));
        podcasts.add(new Podcast("fcc test title 5"));
        podcasts.add(new Podcast("fcc test title 6"));
        podcasts.add(new Podcast("fcc test title 7"));
        podcasts.add(new Podcast("fcc test title 8"));

        PodcastAdapter adapter = new PodcastAdapter(this, podcasts);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
