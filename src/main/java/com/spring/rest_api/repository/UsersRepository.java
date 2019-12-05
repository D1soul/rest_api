package com.spring.rest_api.repository;

import com.spring.rest_api.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository <User, Long>{
}
