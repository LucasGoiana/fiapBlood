package br.com.fiap.fiapBlood.repository;

import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodDTO;
import br.com.fiap.fiapBlood.entity.BankOfBloodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BankOfBloodRepository extends JpaRepository<BankOfBloodEntity, Long> {

    List<BankOfBloodEntity> findBlankOfBloodEntityByUf(String uf);

}
