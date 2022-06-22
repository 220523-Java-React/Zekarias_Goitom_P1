package com.revature.repository;

import com.revature.repository.UserRepository;
import org.junit.jupiter.api.Test;

public class UserRepositoryTest {
    @Test
    public void testGetAllUsers(){
        UserRepository userRepository = new UserRepository();

        userRepository.getAll();
    }
}
