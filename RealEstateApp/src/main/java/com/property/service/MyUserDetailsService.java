package com.property.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	com.property.repository.UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		com.property.modules.Users user = userRepository.findByUsername(userName);
		if (user == null) {
			throw new UsernameNotFoundException("UserName is not found" + userName);
		}
		return new com.property.modules.MyUserDetails(user);
	}

}