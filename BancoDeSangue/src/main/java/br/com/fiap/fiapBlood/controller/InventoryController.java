package br.com.fiap.fiapBlood.controller;

import br.com.fiap.fiapBlood.dto.inventory.InventoryCreateDTO;
import br.com.fiap.fiapBlood.dto.inventory.InventoryDTO;
import br.com.fiap.fiapBlood.dto.inventory.InventoryUpdateDTO;
import br.com.fiap.fiapBlood.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/")
    public List<InventoryDTO> getAllBankOfBlood() {
        return inventoryService.getAllInventory();
    }

    @GetMapping("/{id}/")
    public InventoryDTO getBankOfBlood(@PathVariable Long id) {
        return inventoryService.getBankOfBlood(id);
    }

    @PostMapping("/")
    public InventoryDTO createInventory(@RequestBody InventoryCreateDTO inventoryCreateDTO){
        return inventoryService.createInventory(inventoryCreateDTO);
    }

    @PutMapping("/{id}/")
    public InventoryUpdateDTO updateQuantityInventory(@PathVariable Long id, @RequestBody InventoryUpdateDTO inventoryUpdateDTO){
        return inventoryService.updateQuantityInventory(id, inventoryUpdateDTO);
    }


}
