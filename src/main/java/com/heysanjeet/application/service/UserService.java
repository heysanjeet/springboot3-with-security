package com.heysanjeet.application.service;

import com.heysanjeet.application.domain.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public UserInfo saveUser(UserInfo userInfo);

    public UserInfo getUserById(Integer userId);

    public List<UserInfo> getAllUsers();

    public UserInfo updateUser(UserInfo userInfo);

    public void deleteUser(Integer userId);
}
