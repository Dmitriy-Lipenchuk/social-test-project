package com.example.socialkata.model.entity.comment;

import com.example.socialkata.exception.ApiRequestException;
import com.example.socialkata.model.entity.post.Post;
import com.example.socialkata.model.entity.user.User;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "post_comment")
public class PostComment {

    public PostComment(String text, User user) {
        comment.setComment(text);
        comment.setUser(user);
    }

    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId
    private Comment comment = new Comment(CommentType.POST);


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "post_id")
    private Post post;

    @PrePersist
    private void prePersistFunction() {
        checkConstraints();
    }

    @PreUpdate
    private void preUpdateFunction() {
        checkConstraints();
    }

    private void checkConstraints() {
        if (this.comment.getCommentType() != CommentType.POST) {
            throw new ApiRequestException("У экземпляра Comment, связанного с Post, " +
                    "поле commentType должно принимать значение CommentType.Post");
        }
    }
}
