package com.example.android.codingpodcasts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FccActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast_list);

        //ArrayList of podcasts
        ArrayList<Podcast> podcasts = new ArrayList<Podcast>();
        podcasts.add(new Podcast("Ep. 51: Erica Peterson, founder, entrepreneur, and mother", "Oct 29, 2018"));
        podcasts.add(new Podcast("Ep 50 - Sacha Greif, designer, developer, and open source creator", "Oct 9, 2018"));
        podcasts.add(new Podcast("Ep 49 - Lyle Troxell, software engineer at Netflix and radio show host", "Oct 1, 2018"));
        podcasts.add(new Podcast("Ep 48 - Ali Spittel, creator of Zen of Programming", "Sep 23, 2018"));
        podcasts.add(new Podcast("Ep. 47 - Laurence Bradford - interview with the creator of LearnToCodeWith.me", "Sep 17, 2018"));
        podcasts.add(new Podcast("Ep. 46 - Alexander Kallaway - Interview with the creator of 100DaysOfCode", "Sep 10, 2018"));
        podcasts.add(new Podcast("Ep. 45 - Dropout turned Software Engineer Dylan Israel - developer interview", "Sep 3, 2018"));
        podcasts.add(new Podcast("Ep. 44 - How to land a top-notch tech internship - and tech job - while you're still in school", "Aug 27, 2018"));

        PodcastAdapter adapter = new PodcastAdapter(this, podcasts);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
