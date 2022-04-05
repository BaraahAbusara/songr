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


public class Album {
    private String title;
    private String artist;
    private String imageURL;
    private double length ;

    @Setter(value= AccessLevel.NONE)
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private int id ;

    @OneToMany(mappedBy = "album")
    List<Song> songsList ;


    private int songCount;


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
