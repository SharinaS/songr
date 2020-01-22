package com.sharinas.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;

// This interface is a repository that has the job of interacting with the database.
public interface SongRepository extends JpaRepository<Song, Long> {

}
