package com.example.getmesocialservice.git.resource;

import com.example.getmesocialservice.git.model.Album;
import com.example.getmesocialservice.git.model.User;
import com.example.getmesocialservice.git.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/find")
    public List<Album> getById(@RequestParam(name="albumId") String albumId) {
        return albumService.getByAlbumId(albumId);
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