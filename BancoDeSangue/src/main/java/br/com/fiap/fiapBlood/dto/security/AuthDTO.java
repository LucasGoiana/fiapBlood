package br.com.fiap.fiapBlood.dto.security;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthDTO {

    private String username;
    private String password;

}