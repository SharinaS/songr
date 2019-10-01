package com.sharinas.songr;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlbumTest {

    @Test
    public void testToString() {
        Album testAlbum = new Album (
                "Amazingness Music",
                "Peter Piper",
                4,
                90,
                "https://upload.wikimedia.org/wikipedia/en/a/a3/Birdy_-_Fire_Within.png");
        assertEquals("The album Amazingness Music is by Peter Piper. The album has 4 songs and is 90 seconds long.",
                "The album Amazingness Music is by Peter Piper. The album has 4 songs and is 90 seconds long.",
                testAlbum.toString());
    }

    @Test
    public void testConstructor() {
        Album testAlbum = new Album (
                "Amazingness Music",
                "Peter Piper",
                4,
                90,
                "https://upload.wikimedia.org/wikipedia/en/a/a3/Birdy_-_Fire_Within.png");

        assertEquals("Should expect the title of Amazingness Music",
                "Amazingness Music",
                testAlbum.title);
    }
}