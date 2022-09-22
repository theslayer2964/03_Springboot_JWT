package com.example.jwt.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jwt.common.ERole;
import com.example.jwt.entities.Role;

@Repository
public interface RoleRespository extends JpaRepository<Role, Long>{
	Optional<Role> findByName(ERole name);
}
