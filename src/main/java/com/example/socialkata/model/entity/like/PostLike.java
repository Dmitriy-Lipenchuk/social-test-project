package com.example.socialkata.model.entity.like;


import com.example.socialkata.exception.ApiRequestException;
import com.example.socialkata.model.entity.post.Post;
import com.example.socialkata.model.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "post_like")
public class PostLike {

    public PostLike(User user) {
        like.setUser(user);
    }

    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = { CascadeType.REMOVE }, optional = false)
    @MapsId
    private Like like = new Like(LikeType.POST);

    @ManyToOne(fetch = FetchType.LAZY)
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
        if (this.like.getLikeType() != LikeType.POST) {
            throw new ApiRequestException("У экземпляра Like, связанного с PostLike, " +
                    "поле LikeType должно принимать значение LikeType.Post");

        }
    }
}
