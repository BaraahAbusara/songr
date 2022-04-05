package com.example.songr.web;

import com.example.songr.domain.Album;
import com.example.songr.domain.Song;
import com.example.songr.infrastructure.RepoAlbum;
import com.example.songr.infrastructure.RepoSong;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;


@Controller
public class HelloController {

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/hello")
    public void hello (@RequestParam(name="name", required = false , defaultValue = "there") String name , Model model){
        model.addAttribute("name",name);
    }

    @GetMapping("/capitalize")   // adding name as a query (capitalize?name=anyName)
    public String capitalizeQuery(@RequestParam(name="name") String name , Model model){

        name = name.toUpperCase();
        model.addAttribute("name",name);
        return "capitalize" ;
    }

    @GetMapping("/capitalize/{name}") //adding name as a variable (capitalize/anyName)
    public String capitalize(@PathVariable(name="name") String name , Model model){
        System.out.println("we are in capitalize , name ->"+name);
        name = name.toUpperCase();
        model.addAttribute("name",name);
        return "capitalize" ;
    }






}
