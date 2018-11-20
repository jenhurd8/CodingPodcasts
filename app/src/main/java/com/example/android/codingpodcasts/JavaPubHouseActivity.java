package com.example.android.codingpodcasts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class JavaPubHouseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast_list);

        //ArrayList of podcasts
        ArrayList<Podcast> podcasts = new ArrayList<Podcast>();
        podcasts.add(new Podcast("Episode 77. Sql or NoSql, To Normalize or to Not Normalize... that (STILL) is the question", "October 22, 2018"));
        podcasts.add(new Podcast("Episode 76. Tick...tock...Time to upgrade to Java 11!", "October 3, 2018"));
        podcasts.add(new Podcast("Episode 75. Let's get coding with Kotlin!", "August 29, 2018"));
        podcasts.add(new Podcast("Episode 74. Unit and...Integration Tests, JaCoCo, Docker and Coverage (and more!)", "July 10, 2018"));
        podcasts.add(new Podcast("Episode 73. Spring Boot 2.0 is out! Hear all about it with Greg Turnquist", "June 03, 2018"));
        podcasts.add(new Podcast("Episode 72. A very deep dive on Var, and unmodifiable collections with Stuart Marks (@stuartmarks) himself!", "April 29, 2018"));
        podcasts.add(new Podcast("Episode 71. Jigsaw part II, and Java 10 Highlights!", "March 24, 2018"));
        podcasts.add(new Podcast("Episode 70. Let's put puzzles together. Using Java 9's Jigsaw!", "February 12, 2018"));

        PodcastAdapter adapter = new PodcastAdapter(this, podcasts);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}