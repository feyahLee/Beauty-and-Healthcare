package mara.beautyandhealthcare.controller;

import lombok.RequiredArgsConstructor;
import mara.beautyandhealthcare.entity.Comment;
import mara.beautyandhealthcare.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentRepository commentRepository;

    @GetMapping("/comments") //acesta e un API
    @CrossOrigin(origins = "*")
    public List<Comment> getComments(){
        return commentRepository.getComments();
    }

    @PostMapping("/comments")
    @CrossOrigin(origins = "*")
    public Comment postComment(@RequestBody Comment comment) {
        return commentRepository.save(new Comment(null, comment.getName(), comment.getText(), comment.getDate(), comment.getRating()));
       // return comment;
    }
}
