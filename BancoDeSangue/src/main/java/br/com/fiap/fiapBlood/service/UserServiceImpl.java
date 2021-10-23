package br.com.fiap.fiapBlood.service;

import br.com.fiap.fiapBlood.dto.security.AuthDTO;
import br.com.fiap.fiapBlood.dto.security.CreateUserDTO;
import br.com.fiap.fiapBlood.dto.security.JwtDTO;
import br.com.fiap.fiapBlood.dto.security.UserDTO;
import br.com.fiap.fiapBlood.entity.UserEntity;
import br.com.fiap.fiapBlood.repository.UserRepository;
import br.com.fiap.fiapBlood.security.JwtTokenUtil;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserServiceImpl implements UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository usuarioRepository;
    private final AuthenticationManager authenticationManager;
    private final JwtTokenUtil jwtTokenUtil;

    public UserServiceImpl(PasswordEncoder passwordEncoder,
                           UserRepository usuarioRepository,
                           AuthenticationManager authenticationManager,
                           JwtTokenUtil jwtTokenUtil) {
        this.passwordEncoder = passwordEncoder;
        this.usuarioRepository = usuarioRepository;
        this.authenticationManager = authenticationManager;
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    public UserDTO create(CreateUserDTO createUserDTO) {
        UserEntity usuario = new UserEntity();
        usuario.setUsername(createUserDTO.getUsername());
        usuario.setPassword(passwordEncoder.encode(createUserDTO.getPassword()));
        UserEntity usuarioSalvo = usuarioRepository.save(usuario);
        return new UserDTO(usuarioSalvo);
    }

    @Override
    public JwtDTO login(AuthDTO authDTO) {

        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                authDTO.getUsername(),
                authDTO.getPassword()
        );
        try {
            authenticationManager.authenticate(authentication);
        } catch (DisabledException disabledException) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuário desabilitado");
        } catch (BadCredentialsException badCredentialsException) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Credencial inválida");
        }

        String token = jwtTokenUtil.generateToken(authDTO.getUsername());

        JwtDTO jwtDTO = new JwtDTO();
        jwtDTO.setToken(token);

        return jwtDTO;
    }

}