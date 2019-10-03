package com.sharinas.songr.models;

import javax.persistence.*;

@Entity  // tells spring this is a table
public class Song {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    long id;

    @ManyToOne
    Album album;

    String title;
    int songLength;
    int trackNumber;

    public Song() {}

    public Song(Album album, String title, int songLength, int trackNumber) {
        this.album = album;
        this.title = title;
        this.songLength = songLength;
        this.trackNumber = trackNumber;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", album=" + album +
                ", title='" + title + '\'' +
                ", songLength=" + songLength +
                ", trackNumber=" + trackNumber +
                '}';
    }

    public long getId() {
        return id;
    }

    public Album getAlbum() {
        return album;
    }

    public String getTitle() {
        return title;
    }

    public int getSongLength() {
        return songLength;
    }

    public int getTrackNumber() {
        return trackNumber;
    }
}

