package br.com.fiap.fiapBlood.controller;

import br.com.fiap.fiapBlood.dto.security.AuthDTO;
import br.com.fiap.fiapBlood.dto.security.CreateUserDTO;
import br.com.fiap.fiapBlood.dto.security.JwtDTO;
import br.com.fiap.fiapBlood.dto.security.UserDTO;
import br.com.fiap.fiapBlood.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO create(@RequestBody CreateUserDTO createUserDTO){
        return userService.create(createUserDTO);
    }

    @PostMapping("auth")
    public JwtDTO auth(@RequestBody AuthDTO authDTO){
        return userService.login(authDTO);
    }

}