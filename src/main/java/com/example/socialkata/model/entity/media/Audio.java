package com.example.socialkata.model.entity.media;

import com.example.socialkata.exception.ApiRequestException;
import com.example.socialkata.model.entity.user.User;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "audios")
public class Audio {

    public Audio(User user, String icon, String author, String name) {
        media.setUser(user);
        media.setUrl(icon);
        this.author=author;
        this.name=name;
    }

    public Audio(User user, String icon) {
        media.setUser(user);
        media.setUrl(icon);
    }


    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @MapsId
    private Media media = new Media(MediaType.AUDIO);

    @Column(name = "icon")
    private String icon;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "album")
    private String album;

    @Column
    private Integer length;

    @ManyToMany(mappedBy = "audios")
    private Set<User> users;

    @ManyToMany(mappedBy = "playlistContent")
    private Set<Playlist> playlists;

    @Column(name = "listening")
    private Integer listening = 0;

    @PrePersist
    private void prePersistFunction() {
        checkConstraints();
    }

    @PreUpdate
    private void preUpdateFunction() {
        checkConstraints();
    }

    private void checkConstraints() {
        if (this.media.getMediaType() != MediaType.AUDIO) {
            throw new ApiRequestException("У экземпляра Media, связанного с Audio, " +
                    "поле mediaType должно принимать значение MediaType.Audio");
        }
    }

    @Override
    public int hashCode() {
        return id.intValue();
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || (obj instanceof Audio &&
                getId().equals(((Audio) obj).getId()));
    }
}
