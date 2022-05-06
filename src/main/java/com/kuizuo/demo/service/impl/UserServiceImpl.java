package com.kuizuo.demo.service.impl;

import com.kuizuo.demo.domain.User;
import com.kuizuo.demo.exception.BadRequestException;
import com.kuizuo.demo.repository.UserRepository;
import com.kuizuo.demo.service.UserService;
import com.kuizuo.demo.service.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserDto findOne(Long id) {
        User user =  userRepository.findById(id).orElseThrow(() -> new BadRequestException("用户不存在"));

        UserDto userDto = modelMapper.map(user, UserDto.class);
        return userDto;
    }

}
