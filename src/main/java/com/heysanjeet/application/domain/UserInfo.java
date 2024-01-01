package com.heysanjeet.application.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class UserInfo {
    private Integer userId;
    private String username;
    private String userEmailId;
    private String userPassword;
}
