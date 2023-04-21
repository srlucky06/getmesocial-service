package com.example.getmesocialservice.git.model;

import org.springframework.data.annotation.Id;

public class Album {
    @Id
    private String albumId;
    private String name;
    private String coverPhotoUrl;
    private String  createdBy;
    private String dateCreated;
public Album(String albumId,String name,String coverPhotoUrl,String createdBy,String dateCreated){
    this.albumId= albumId;
    this.name= name;
    this.coverPhotoUrl= coverPhotoUrl;
    this.createdBy= createdBy;
    this.dateCreated= dateCreated;


}
    public String getAlbumId() {
        return albumId;
    }
    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }
    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl= coverPhotoUrl;
    }
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }


}
