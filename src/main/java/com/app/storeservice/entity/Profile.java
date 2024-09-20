package com.app.storeservice.entity;

import java.util.Date;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;
import lombok.experimental.FieldDefaults;

// Su dung sau chua can
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "profile")
@Entity
public class Profile {

    @Id
    String userId;

    String avatar;

    String work;

    String about;

    // chua can den
    //    @Column(name = "interests", columnDefinition = "text[]")
    //    @Type(ListArrayType.class)
    //    private List<String> interests;

    Integer status;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    User user;

    String extraData;

    Long version;

    Date createdAt;

    String createdBy;

    Date updatedAt;

    String updatedBy;
}
