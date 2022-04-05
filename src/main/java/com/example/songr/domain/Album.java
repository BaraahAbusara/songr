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
    @NonNull
    private String title;
    @NonNull
    private String artist;

    private String imageURL;
    private double length ;

    @Setter(value= AccessLevel.NONE)
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
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
