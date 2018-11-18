package com.example.android.codingpodcasts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PodcastAdapter extends ArrayAdapter<Podcast> {

    public PodcastAdapter(Context context, ArrayList<Podcast> podcasts) {
        super(context, 0, podcasts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Podcast currentPodcast = getItem(position);

        TextView podcastTextView = (TextView) listItemView.findViewById(R.id.podcast_text_view);
        podcastTextView.setText(currentPodcast.getTitle());

        return listItemView;
    }
}

