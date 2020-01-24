package com.sharinas.songr.models;

import javax.persistence.*;
import java.util.List;


@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    // annotate that this is a relationship
    // Choose one to many b/c: this(contextual this) and then to that
    // the string specifies the instance variable of the other class
    @OneToMany(mappedBy = "album")
    List<Song> songs;

    protected String title;
    protected String artist;
    protected int songCount;
    protected int lengthInSec;
    protected String imageUrl;


    // basic constructor
    public Album() {}

    // constructor
    public Album (String title, String artist, int songCount, int lengthInSec, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSec = lengthInSec;
        this.imageUrl = imageUrl;
    }

    public String toString() {
        return String.format("Album: %s, Artist: %s, Song Number: %s, Song Length: %s",
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

    public long getId() {
        return id;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getLengthInSec() {
        return lengthInSec;
    }
}
