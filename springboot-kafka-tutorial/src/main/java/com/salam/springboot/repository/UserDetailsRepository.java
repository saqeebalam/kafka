package com.salam.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salam.springboot.entity.UserData;

public interface UserDetailsRepository extends JpaRepository<UserData, Long> {

}
