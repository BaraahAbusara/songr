package com.example.songr.infrastructure;

import com.example.songr.domain.Album;
import com.example.songr.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoSong extends JpaRepository<Song,Long> {
    Album findAllByAlbum(Album album);

}
