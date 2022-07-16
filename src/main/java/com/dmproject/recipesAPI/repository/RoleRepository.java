package com.dmproject.recipesAPI.repository;

import com.dmproject.recipesAPI.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {


}

