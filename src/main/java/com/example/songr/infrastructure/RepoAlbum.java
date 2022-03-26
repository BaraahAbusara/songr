package com.example.songr.infrastructure;

import com.example.songr.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoAlbum extends JpaRepository<Album,Integer> {

}
