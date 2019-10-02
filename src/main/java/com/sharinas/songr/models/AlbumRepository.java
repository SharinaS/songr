package com.sharinas.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRespository <Type, IDentifier Type
public interface AlbumRepository extends JpaRepository<Album, Long> { }
