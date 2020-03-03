package com.broker.mongodemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.broker.mongodemo.bean.User;
public interface UserRepository extends CrudRepository<User, String>{

}
