package com.example.socialkata.model.entity.comment;

import com.example.socialkata.exception.ApiRequestException;
import com.example.socialkata.model.entity.media.Media;
import com.example.socialkata.model.entity.user.User;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "media_comment")
public class MediaComment {

    public MediaComment(String text, User user) {
        comment.setComment(text);
        comment.setUser(user);
    }

    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @MapsId
    private Comment comment = new Comment(CommentType.MEDIA);

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "media_id")
    private Media media;

    @PrePersist
    private void prePersistFunction() {
        checkConstraints();
    }

    @PreUpdate
    private void preUpdateFunction() {
        checkConstraints();
    }

    private void checkConstraints() {
        if (this.comment.getCommentType() != CommentType.MEDIA) {
            throw new ApiRequestException("У экземпляра Comment, связанного с Media, " +
                    "поле commentType должно принимать значение CommentType.Media");
        }
    }
}
