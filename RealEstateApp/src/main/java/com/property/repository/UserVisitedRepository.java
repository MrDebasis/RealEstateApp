package com.property.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.property.modules.UserVisited;

@Transactional
@Repository
public interface UserVisitedRepository extends JpaRepository<UserVisited, Integer> {

}
