package com.example.android.codingpodcasts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class CodeNewbieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast_list);

        //ArrayList of podcasts
        ArrayList<Podcast> podcasts = new ArrayList<Podcast>();
        podcasts.add(new Podcast("How do I learn design?", "November 19, 2018"));
        podcasts.add(new Podcast("Should you start freelancing?", "November 12, 2018"));
        podcasts.add(new Podcast("Why do I need to test my code?", "November 05, 2018"));
        podcasts.add(new Podcast("What’s it like to code for NASA?", "October 29, 2018"));
        podcasts.add(new Podcast("From librarian to developer", "October 22, 2018"));
        podcasts.add(new Podcast("How do you build a database?", "October 15, 2018"));
        podcasts.add(new Podcast("From musician to developer", "September 24, 2018"));
        podcasts.add(new Podcast("What's an Indie Hacker?", "September 17, 2018"));

        PodcastAdapter adapter = new PodcastAdapter(this, podcasts);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
