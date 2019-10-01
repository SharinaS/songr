package com.sharinas.songr;

public class Album {
    String title;
    String artist;
    int songCount;
    int lengthInSec;
    String imageUrl;

    public Album (String title, String artist, int songCount, int lengthInSec, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSec = lengthInSec;
        this.imageUrl = imageUrl;
    }

    public String toString() {
        return String.format("%s by %s has %s songs. The album is %s seconds long. %s", this.title, this.artist, this.songCount, this.lengthInSec, this.imageUrl);
    }

}
