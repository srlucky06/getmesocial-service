package com.example.getmesocialservice.git.resource;

import com.example.getmesocialservice.git.model.Photo;
import com.example.getmesocialservice.git.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/photos")
    public class PhotoResource {
    @Autowired
    private PhotoService photoService;

    @PostMapping("/photo")
    public Photo savePhoto(@RequestBody Photo photo){
        return photoService.savePhoto(photo);
    }

    @GetMapping("/photo")
    public List<Photo> getAllPhotos(){
        return photoService.getAllPhotos();
    }
    @GetMapping("/find")
    public List<Photo> getById(@RequestParam (name="id") String id){
        return photoService.getById(id);
    }
    @PutMapping
    public Photo updatePhoto(@RequestBody Photo photo){
        return photoService.updatePhoto(photo);
    }
    @DeleteMapping
    public void deletePhoto(@RequestParam(name="id") String id){
        photoService.deletePhoto(id);
    }



}
