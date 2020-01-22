package com.sharinas.songr.controllers;

import com.sharinas.songr.models.Album;
import com.sharinas.songr.models.AlbumRepository;
import com.sharinas.songr.models.Song;
import com.sharinas.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class HomeController {

    // == Spring will create the class that implements the interface, that we can then use, behind the scenes.
    // The annotation Autowired magically wires the repo with the database.

    @Autowired // fill in the instance variable for me
    AlbumRepository albumRepository;

    @Autowired // must have these two lines to have song table appear
    SongRepository songRepository;

    @GetMapping("/")
    public String getHome() {
        return "home";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello";
    }

    @GetMapping("/capitalize/{word}")
    // word is coming from the path
    public String capitalizeIt(@PathVariable String word, Model m) {
        m.addAttribute("word", word.toUpperCase());
        return "capitalize";
    }

    @GetMapping("/albums")
    public String getAlbums(Model m) {
        List<Album> allAlbums = albumRepository.findAll();
        m.addAttribute("allAlbums", allAlbums);
        return "albums";
    }

    @PostMapping("/albums")
    public RedirectView addAlbums(String albumTitle, String albumArtist, int songCount, int lengthInSec, String imageUrl) {
        Album alb = new Album(albumTitle, albumArtist, songCount, lengthInSec, imageUrl);
        albumRepository.save(alb);

        return new RedirectView("/albums");
    }

    // view songs
    @GetMapping("/albums/{id}")
    public String getDetailView (@PathVariable long id, Model m) {
        //List<Song> songs = songRepository.findAll();
        m.addAttribute("album", albumRepository.getOne(id));
        //m.addAttribute("songs", songs);
        return "detail";
    }

    // save a song
    // take in the data about a new song, including the ID of the album it belongs to
    @PostMapping("/albums/{id}")
    public RedirectView addSongs(@PathVariable long id, String title, int songLength, int trackNumber) {
        // find the album in the db
        Album album = albumRepository.getOne(id);
        // create the new song & connect the song and the album. sng gives the data to the song constructor.
        Song sng = new Song(album, title, songLength, trackNumber);
        // save the song
        songRepository.save(sng);
        // redirect to somewhere that we can see the song
        //return new RedirectView("/albums/{id}");
        return new RedirectView("/albums/" + id);
    }

//TODO: Add in Bootstrap
//TODO: Add in fragments
//TODO: Add in Nav bar
//TODO: Add in a way to delete an album

//    @PostMapping("/albums/delete") <---------- return to demo code from Oct 2, Code Fellows 401-d6
//    public RedirectView deleteAlbum


}


