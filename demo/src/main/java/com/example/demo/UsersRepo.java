package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Users;

public interface UsersRepo extends CrudRepository<Users, Long> {

}
