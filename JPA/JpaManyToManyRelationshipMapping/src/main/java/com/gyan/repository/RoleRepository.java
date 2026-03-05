package com.gyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gyan.entity.Roles;

public interface RoleRepository extends JpaRepository<Roles, Integer> {

}
