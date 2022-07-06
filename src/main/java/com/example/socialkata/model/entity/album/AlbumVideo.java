package com.example.socialkata.model.entity.album;

import com.example.socialkata.exception.ApiRequestException;
import com.example.socialkata.model.entity.media.MediaType;
import com.example.socialkata.model.entity.media.Videos;
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
import javax.persistence.JoinTable;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "album_video")
public class AlbumVideo {

    public AlbumVideo(String name, String icon) {
        album.setName(name);
        album.setIcon(icon);
    }

    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @MapsId
    private Album album = new Album(MediaType.VIDEO);

    @OneToMany(fetch = FetchType.LAZY, targetEntity = Videos.class, cascade = {CascadeType.PERSIST})
    @JoinTable(name = "album_has_video", joinColumns = @JoinColumn(name = "album_id"),
            inverseJoinColumns = @JoinColumn(name = "videos_id"))
    private Set<Videos> videos;


    @PrePersist
    private void prePersistFunction() {
        checkConstraints();
    }

    @PreUpdate
    private void preUpdateFunction() {
        checkConstraints();
    }

    private void checkConstraints() {
        if (this.album.getMediaType() != MediaType.VIDEO) {
            throw new ApiRequestException("У экземпляра Album, связанного с VIDEO, " +
                    "поле MediaType должно принимать значение MediaType.VIDEO");
        }
    }

    public Long getId() {
        return id;
    }

    public Album getAlbum() {
        return album;
    }

    public Set<Videos> getVideos() {
        return videos;
    }
}
