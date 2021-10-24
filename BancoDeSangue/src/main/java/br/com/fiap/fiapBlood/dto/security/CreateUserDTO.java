package br.com.fiap.fiapBlood.dto.security;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserDTO {

    @ApiModelProperty(example = "profeduardo.galego@fiap.com.br")
    private String username;

    @ApiModelProperty(example = "123456")
    private String password;


}