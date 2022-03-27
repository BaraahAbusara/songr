package com.example.songr.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Song {

    @Setter(value= AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id ;

    @NonNull
    private String title ;

    @ManyToOne
    private Album album ;


    private double length ;
    private int trackNumber;


}
