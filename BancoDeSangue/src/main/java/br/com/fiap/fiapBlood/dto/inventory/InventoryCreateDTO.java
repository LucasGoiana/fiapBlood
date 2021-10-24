package br.com.fiap.fiapBlood.dto.inventory;

import br.com.fiap.fiapBlood.entity.BankOfBloodEntity;
import br.com.fiap.fiapBlood.entity.InventoryEntity;
import br.com.fiap.fiapBlood.entity.TypeOfBloodEntity;
import io.swagger.annotations.ApiModelProperty;
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

    @ApiModelProperty(example = "16")
    private Long bankofblood;

    @ApiModelProperty(example = "1")
    private Long typeofblood;

    @ApiModelProperty(example = "20")
    private Double quantity;

    @ApiModelProperty(example = "100")
    private Double quantityMax;


    public static InventoryDTO converter(InventoryEntity inventoryEntity) {
        var inventoryDTO = new InventoryDTO();

        inventoryDTO.setBankOfBloodEntity(inventoryEntity.getBankOfBloodEntity());
        inventoryDTO.setTypeOfBloodEntity(inventoryEntity.getTypeOfBloodEntity());
        inventoryDTO.setQuantity(inventoryEntity.getQuantity());
        inventoryDTO.setQuantityMax(inventoryEntity.getQuantityMax());

        return inventoryDTO;
    }

}
