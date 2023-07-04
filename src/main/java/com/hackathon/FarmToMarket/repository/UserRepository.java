package com.hackathon.FarmToMarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.FarmToMarket.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
