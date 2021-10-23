package br.com.fiap.fiapBlood.dto.security;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserDTO {

    private String username;
    private String password;


}