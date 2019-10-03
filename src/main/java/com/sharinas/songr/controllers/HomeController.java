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

    @GetMapping("/albums/{id}")
    public String getDetailView (@PathVariable long id, Model m) {
        m.addAttribute("album", albumRepository.getOne(id));
        List<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "detail";
    }

    // save a song
    @PostMapping("/albums/{id}")
    public RedirectView addSongs(String title, int songLength, int trackNumber, @PathVariable long id) {
        Album album = albumRepository.getOne(id);
        Song sng = new Song(album, title, songLength, trackNumber);
        songRepository.save(sng);
        return new RedirectView("/albums/{id}");
    }



//    @PostMapping("/albums/delete") <---------- return to frontRow 10/2/19 Code Review for deleting
//    public RedirectView deleteAlbum
}


// Album info:
//        Album[] allAlbums = new Album[] {
//                new Album (
//                        "Sigh No More",
//                        "Mumford and Sons",
//                        12,
//                        2913,
//                        "https://upload.wikimedia.org/wikipedia/en/f/f3/Mumfordsonssighnomore.jpg"
//                        ),
//                new Album (
//                        "The Princess",
//                        "Parov Stellar",
//                        16,
//                        2913,
//                        "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Parov_Stelar_2017.jpg/800px-Parov_Stelar_2017.jpg"
//                ),
//                new Album (
//                        "Fire Within",
//                        "Birdy",
//                        11,
//                        2623,
//                        "https://upload.wikimedia.org/wikipedia/en/a/a3/Birdy_-_Fire_Within.png"
//                )
//        };


