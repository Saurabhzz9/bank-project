package com.bank.authentication.controller;

import com.bank.authentication.user.User;
import com.bank.authentication.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/email/{email}")
    public User getUserByEmail(@PathVariable("email") String email) {
        return userRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("user does not exist."));
    }
}
