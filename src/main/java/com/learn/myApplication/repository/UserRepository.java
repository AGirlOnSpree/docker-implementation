package com.learn.myApplication.repository;

import com.learn.myApplication.model.UserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserDetails, Integer> {
}
