package br.com.fiap.fiapBlood.repository;

import br.com.fiap.fiapBlood.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findFirstByUsername(String username);

}