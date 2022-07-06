package com.example.socialkata.model.entity.like;

import com.example.socialkata.exception.ApiRequestException;
import com.example.socialkata.model.entity.chat.Message;
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
@Table(name = "message_like")
public class MessageLike {

    public MessageLike(User user) {
        like.setUser(user);
    }

    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @MapsId
    private Like like = new Like(LikeType.MESSAGE);

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "message_id")
    private Message message;

    @PrePersist
    private void prePersistFunction() {
        checkConstraints();
    }

    @PreUpdate
    private void preUpdateFunction() {
        checkConstraints();
    }

    private void checkConstraints() {
        if (this.like.getLikeType() != LikeType.MESSAGE) {
            throw new ApiRequestException("У экземпляра Like, связанного с MessageLike, " +
                    "поле LikeType должно принимать значение LikeType.Message");
        }
    }
}
