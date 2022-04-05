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

<<<<<<< HEAD
    @Setter(value= AccessLevel.NONE)
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
=======
    @OneToMany(mappedBy = "album")
    List<Song> songsList ;


    private double length ;

    @Id
    @GeneratedValue
>>>>>>> eaa0f1c341ee2ca025a00c7277d56187e214ad75
    private int id ;

    private int songCount;

    @OneToMany(mappedBy = "album")
    List<Song> songsList ;

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", length=" + length +
                ", songsList=" + songsList +
                ", id=" + id +
                ", songCount=" + songCount +
                '}';
    }
}
