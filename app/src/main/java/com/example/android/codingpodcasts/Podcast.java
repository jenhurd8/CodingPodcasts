package com.example.android.codingpodcasts;

public class Podcast {

    /***single podcast title**/
    private String mTitle;

    /**Create a podcast object**/

    public Podcast(String title){
        mTitle = title;
    }

    public String getTitle(){
        return mTitle;
    }
}
