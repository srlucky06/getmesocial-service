package com.example.getmesocialservice.git.service;

import com.example.getmesocialservice.git.model.Photo;
import com.example.getmesocialservice.git.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepository photoRepository;
    public Photo savePhoto(Photo photo){
        return photoRepository.save(photo);
    }
    public List<Photo> getAllPhotos(){
        return photoRepository.findAll();
    }
    public Photo updatePhoto(Photo photo ){
        return photoRepository.save(photo);
    }
    public void deletePhoto(String id){
       photoRepository.deleteById(id);
    }
    public List<Photo> getById(String id){
        return photoRepository.findAllById(id);
    }
}
