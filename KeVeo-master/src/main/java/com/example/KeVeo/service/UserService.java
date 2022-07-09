package com.example.KeVeo.service;

import com.example.KeVeo.data.entity.User;
import com.example.KeVeo.dto.RegisterUserDTO;

public interface UserService {

    User save(RegisterUserDTO registroDTO);
}
