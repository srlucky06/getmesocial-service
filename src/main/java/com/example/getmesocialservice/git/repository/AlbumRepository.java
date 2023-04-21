package com.example.getmesocialservice.git.repository;

import com.example.getmesocialservice.git.model.Album;
import com.example.getmesocialservice.git.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AlbumRepository extends MongoRepository<Album, String>{

        List<Album> findAllByAlbumId(String albumId);
    }


