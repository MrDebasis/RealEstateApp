package com.property.service;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.property.modules.BusinessProperty;
import com.property.modules.UserVisited;
import com.property.repository.BusinessPropertyRepository;
import com.property.repository.UserVisitedRepository;

@Service
public class BusinessPropertyService {

	@Autowired
	private BusinessPropertyRepository businessPropertyRepository;

	@Autowired
	private UserVisitedRepository userVisitedRepository;

	@Autowired
	HttpServletRequest request;

	LocalDateTime localDateTime = LocalDateTime.now();
	java.sql.Date date = java.sql.Date.valueOf(localDateTime.toLocalDate());

	public String currentUserNameSimple(HttpServletRequest request) {
		Principal principal = request.getUserPrincipal();
		return principal.getName();
	}

	public List<BusinessProperty> findAllProperty() {
		Principal principal = request.getUserPrincipal();
		UserVisited userVisited = new UserVisited(principal.getName(), date, "All the propety details");
		userVisitedRepository.save(userVisited);
		List<BusinessProperty> all = businessPropertyRepository.findAll();
		return all;
	}

	public List<BusinessProperty> filterByType(String type) {
		Principal principal = request.getUserPrincipal();
		UserVisited userVisited = new UserVisited(principal.getName(), date, principal.getName() + " Searched By Type");
		userVisitedRepository.save(userVisited);
		return businessPropertyRepository.findBytype(type);
	}

	public List<BusinessProperty> filterByOwnerName(String ownername) {
		List<BusinessProperty> prop = businessPropertyRepository.findByownername(ownername);
		return prop;
	}
}
