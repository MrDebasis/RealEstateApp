package com.property.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.property.modules.BusinessProperty;
import com.property.service.BusinessPropertyService;

@RestController
@RequestMapping("/properties")
public class BusinessPropertyController {

	@Autowired
	private BusinessPropertyService businessPropertyService;

	@GetMapping("/all")
	public List<BusinessProperty> allProportyDetails() {
		return businessPropertyService.findAllProperty();
	}

	@GetMapping("/filter/{type}")
	public List<BusinessProperty> filterType(@PathVariable String type) {
		List<BusinessProperty> prop = businessPropertyService.filterByType(type);
		return prop;
	}

	@GetMapping("/name/{name}")
	public List<BusinessProperty> filterByName(@PathVariable String name) {
		List<BusinessProperty> prop = businessPropertyService.filterByOwnerName(name);
		return prop;
	}

}
