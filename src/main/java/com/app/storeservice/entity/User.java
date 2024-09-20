package com.app.storeservice.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    String username;
    String password;
    String email;
    LocalDate dob;
    String fullname;

    Integer type;

    Integer status;

    // dung sau
    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY, optional = false)
    Profile profile;

    String extraData;

    Long version;

    Date createdAt;

    String createdBy;

    Date updatedAt;

    String updatedBy;

    @ManyToMany
    Set<Role> roles;
}
