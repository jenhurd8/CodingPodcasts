package com.example.android.codingpodcasts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class OffHeapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast_list);

        //ArrayList of podcasts
        ArrayList<Podcast> podcasts = new ArrayList<Podcast>();
        podcasts.add(new Podcast("Episode 38. Of Big Hacks, Jakarta News, Who is running what on the JVM, and (Since is election season) CJUG running for a JCP Seat.", "November 01, 2018"));
        podcasts.add(new Podcast("Episode 37. JDK 11 is out! Java Licensing Model is changing! Linus gives an apology", "October 07, 2018"));
        podcasts.add(new Podcast("Episode 36. Jakarta EE Elections (Make Jakarta Great Again!), IDEs Refresh, and Containers", "September 06, 2018"));
        podcasts.add(new Podcast("Episode 35. A bug in Java 9 and 10? Oh noes, Serializable is out! And now Microsoft took over GitHub. Lastly, EE Spec docs are not being transferred! (Now what?)", "July 15, 2018"));
        podcasts.add(new Podcast("Episode 34. On twitter, IPOs, vulnerabilities, (Java)script name copyrights, and IBMs play on JVM Maintenance", "June 11, 2018"));
        podcasts.add(new Podcast("Episode 33. Oracle vs Google, US Vs Microsoft, and now you can keep your salary a secret", "May 02, 2018"));
        podcasts.add(new Podcast("Episode 32. On #Java10, the next internet bubble and data breaches!", "March 24, 2018"));
        podcasts.add(new Podcast("Episode 31. Welcome to ATLANTA! (DevNexus 2018)", "March 06, 2018"));

        PodcastAdapter adapter = new PodcastAdapter(this, podcasts);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
