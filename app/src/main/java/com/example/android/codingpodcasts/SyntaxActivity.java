package com.example.android.codingpodcasts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SyntaxActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast_list);

        //ArrayList of podcasts
        ArrayList<Podcast> podcasts = new ArrayList<Podcast>();
        podcasts.add(new Podcast("test title 1", "Nov 19, 2018"));
        podcasts.add(new Podcast("test title 2", "Nov 19, 2018"));
        podcasts.add(new Podcast("test title 3", "Nov 19, 2018"));
        podcasts.add(new Podcast("test title 4", "Nov 19, 2018"));
        podcasts.add(new Podcast("test title 5", "Nov 19, 2018"));
        podcasts.add(new Podcast("test title 6", "Nov 19, 2018"));
        podcasts.add(new Podcast("test title 7", "Nov 19, 2018"));
        podcasts.add(new Podcast("test title 8", "Nov 19, 2018"));

        PodcastAdapter adapter = new PodcastAdapter(this, podcasts);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
