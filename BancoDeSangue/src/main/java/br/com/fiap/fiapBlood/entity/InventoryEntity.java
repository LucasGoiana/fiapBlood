package br.com.fiap.fiapBlood.entity;

import br.com.fiap.fiapBlood.dto.inventory.InventoryCreateDTO;
import br.com.fiap.fiapBlood.dto.inventory.InventoryDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_estoque")
public class InventoryEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_estoque")
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_tipo_sangue")
    private TypeOfBloodEntity typeOfBloodEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_banco_sangue")
    private BankOfBloodEntity bankOfBloodEntity;

    @Column(name="quantidade")
    private Double quantity;

    @Column(name="quantidadeMaxima")
    private Double quantityMax;



    public InventoryEntity(InventoryDTO inventoryDTO){

        this.bankOfBloodEntity = inventoryDTO.getBankOfBloodEntity();
        this.typeOfBloodEntity = inventoryDTO.getTypeOfBloodEntity();
        this.quantity = inventoryDTO.getQuantity();
        this.quantityMax = inventoryDTO.getQuantityMax();

    }

    public InventoryEntity(InventoryCreateDTO inventoryCreateDTO){


        this.quantity = inventoryCreateDTO.getQuantity();
        this.quantityMax = inventoryCreateDTO.getQuantityMax();

    }
}
