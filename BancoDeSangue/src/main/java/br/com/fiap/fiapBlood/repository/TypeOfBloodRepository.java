package br.com.fiap.fiapBlood.repository;


import br.com.fiap.fiapBlood.entity.TypeOfBloodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeOfBloodRepository extends JpaRepository<TypeOfBloodEntity, Long> {
}
