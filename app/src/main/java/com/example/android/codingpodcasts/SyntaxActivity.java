package com.example.android.codingpodcasts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SyntaxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast_list);

        //ArrayList of podcasts
        ArrayList<Podcast> podcasts = new ArrayList<Podcast>();
        podcasts.add(new Podcast("Hasty Treat - How to become well liked at work", "Nov 19th, 2018"));
        podcasts.add(new Podcast("React Hooks", "Nov 14th, 2018"));
        podcasts.add(new Podcast("Hasty Treat - How to become a Sticker Mogul", "Nov 12th, 2018"));
        podcasts.add(new Podcast("Live at JAMstack_conf", "Nov 7th, 2018"));
        podcasts.add(new Podcast("Hasty Treat - Stumped! 03", "Nov 5th, 2018"));
        podcasts.add(new Podcast("Pre-launch Checklist", "Oct 31st, 2018"));
        podcasts.add(new Podcast("Hasty Treat - Old Browsers, Fallbacks and Polyfills - Part 3", "Oct 29th, 2018"));
        podcasts.add(new Podcast("Potluck - Working with designers × Is WordPress Crap? × When to stop working × More", "Oct 26th, 2018"));

        PodcastAdapter adapter = new PodcastAdapter(this, podcasts);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
