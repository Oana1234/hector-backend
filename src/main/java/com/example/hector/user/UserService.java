package com.example.hector.user;

import java.util.Optional;
import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	    public Optional<User> findById(Long id) {
	        return userRepository.findById(id);
	    }

	    public User save(User user) {
	        return userRepository.save(user);
	    }

	    public void deleteById(Long id) {
	       userRepository.deleteById(id);
	    }
}
