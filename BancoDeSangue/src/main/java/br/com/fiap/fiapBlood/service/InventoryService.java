package br.com.fiap.fiapBlood.service;

import br.com.fiap.fiapBlood.dto.inventory.InventoryCreateDTO;
import br.com.fiap.fiapBlood.dto.inventory.InventoryDTO;
import br.com.fiap.fiapBlood.dto.inventory.InventoryUpdateDTO;

import java.util.List;


public interface InventoryService {

    List<InventoryDTO> getAllInventory();

    InventoryDTO createInventory( InventoryCreateDTO inventoryCreateDTO);

    InventoryUpdateDTO updateQuantityInventory(Long id, InventoryUpdateDTO inventoryUpdateDTO);

    InventoryDTO getBankOfBlood(Long id);
}
