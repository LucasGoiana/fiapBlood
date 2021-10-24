package br.com.fiap.fiapBlood.repository;

import br.com.fiap.fiapBlood.dto.inventory.InventoryDTO;
import br.com.fiap.fiapBlood.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface InventoryRepository extends JpaRepository<InventoryEntity, Long> {
    @Transactional
    void deleteAllByBankOfBloodEntityId(Long id);
}
