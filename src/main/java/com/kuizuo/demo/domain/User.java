package com.kuizuo.demo.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    @ApiModelProperty(value = "ID", hidden = true)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;
}
