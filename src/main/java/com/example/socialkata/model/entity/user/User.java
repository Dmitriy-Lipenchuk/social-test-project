package com.example.socialkata.model.entity.user;


import com.example.socialkata.model.entity.chat.GroupChat;
import com.example.socialkata.model.entity.media.Audio;
import com.example.socialkata.model.entity.media.Video;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;





@ToString
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Proxy(lazy = false)
@Table(name = "users")
public class User implements UserDetails {

    @Id
    @GeneratedValue(generator = "users_seq")
    private Long userId;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    //@NotNull
    private LocalDate dateOfBirth;

    @Column(name = "education")
    private String education;

    @Column
    private String aboutMe;

    @Column(name = "image")
    private String avatar;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "profession")
    private String profession;

    @Column(name = "persist_date", nullable = false, updatable = false)
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @CreationTimestamp
    private LocalDateTime persistDate;

    @Column(name = "last_redaction_date", nullable = false)
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @UpdateTimestamp
    private LocalDateTime lastRedactionDate;

    @Getter(AccessLevel.NONE)
    @Column(name = "is_enable")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean isEnable = false;

    @Column(name = "city")
    private String city;

    @Column(name = "link_site")
    private String linkSite;


    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Role.class)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @Column(name = "status")
    private String status;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Active.class)
    @JoinColumn(name = "active_id", nullable = false)
    private Active active;

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Audio.class)
    @JoinTable(name = "users_audios_collections", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "audio_id"))
    private Set<Audio> audios;

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = Video.class)
    @JoinTable(name = "users_videos_collections", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "video_id"))
    private Set<Video> videos;

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = GroupChat.class)
    @JoinTable(joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_chat_id"))
    private Set<GroupChat> groupChats;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(role);
        return roles;
    }

    @Override
    public String getUsername() {
         return getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return isEnable;
    }
}
