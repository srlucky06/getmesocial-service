package com.example.getmesocialservice.git.service;

import com.example.getmesocialservice.git.model.Album;
import com.example.getmesocialservice.git.model.User;
import com.example.getmesocialservice.git.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
    public class AlbumService {

        @Autowired
        private AlbumRepository albumRepository;


        public Album saveAlbum(Album album) {

            return albumRepository.save(album);
        }
        /*public Album getAlbum() {
        return albumRepository.getAlbum();

    }
*/

    public List<Album> getAllAlbums() {
            return albumRepository.findAll();
        }
    public Album updateAlbum( Album album) {
        return albumRepository.save(album);
    }
    public void deleteAlbum(String albumId) {
         albumRepository.deleteById(albumId);
    }
    public List<Album>  getByAlbumId(String albumId) {
            return albumRepository.findAllByAlbumId(albumId);
    }
    public List<Album> getByCreatedBy(String createdBy) {
        return  albumRepository.findByCreatedBy(createdBy);
    }
    public List<Album> getByName(String name) {
        return albumRepository.findByName(name);
    }
}
