package com.property.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.property.modules.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {
	public Roles findByname(String name);

}
