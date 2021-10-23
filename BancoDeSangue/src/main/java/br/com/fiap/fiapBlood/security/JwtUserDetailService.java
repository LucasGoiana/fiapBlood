package br.com.fiap.fiapBlood.security;

import br.com.fiap.fiapBlood.entity.UserEntity;
import br.com.fiap.fiapBlood.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailService implements UserDetailsService {

    private UserRepository usuarioRepository;

    public JwtUserDetailService(UserRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity usuario = usuarioRepository.findFirstByUsername(username);
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuário não encontrado: " + username);
        }
        return new User(
                usuario.getUsername(),
                usuario.getPassword(),
                new ArrayList<>() // Roles
        );
    }

}