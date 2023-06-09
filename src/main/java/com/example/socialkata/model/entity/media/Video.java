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
@Table(name = "videos")
public class Video {

    public Video(User user, String icon, String name) {
        media.setUser(user);
        media.setUrl(icon);
        this.name = name;
    }

    public Video(User user, String icon) {
        media.setUser(user);
        media.setUrl(icon);
    }

    public Video(User user, String icon, String name, String author) {
        media.setUser(user);
        media.setUrl(icon);
        this.name = name;
        this.author = author;
    }

    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @MapsId
    private Media media = new Media(MediaType.VIDEO);

    @Column(name = "name")
    private String name;

    @Column(name = "icon")
    private String icon;

    @Column(name = "author")
    private String author;

    @Column(name = "view")
    private Long view;

    @PrePersist
    private void prePersistFunction() {
        checkConstraints();
    }

    @PreUpdate
    private void preUpdateFunction() {
        checkConstraints();
    }

    private void checkConstraints() {
        if (this.media.getMediaType() != MediaType.VIDEO) {
            throw new ApiRequestException("У экземпляра Media, связанного с Video, " +
                    "поле mediaType должно принимать значение MediaType.Video");
        }
    }

    @Override
    public int hashCode() {
        return id.intValue();
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || (obj instanceof Video &&
                getId().equals(((Video) obj).getId()));
    }
}
