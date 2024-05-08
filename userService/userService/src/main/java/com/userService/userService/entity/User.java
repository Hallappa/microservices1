package com.userService.userService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
public class User {
    @Id
   private String id;
    private String name;
    private String emailId;
    private String contact;
    @Transient
    List<Rating> Ratings=new ArrayList<>();

}
