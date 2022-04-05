package com.example.songr.web;

import com.example.songr.domain.Album;
import com.example.songr.domain.Song;
import com.example.songr.infrastructure.RepoAlbum;
import com.example.songr.infrastructure.RepoSong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {
    private final RepoAlbum repoAlbum ;
    private final RepoSong repoSong ;

    public AlbumController(RepoAlbum repoAlbum, RepoSong repoSong) {
        this.repoAlbum = repoAlbum;
        this.repoSong = repoSong;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("albumsList",repoAlbum.findAll());
        return "index.html";
    }

    @GetMapping("/addNewAlbum")
    public String getAddNewAlbumForm(){
        return "addAlbum.html";
    }

//    @GetMapping("/albums/{id}/addSong")
//    public String addSongToAlbum(Model model , @PathVariable Integer id){
//        Album album = repoAlbum.findById(id).orElseThrow();
//        model.addAttribute(album);
//        return "addSong.html";
//    }
    @PostMapping("/albums/{id}/addSong")
    public RedirectView addSongToAlbumPost(@ModelAttribute Song song , @PathVariable Integer id , Model model){
        Album album = repoAlbum.findById(id).orElseThrow();
        song.setAlbum(album);
        List<Song> newSongsList = album.getSongsList();
        newSongsList.add(song);
        album.setSongsList(newSongsList);
        album.setSongCount(album.getSongCount()+1);
        album.setLength(album.getLength()+song.getLength());
        repoSong.save(song);


        return new RedirectView ("/albums/{id}");
    }

    @PostMapping("/addNewAlbum")
    public RedirectView addAlbum(@ModelAttribute Album newAlbum ){
        repoAlbum.save(newAlbum);
        return new RedirectView("/");
    }

    @GetMapping("/albums/{id}")
    String viewAlbum ( @PathVariable Integer id , Model model) {
        Album album = repoAlbum.findById(id).orElseThrow();

        model.addAttribute("album",album);
        model.addAttribute("songsList",album.getSongsList());

        return "albumDetails.html";
    }

    @GetMapping("/viewAllSongs")
    public String viewAllSongs(Model model){
        model.addAttribute("songsList",repoSong.findAll());
        return "allSongs.html";
    }



}
