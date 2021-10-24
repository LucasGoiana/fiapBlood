package br.com.fiap.fiapBlood.dto.security;

import br.com.fiap.fiapBlood.entity.UserEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    private long id;
    private String username;

    public UserDTO(UserEntity usuario) {
        this.id = usuario.getId();
        this.username = usuario.getUsername();
    }

}