package com.example.socialkata.model.entity.album;



import com.example.socialkata.exception.ApiRequestException;
import com.example.socialkata.model.entity.media.Media;
import com.example.socialkata.model.entity.media.MediaType;
import com.example.socialkata.model.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "albums")
public class Album {

    public Album(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    @Id
    @GeneratedValue(generator = "albums_seq")
    private Long id;

    @NonNull
    private String name;

    private String icon;

    @ManyToOne
    @JoinColumn(name = "user_owner_id")
    private User userOwnerId;

    @Enumerated
    @NotNull
    private MediaType mediaType;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    private Set<Media> mediaSet = new HashSet<>();

    @Column(name = "persist_date", nullable = false)
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @CreationTimestamp
    private LocalDateTime persistDate;

    @Column(name = "update_date")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @UpdateTimestamp
    private LocalDateTime lastRedactionDate;

    public boolean addMedia(Media media){
        if (media.getMediaType() != mediaType) {
            throw new ApiRequestException(String.format(
                    "У экземпляра Album, связанного с %s, " +
                            "поле MediaType должно принимать значение %s",
                    mediaType.name(), mediaType.toString()));
        }
        return mediaSet.add(media);
    }

    public boolean removeMedia(Media media){
        return mediaSet.remove(media);
    }
}
