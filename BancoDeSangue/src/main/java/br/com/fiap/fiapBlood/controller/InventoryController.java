package br.com.fiap.fiapBlood.controller;

import br.com.fiap.fiapBlood.dto.inventory.InventoryCreateDTO;
import br.com.fiap.fiapBlood.dto.inventory.InventoryDTO;
import br.com.fiap.fiapBlood.dto.inventory.InventoryUpdateDTO;
import br.com.fiap.fiapBlood.service.InventoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("inventories")
public class InventoryController {

    private final InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @ApiOperation(value = "Lista todos os estoques", notes = "Este endpoint lista todos os estoques de banco de sangue")
    @GetMapping(value = "/")
    public List<InventoryDTO> getAllBankOfBlood() {
        return inventoryService.getAllInventory();
    }

    @ApiOperation(value = "Recupera um estoque", notes = "Este endpoint recupera um estoque conforme ID informado")
    @GetMapping(value = "/{id}/")
    public InventoryDTO getBankOfBlood(@PathVariable Long id) {
        return inventoryService.getBankOfBlood(id);
    }

    @ApiOperation(value = "Cria um estoque para banco de sangue", notes = "Este endpoint cria um estoque de um banco de sangue para um determino tipo de sangue")
    @PostMapping("/")
    public InventoryDTO createInventory(@RequestBody InventoryCreateDTO inventoryCreateDTO){
        return inventoryService.createInventory(inventoryCreateDTO);
    }

    @ApiOperation(value = "Atualiza um estoque de banco de sangue", notes = "Este endpoint atualiza um estoque de um banco de sangue de um determino tipo de sangue")
    @PutMapping("/{id}/")
    public InventoryUpdateDTO updateQuantityInventory(@PathVariable Long id, @RequestBody InventoryUpdateDTO inventoryUpdateDTO){
        return inventoryService.updateQuantityInventory(id, inventoryUpdateDTO);
    }


}
