package br.com.fiap.fiapBlood.service;

import br.com.fiap.fiapBlood.dto.security.AuthDTO;
import br.com.fiap.fiapBlood.dto.security.CreateUserDTO;
import br.com.fiap.fiapBlood.dto.security.JwtDTO;
import br.com.fiap.fiapBlood.dto.security.UserDTO;

public interface UserService {

    UserDTO create(CreateUserDTO createUserDTO);
    JwtDTO login(AuthDTO authDTO);

}