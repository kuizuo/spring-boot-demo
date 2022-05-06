package com.kuizuo.demo.repository;

import com.kuizuo.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<User, Long> , JpaSpecificationExecutor<User> {
    User findByUsername(String username);
}
