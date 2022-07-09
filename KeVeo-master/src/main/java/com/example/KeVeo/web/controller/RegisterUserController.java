package com.example.KeVeo.web.controller;

import com.example.KeVeo.dto.RegisterUserDTO;
import com.example.KeVeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterUserController {

   private UserService userService;

    //Aquí, en vez de esta linea es mejor utilizar @Autowired
    public  RegisterUserController(UserService userService){this.userService=userService;}


    @ModelAttribute("user")
    public RegisterUserDTO returnNewUserDTO() {

        return new RegisterUserDTO();

    }

    @GetMapping
    public String viewFormUser() {

            return "register";

    }

    @PostMapping
    public String registerAccountUser(@ModelAttribute("user") RegisterUserDTO registerUserDTO){

        userService.save(registerUserDTO);

        return "redirect:/register?successful";
    }

}
