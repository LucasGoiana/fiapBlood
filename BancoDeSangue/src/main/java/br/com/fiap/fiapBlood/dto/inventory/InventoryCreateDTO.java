package br.com.fiap.fiapBlood.dto.inventory;

import br.com.fiap.fiapBlood.entity.BankOfBloodEntity;
import br.com.fiap.fiapBlood.entity.InventoryEntity;
import br.com.fiap.fiapBlood.entity.TypeOfBloodEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InventoryCreateDTO {
    private Long idInventory;
    private Long bankofblood;
    private Long typeofblood;
    private BankOfBloodEntity bankOfBloodEntity;
    private TypeOfBloodEntity typeOfBloodEntity;
    private Double quantity;
    private Double quantityMax;


    public static InventoryDTO converter(InventoryEntity inventoryEntity) {
        var inventoryDTO = new InventoryDTO();

        inventoryDTO.setIdInventory(inventoryEntity.getId());
        inventoryDTO.setBankOfBloodEntity(inventoryEntity.getBankOfBloodEntity());
        inventoryDTO.setTypeOfBloodEntity(inventoryEntity.getTypeOfBloodEntity());
        inventoryDTO.setQuantity(inventoryEntity.getQuantity());
        inventoryDTO.setQuantityMax(inventoryEntity.getQuantityMax());

        return inventoryDTO;
    }

}
