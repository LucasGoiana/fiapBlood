package br.com.fiap.fiapBlood.controller;

import br.com.fiap.fiapBlood.dto.security.AuthDTO;
import br.com.fiap.fiapBlood.dto.security.CreateUserDTO;
import br.com.fiap.fiapBlood.dto.security.JwtDTO;
import br.com.fiap.fiapBlood.dto.security.UserDTO;
import br.com.fiap.fiapBlood.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @ApiOperation(value = "Cria usuario", notes = "Este endpoint cria usuarios")
    @PostMapping(value = "/",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO create(@RequestBody CreateUserDTO createUserDTO){
        return userService.create(createUserDTO);
    }

    @ApiOperation(value = "Autenticacao", notes = "Este endpoint realiza o login do usuario")
    @PostMapping(value = "auth", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public JwtDTO auth(@RequestBody AuthDTO authDTO){
        return userService.login(authDTO);
    }

}