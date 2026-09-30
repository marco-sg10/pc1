package com.tuckersoft.pc1.service;

import com.tuckersoft.pc1.dto.response.UserResponseDto;
import com.tuckersoft.pc1.entity.User;
import com.tuckersoft.pc1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService implements UserDetailsService{
    private final UserRepository userRepository;


    public UserResponseDto saveUser(UserResponseDto user) {
        return userRepository.save(user).map(UserResponseDto,User.class);
    }
    public UserResponseDto getUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .map(UserResponseDto,User.class)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));
    }

}
