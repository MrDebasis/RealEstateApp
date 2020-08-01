package com.property.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.property.modules.Users;
import com.property.repository.RolesRepository;
import com.property.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private UserRepository userRepository;
	/*
	 * @Autowired private RolesRepository rolesRepository;
	 */

	public String addUsers(Users user) {

		Users dbUser = userRepository.findByemail(user.getEmail());
		System.err.println(dbUser);
		/*
		 * Roles role = rolesRepository.findByname("USER"); Set<Roles> roles =
		 * Stream.of(role).collect(Collectors.toCollection(HashSet::new));
		 */
		if (dbUser != null) {
			if (user.getEmail().equals(dbUser.getEmail())) {
				return user.getUsername() + "" + "" + " Already Register";
			}
		}

		String bCryptpass = bCryptPasswordEncoder.encode(user.getPassword());
		user.setPassword(bCryptpass);

		// user.setRoles(roles);
		userRepository.save(user);

		return "WELCOME" + "" + user.getUsername();
	}

	public List<Users> findAllUsers() {
		return userRepository.findAll();
	}

	public String DeleteUserById(Integer id) {
		userRepository.deleteById(id);
		return "Delete Sucessfully";
	}

}
