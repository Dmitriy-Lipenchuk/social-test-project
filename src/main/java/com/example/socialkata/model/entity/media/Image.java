package com.example.socialkata.model.entity.media;

import com.example.socialkata.exception.ApiRequestException;
import com.example.socialkata.model.entity.user.User;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "images")
public class Image {

    public Image(User user, String icon) {
        media.setUser(user);
        media.setUrl(icon);
    }

    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @MapsId
    private Media media = new Media(MediaType.IMAGE);

    @Column(name = "description")
    private String description;

    @PreRemove
    private void preRemoveFunction() {
        if(media.getAlbum() != null) {
            media.getAlbum().removeMedia(media);
        }
    }

    @PrePersist
    private void prePersistFunction() {
        checkConstraints();
    }

    @PreUpdate
    private void preUpdateFunction() {
        checkConstraints();
    }

    private void checkConstraints() {
        if (this.media.getMediaType() != MediaType.IMAGE) {
            throw new ApiRequestException("У экземпляра Media, связанного с Image, " +
                    "поле mediaType должно принимать значение MediaType.Image");
        }
    }

    @Override
    public int hashCode() {
        return id.intValue();
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || (obj instanceof Image &&
                getId().equals(((Image) obj).getId()));
    }
}
