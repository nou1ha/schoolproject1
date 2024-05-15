package com.shcoolmanagement.shcoolmanagement.repository;

import com.shcoolmanagement.shcoolmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
