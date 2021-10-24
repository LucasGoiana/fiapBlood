package br.com.fiap.fiapBlood.controller;

import br.com.fiap.fiapBlood.dto.security.AuthDTO;
import br.com.fiap.fiapBlood.dto.security.CreateUserDTO;
import br.com.fiap.fiapBlood.dto.security.JwtDTO;
import br.com.fiap.fiapBlood.dto.security.UserDTO;
import br.com.fiap.fiapBlood.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @ApiOperation(value = "Cria usuario", notes = "Este endpoint cria usuarios")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO create(@RequestBody CreateUserDTO createUserDTO){
        return userService.create(createUserDTO);
    }

    @ApiOperation(value = "Autenticacao", notes = "Este endpoint realiza o login do usuario")
    @PostMapping("auth")
    public JwtDTO auth(@RequestBody AuthDTO authDTO){
        return userService.login(authDTO);
    }

}