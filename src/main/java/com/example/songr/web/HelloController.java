package com.example.songr.web;

import com.example.songr.domain.Album;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class HelloController {
//    @ResponseStatus(value = HttpStatus.OK)
//    @GetMapping("/hello")
//    void hello (@RequestParam(name="name", required = false , defaultValue = "there") String name , Model model){
//        model.addAttribute("name",name);
//    }
//
//    @GetMapping("/capitalize")   // adding name as a query (capitalize?name=anyName)
//    public String capitalizeQuery(@RequestParam(name="name") String name , Model model){
//
//        name = name.toUpperCase();
//        model.addAttribute("name",name);
//        return "capitalize" ;
//    }
//
//    @GetMapping("/capitalize/{name}") //adding name as a variable (capitalize/anyName)
//    public String capitalize(@PathVariable(name="name") String name , Model model){
//        System.out.println("we are in capitalize , name ->"+name);
//        name = name.toUpperCase();
//        model.addAttribute("name",name);
//        return "capitalize" ;
//    }
//
//    @ResponseBody
//    @GetMapping("/album")
//    Album album(){
//        return new Album("title1","artist1",303,3.05,"");
//    }
//
//    @ResponseBody
//    @GetMapping("/albums")
//    List<Album> getAlbum () {
//        List<Album> albums =new ArrayList<>();
//        albums.add(new Album("title1","artist1",303,3.05,""));
//        albums.add(new Album("title2","artist2",202,2.05,""));
//        albums.add(new Album("title3","artist3",101,1.05,""));
//        return albums;
//    }
}
