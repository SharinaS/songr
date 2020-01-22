package com.sharinas.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRespository <Type, IDentifier Type>
// This interface is a repository that has the job of interacting with the database.
public interface AlbumRepository extends JpaRepository<Album, Long> { }
