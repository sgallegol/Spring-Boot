package com.pruebanttdata.samir.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebanttdata.samir.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
	

}
