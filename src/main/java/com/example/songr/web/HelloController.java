package com.example.songr.web;

import com.example.songr.domain.Album;
import com.example.songr.infrastructure.RepoAlbum;
import com.example.songr.infrastructure.RepoSong;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloController {
    private final RepoAlbum repoAlbum ;
    private final RepoSong repoSong ;

    public HelloController(RepoAlbum repoAlbum, RepoSong repoSong) {
        this.repoAlbum = repoAlbum;
        this.repoSong = repoSong;
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/hello")
    void hello (@RequestParam(name="name", required = false , defaultValue = "there") String name , Model model){
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

//    @Autowired
//    RepoAlbum repoAlbum ;

//    @ResponseBody
//    @GetMapping("/addalbumtest") //worked
//    Album album(){
//        Album album =new Album("title1","artist1",303,3.05,"");
//        repoAlbum.save(album);
//        return album ;
//    }

//    @ResponseBody
//    @GetMapping("/albums")
//    List<Album> createAlbum () {
//        List<Album> albums =new ArrayList<>();
//        albums.add(new Album("title1","artist1",303,3.05,"aya"));
//        albums.add(new Album("title2","artist2",202,2.05,""));
//        Album album= new Album("title3","artist3",101,1.05,"aya");
//
//        repoAlbum.saveAll(albums);
//
//        return albums;
//    }

//    @GetMapping("/getalbum")
//    public String getAlbum(Model model){
//        model.addAttribute("albums" , repoAlbum.findAll());
//        return "album";
//    }
//
//    @PostMapping("/addalbum")
//    public RedirectView addAlbum(@ModelAttribute Album newAlbum){
//        repoAlbum.save(newAlbum);
//        return new RedirectView("/allalbums");
//    }
//
//    @GetMapping("/allalbums")
//    public String allAlbums(Model model){
//        model.addAttribute("albumsList",repoAlbum.findAll());
//        return "album";
//    }

    @ResponseBody
    @PostMapping("/Albums")
    Album createNewAlbum(@RequestBody Album album){
        return repoAlbum.save(album);
    }

}
