package com.heysanjeet.application.service;

import com.heysanjeet.application.domain.UserInfo;
import com.heysanjeet.application.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserInfo saveUser(UserInfo userInfo) {
        return userRepository.save(userInfo);
    }

    @Override
    public UserInfo getUserById(Integer userId) {
        Optional<UserInfo> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<UserInfo> getAllUsers() {
        List<UserInfo> allUser = userRepository.findAll();
        return allUser;
    }


    public UserInfo updateUser(UserInfo userInfo) {
        UserInfo existingUser = userRepository.findById(userInfo.getUserId()).get();
        existingUser.setUsername(userInfo.getUsername());
        existingUser.setUserEmailId(userInfo.getUserEmailId());
        existingUser.setUserPassword(userInfo.getUserPassword());
        UserInfo updatedUser = userRepository.save(existingUser);
        return updatedUser;
    }


    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);

    }
}
