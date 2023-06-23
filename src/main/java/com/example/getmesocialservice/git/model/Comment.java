package com.example.getmesocialservice.git.model;

import com.example.getmesocialservice.git.validation.ValidCreator;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

public class Comment {

    private String id;
    @Id
    private String photoId;
    @Length(min = 5)
    private String message;
    @ValidCreator
    private String createdBy;
    private String dateCreated;

    public Comment (String id, String photoId,String message,String createdBy,String dateCreated) {
        this.id = id;
        this.photoId = photoId;
        this.message = message;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id= id;
    }
    public String getPhotoId() {
        return photoId;
    }
    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }
    public String getMessage() {return message;}
    public void setMessage(String message) {
        this.message= message;
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


