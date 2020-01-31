package com.viva.repository;

import com.viva.entity.OnlineUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OnlineUserRepository extends CrudRepository <OnlineUser , String> {
    //Optional<OnlineUser> findById(String name);
}
