package com.example.getmesocialservice.git.resource;

import com.example.getmesocialservice.git.exception.RestrictedInfoException;
import com.example.getmesocialservice.git.model.Album;
import com.example.getmesocialservice.git.model.Photo;
import com.example.getmesocialservice.git.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/photos")
    public class PhotoResource {
    @Autowired
    private PhotoService photoService;

    @PostMapping("/photo")
    public Photo savePhoto(@RequestBody @Valid Photo photo){
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
    @GetMapping("/find-by-createdBy")
    public List<Photo> getByCreatedBy(@RequestParam("createdBy") String createdBy) throws RestrictedInfoException {
        if  (!createdBy.matches("^[a-z0-9]+$")){
            throw new RestrictedInfoException();
        }
        return photoService.getByCreatedBy(createdBy);

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
