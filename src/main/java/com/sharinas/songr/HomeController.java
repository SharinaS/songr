package com.sharinas.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

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
        Album[] allAlbums = new Album[] {
                new Album (
                        "Sigh No More",
                        "Mumford and Sons",
                        12,
                        2913,
                        "https://en.wikipedia.org/wiki/Sigh_No_More_(Mumford_%26_Sons_album)#/media/File:Mumfordsonssighnomore.jpg"
                        )
        };
        m.addAttribute("allAlbums", allAlbums);
        return "albums";
    }
}
