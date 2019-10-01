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
                        "https://upload.wikimedia.org/wikipedia/en/f/f3/Mumfordsonssighnomore.jpg"
                        ),
                new Album (
                        "The Princess",
                        "Parov Stellar",
                        16,
                        2913,
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Parov_Stelar_2017.jpg/800px-Parov_Stelar_2017.jpg"
                ),
                new Album (
                        "Fire Within",
                        "Birdy",
                        11,
                        2623,
                        "https://upload.wikimedia.org/wikipedia/en/a/a3/Birdy_-_Fire_Within.png"
                )
        };
        m.addAttribute("allAlbums", allAlbums);
        return "albums";
    }
}
