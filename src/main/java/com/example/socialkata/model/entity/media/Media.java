package com.example.socialkata.model.entity.media;


import com.example.socialkata.model.entity.album.Album;
import com.example.socialkata.model.entity.user.User;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "media")
public class Media {

    public Media(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    @Id
    @GeneratedValue(generator = "media_seq")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    @NotNull
    private String url;

    @Enumerated
    @NotNull
    private MediaType mediaType;

    @Column(name = "persist_date", nullable = false, updatable = false)
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @CreationTimestamp
    private LocalDateTime persistDateTime;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;
}

