package com.example.songr.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@RequiredArgsConstructor


public class Album {
    private String title;
    private String artist;
    private String imageURL;
    private double length ;

    @OneToMany(mappedBy = "album")
    List<Song> songsList ;


    private double length ;

    @Id
    @GeneratedValue
    private int id ;

    private int songCount;


}
