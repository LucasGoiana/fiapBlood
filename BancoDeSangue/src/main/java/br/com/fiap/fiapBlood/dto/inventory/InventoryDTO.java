package br.com.fiap.fiapBlood.dto.inventory;

import br.com.fiap.fiapBlood.entity.BankOfBloodEntity;
import br.com.fiap.fiapBlood.entity.InventoryEntity;
import br.com.fiap.fiapBlood.entity.TypeOfBloodEntity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class InventoryDTO {

    private Long idInventory;
    private BankOfBloodEntity bankOfBloodEntity;
    private TypeOfBloodEntity typeOfBloodEntity;
    private Double quantity;
    private Double quantityMax;

    public InventoryDTO(){}

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
