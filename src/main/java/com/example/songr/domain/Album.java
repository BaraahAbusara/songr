package com.example.songr.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Album {
    @NonNull
    private String title;
    @NonNull
    private String artist;

    private String imageURL;
    private double length ;

    @OneToMany(mappedBy = "album")
    private Set<Song> songs ;


    @Setter(value= AccessLevel.NONE)
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id ;

    private int songCount;


}
