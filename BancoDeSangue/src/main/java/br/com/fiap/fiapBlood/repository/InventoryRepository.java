package br.com.fiap.fiapBlood.repository;

import br.com.fiap.fiapBlood.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<InventoryEntity, Long> {
}
