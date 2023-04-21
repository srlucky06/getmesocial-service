package com.example.getmesocialservice.git.repository;

import com.example.getmesocialservice.git.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
    List<Comment>  findAllById(String id);
}
