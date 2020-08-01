package com.property.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.property.modules.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

	public Users findByUsername(String username);

	@Query("select r from Users r where r.email= :sts")
	public Users findByemail(@Param("sts") String email);

}