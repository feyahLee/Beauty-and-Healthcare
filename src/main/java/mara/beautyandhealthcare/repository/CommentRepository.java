package mara.beautyandhealthcare.repository;

import mara.beautyandhealthcare.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM comment ORDER BY date DESC")
    List<Comment> getComments();

}
