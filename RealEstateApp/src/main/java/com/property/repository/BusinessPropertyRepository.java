package com.property.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.property.modules.BusinessProperty;

@Transactional
@Repository
public interface BusinessPropertyRepository extends JpaRepository<BusinessProperty, String> {
	List<BusinessProperty> findBytype(String type);

	List<BusinessProperty> findByownername(String ownername);

}
