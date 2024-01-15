package com.heysanjeet.application.domain;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity(name = "UserInfo")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String userEmailId;
    @Column(nullable = false)
    private String userPassword;
}
