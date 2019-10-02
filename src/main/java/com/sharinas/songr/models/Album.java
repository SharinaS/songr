package com.sharinas.songr.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    protected String title;
    protected String artist;
    protected int songCount;
    protected int lengthInSec;
    protected String imageUrl;

    public Album() {}

    public Album (String title, String artist, int songCount, int lengthInSec, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSec = lengthInSec;
        this.imageUrl = imageUrl;
    }

    public String toString() {
        return String.format("The album %s is by %s. The album has %s songs and is %s seconds long.",
                this.title, this.artist, this.songCount, this.lengthInSec);
    }

    // getter
    public String getImageUrl() {
        return this.imageUrl;
    }

     // setter - gives people access to change something
    public void setTitle (String title) {
        this.title = title;
    }


}