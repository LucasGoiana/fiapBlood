package br.com.fiap.fiapBlood.dto.inventory;

import br.com.fiap.fiapBlood.entity.InventoryEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventoryUpdateDTO {

    public static InventoryUpdateDTO converter(InventoryEntity inventoryEntity) {
        var inventoryUpdateDTO = new InventoryUpdateDTO();

        inventoryUpdateDTO.setQuantity(inventoryEntity.getQuantity());

        return inventoryUpdateDTO;
    }


    private Double quantity;
}
