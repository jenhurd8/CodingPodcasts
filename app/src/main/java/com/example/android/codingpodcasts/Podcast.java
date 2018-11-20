package com.example.android.codingpodcasts;

public class Podcast {

    /***single podcast title**/
    private String mTitle;
    private String mDate;

    /**Create a podcast object**/

    public Podcast(String title, String date){
        mTitle = title;
        mDate = date;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getDate(){
        return mDate;
    }
}
