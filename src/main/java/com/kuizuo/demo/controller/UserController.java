package com.kuizuo.demo.controller;

import com.kuizuo.demo.domain.User;
import com.kuizuo.demo.service.UserService;
import com.kuizuo.demo.service.dto.UserDto;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    @GetMapping("list")
    public List<User> list() {
        return userService.findAll();
    }

    @GetMapping("{id}")
    public UserDto user(@PathVariable(name = "id") Long id) {
        return userService.findOne(id);
    }

//    @PostMapping()
//    public User create(@RequestParam Map<String, String> map) {
//        User user = userRepository.save(new User(map.get("username"),map.get("password"),map.get("email")));
//        return user;
//    }

//    // 就必须使用json格式
//    @PostMapping()
//    public User create(@RequestBody User body) {
//        User save = userService.save(body);
//        return save;
//    }

}
