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

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class HelloController {
<<<<<<< HEAD

=======
>>>>>>> eaa0f1c341ee2ca025a00c7277d56187e214ad75
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


<<<<<<< HEAD
=======

//    @ResponseBody
//    @GetMapping("/addalbumtest") //worked
//    Album album(){
//        Album album =new Album("title1","artist1",303,3.05,"");
//        repoAlbum.save(album);
//        return album ;
//    }
>>>>>>> eaa0f1c341ee2ca025a00c7277d56187e214ad75




<<<<<<< HEAD
=======
    @ResponseBody
    @PostMapping("/albums")
    Album createNewAlbum(@RequestBody Album album){
        return repoAlbum.save(album);
    }

    @ResponseBody
    @GetMapping("/albums")
    List<Album> getAllAlbums() {
        return repoAlbum.findAll();
    }

    @ResponseBody
    @PostMapping("/albums/{id}")
    Song addNewSongToAlbum (@RequestBody  Song song , @PathVariable Integer id){
        Album album = repoAlbum.findById(id).orElseThrow();
        song.setAlbum(album);
        return repoSong.save(song);
    }

    @PostMapping("/addsong")
    public RedirectView addSong(@ModelAttribute Song newSong){
        repoSong.save(newSong);
        return new RedirectView("/allsongs");
    }

    @GetMapping("/allsongs")
    public String allSongs(Model model){
        model.addAttribute("songsList",repoSong.findAll());
        return "song";
    }

    @ResponseBody
    @PostMapping("/songs")
    Song showAllSongs(@RequestBody Song song){
        return repoSong.save(song);
    }
    @ResponseBody
    @GetMapping("/songs")
    List<Song> getAllSongs() {
        return repoSong.findAll();

    }
>>>>>>> eaa0f1c341ee2ca025a00c7277d56187e214ad75
}
