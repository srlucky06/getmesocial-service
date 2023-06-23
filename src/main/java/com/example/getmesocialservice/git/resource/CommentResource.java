package com.example.getmesocialservice.git.resource;

import com.example.getmesocialservice.git.exception.RestrictedInfoException;
import com.example.getmesocialservice.git.model.Album;
import com.example.getmesocialservice.git.model.Comment;
import com.example.getmesocialservice.git.service.CommentService;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentResource {
    @Autowired
    private CommentService commentService;

    @PostMapping("/comment")
    public Comment saveComment(@RequestBody @Valid Comment comment){
        return commentService.saveComment(comment);
    }

    @GetMapping
    public List<Comment> getAllComments(){
        return commentService.getAllComments();
    }

   @GetMapping("/find")
   public List<Comment>getById(@RequestParam(name="id") String id){
        return commentService.getById(id);
   }
    @GetMapping("/find-by-createdBy")
    public List<Comment> getByCreatedBy(@RequestParam("createdBy") String createdBy) throws RestrictedInfoException {
        if  (!createdBy.matches("^[a-z0-9]+$")){
            throw new RestrictedInfoException();
        }
        return commentService.getByCreatedBy(createdBy);

    }
   @PutMapping
    public Comment updateComment(@RequestBody Comment comment) {
       return commentService.updateComment(comment);
   }
   @DeleteMapping
    public void  deleteComment(@RequestParam (name="id") String id){
        commentService.deleteComment(id);
   }

}
