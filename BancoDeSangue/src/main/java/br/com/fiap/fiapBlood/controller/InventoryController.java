package br.com.fiap.fiapBlood.controller;

import br.com.fiap.fiapBlood.dto.inventory.InventoryCreateDTO;
import br.com.fiap.fiapBlood.dto.inventory.InventoryDTO;
import br.com.fiap.fiapBlood.dto.inventory.InventoryUpdateDTO;
import br.com.fiap.fiapBlood.service.InventoryService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/inventories")
public class InventoryController {

    private final InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @ApiOperation(value = "Lista todos os estoques", notes = "Este endpoint lista todos os estoques de banco de sangue",authorizations = { @Authorization(value="Bearer Token") })
    @GetMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<InventoryDTO> getAllBankOfBlood() {
        return inventoryService.getAllInventory();
    }

    @ApiOperation(value = "Recupera um estoque", notes = "Este endpoint recupera um estoque conforme ID informado",authorizations = { @Authorization(value="Bearer Token") })
    @GetMapping(value = "/{id}/",produces = MediaType.APPLICATION_JSON_VALUE)
    public InventoryDTO getBankOfBlood(@PathVariable Long id) {
        return inventoryService.getBankOfBlood(id);
    }

    @ApiOperation(value = "Cria um estoque para banco de sangue", notes = "Este endpoint cria um estoque de um banco de sangue para um determino tipo de sangue",authorizations = { @Authorization(value="Bearer Token") })
    @PostMapping(value = "/",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public InventoryDTO createInventory(@RequestBody InventoryCreateDTO inventoryCreateDTO){
        return inventoryService.createInventory(inventoryCreateDTO);
    }

    @ApiOperation(value = "Atualiza um estoque de banco de sangue", notes = "Este endpoint atualiza um estoque de um banco de sangue de um determino tipo de sangue",authorizations = { @Authorization(value="Bearer Token") })
    @PutMapping(value = "/{id}/",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public InventoryUpdateDTO updateQuantityInventory(@PathVariable Long id, @RequestBody InventoryUpdateDTO inventoryUpdateDTO){
        return inventoryService.updateQuantityInventory(id, inventoryUpdateDTO);
    }


}
