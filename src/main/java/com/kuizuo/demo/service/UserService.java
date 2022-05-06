package com.kuizuo.demo.service;

import com.kuizuo.demo.domain.User;
import com.kuizuo.demo.service.dto.UserDto;

import java.util.List;

public interface UserService {
    List<User> findAll();

    UserDto findOne(Long id);
}
