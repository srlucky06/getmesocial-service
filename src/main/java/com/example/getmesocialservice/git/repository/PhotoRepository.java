package com.example.getmesocialservice.git.repository;

import com.example.getmesocialservice.git.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PhotoRepository extends MongoRepository<Photo, String> {
    List<Photo>  findAllById(String id);
}
