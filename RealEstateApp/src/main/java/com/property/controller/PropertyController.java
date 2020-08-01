package com.property.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.property.modules.Users;

@RestController
public class PropertyController {

	@Autowired
	private com.property.service.UserService userService;

	@Autowired
	HttpServletRequest request;

	@GetMapping("/")
	public String accessAll() {
		Principal principal = request.getUserPrincipal();
		return "Welcome" + "" +  "" + "" +principal.getName();
	}

	@PostMapping("/add")
	public String addUsers(@RequestBody Users user) {
		return userService.addUsers(user);
	}

	@GetMapping("/delete/{id}")
	public String addUsers(@PathVariable Integer id) {
		return userService.DeleteUserById(id);
	}

	@GetMapping("/all/users")
	public List<Users> findAllUsers() {
		return userService.findAllUsers();
	}

}
