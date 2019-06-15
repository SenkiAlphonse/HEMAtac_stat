package com.hematac.fencingstats.service.userhandlingservice;

import com.hematac.fencingstats.repository.userhandlingrepository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
}
