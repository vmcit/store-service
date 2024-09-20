package com.app.storeservice.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class InvalidatedToken {
    @Id
    String id;

    Date expiryTime;

    // chua can thiet

    //    private Date createdAt;
    //
    //    private String createdBy;
    //
    //    private Date updatedAt;
    //
    //    private String updatedBy;
}
