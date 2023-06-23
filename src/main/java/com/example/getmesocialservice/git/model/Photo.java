package com.example.getmesocialservice.git.model;

import com.example.getmesocialservice.git.validation.ValidCreator;
import org.springframework.data.annotation.Id;

public class Photo {

    private String id;
    @Id
    private String photoId;
    private String photoUrl;
    @ValidCreator
    private String createdBy;
    private String dateCreated;

    public Photo(String id, String photoId,String photoUrl,String createdBy,String dateCreated) {
        this.id = id;
        this.photoId = photoId;
        this.photoUrl = photoUrl;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPhotoId() {
        return photoId;
    }
    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }
    public String getPhotoUrl() {
        return photoUrl;
    }
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl= photoUrl;
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
