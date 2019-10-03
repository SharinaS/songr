package com.sharinas.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;

// It creates the class that implements this interface, then gives you an instance of the class
public interface SongRepository extends JpaRepository<Song, Long> {

}
