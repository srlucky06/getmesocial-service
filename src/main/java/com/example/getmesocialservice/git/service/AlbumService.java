package com.example.getmesocialservice.git.service;

import com.example.getmesocialservice.git.model.Album;
import com.example.getmesocialservice.git.model.User;
import com.example.getmesocialservice.git.repository.AlbumRepository;
import com.example.getmesocialservice.git.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Service
    public class AlbumService {

        @Autowired
        private AlbumRepository albumRepository;

        public Album getAlbum() {
            return albumRepository.getAlbum();

        }

        public Album saveAlbum(Album album) {

            return albumRepository.saveAlbum(album);
        }

        public List<Album> getAllAlbums() {
            return albumRepository.getAllAlbums();
        }

        public Album getAlbumById(int albumId) {
            return albumRepository.getAlbumById(albumId);
    }

    public Album updateAlbum(int albumId, Album album) {
            return albumRepository.updateAlbum(albumId, album);
    }

    public Album deleteAlbum(int albumId) {
            return albumRepository.deleteAlbum(albumId);
    }
}
