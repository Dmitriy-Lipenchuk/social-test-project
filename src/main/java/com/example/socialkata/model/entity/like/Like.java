package com.example.socialkata.model.entity.like;

import com.javamentor.developer.social.platform.models.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder    
@Table(name = "`like`")
public class Like {

    public Like(LikeType likeType) {
        this.likeType =likeType;
    }

    @Id
    @GeneratedValue(generator = "like_seq")
    private Long id;

    @Enumerated
    @NotNull
    private LikeType likeType;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = User.class)
    @JoinColumn(name = "user_id")
    private User user;

}

