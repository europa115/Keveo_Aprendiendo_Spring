package com.example.KeVeo.service;

import com.example.KeVeo.data.entity.Role;
import com.example.KeVeo.data.entity.User;
import com.example.KeVeo.data.repository.RegisterUserRepository;
import com.example.KeVeo.dto.RegisterUserDTO;
import org.springframework.stereotype.Service;
import java.util.Arrays;

@Service
public class UserServiceImpl implements  UserService{

    private RegisterUserRepository registerUserRepository;

    @Override
    public User save(RegisterUserDTO registreDTO) {

        User user=new User(registreDTO.getUserName(), registreDTO.getPassword(), registreDTO.getDate(),true,
                registreDTO.getUserSurname(), registreDTO.getUserEmail(),Arrays.asList((new Role("ROLE_USER"))));

        return null/*registerUserRepository.save(user)*/;
    }

    //Aquí en vez de esta linea es mejor utilizar @Autowired
    public UserServiceImpl(RegisterUserRepository registerUserRepository) {
        this.registerUserRepository = registerUserRepository;
    }
}
