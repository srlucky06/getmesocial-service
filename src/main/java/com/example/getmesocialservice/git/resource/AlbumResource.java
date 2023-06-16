package com.example.getmesocialservice.git.resource;

import com.example.getmesocialservice.git.exception.RestrictedInfoException;
import com.example.getmesocialservice.git.model.Album;
import com.example.getmesocialservice.git.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.NoSuchElementException;
import java.util.List;


@RestController
    @RequestMapping("/api/albums")
    public class AlbumResource {
    @Autowired
    private AlbumService albumService;
    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album) {
        return albumService.saveAlbum(album);

    }

    @GetMapping("/album")
    public List<Album> getAllAlbums() {
        return albumService.getAllAlbums();
    }

    @GetMapping("/find-by-name")
    public List<Album> getByName(@RequestParam("name") String name) throws RestrictedInfoException {
        if ( name.length() >= 10)  {
            throw new RestrictedInfoException();
        }
        return albumService.getByName(name);

    }

    @GetMapping("/find-by-createdBy")
    public List<Album> getByCreatedBy(@RequestParam("createdBy") String createdBy) throws RestrictedInfoException {
        if (createdBy.equalsIgnoreCase("^[a-z0-9]+$")){
            throw new RestrictedInfoException();
        }
        return albumService.getByCreatedBy(createdBy);

    }

    @PutMapping
    public Album updateAlbum(@RequestBody Album album) {
        return albumService.updateAlbum(album);

    }
    @DeleteMapping
    public void deleteAlbum(@RequestParam(name="albumId") String albumId){
        albumService.deleteAlbum(albumId);
    }
}