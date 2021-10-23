package br.com.fiap.fiapBlood.service;

import br.com.fiap.fiapBlood.dto.inventory.InventoryCreateDTO;
import br.com.fiap.fiapBlood.dto.inventory.InventoryDTO;
import br.com.fiap.fiapBlood.dto.inventory.InventoryUpdateDTO;
import br.com.fiap.fiapBlood.entity.InventoryEntity;
import br.com.fiap.fiapBlood.repository.BankOfBloodRepository;
import br.com.fiap.fiapBlood.repository.InventoryRepository;
import br.com.fiap.fiapBlood.repository.TypeOfBloodRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InventoryServiceImpl implements InventoryService {

    private final InventoryRepository inventoryRepository;
    private final BankOfBloodRepository bankOfBloodRepository;
    private final TypeOfBloodRepository typeOfBloodRepository;

    public InventoryServiceImpl(InventoryRepository inventoryRepository, BankOfBloodRepository bankOfBloodRepository ,TypeOfBloodRepository typeOfBloodRepository) {
        this.inventoryRepository = inventoryRepository;
        this.bankOfBloodRepository = bankOfBloodRepository;
        this.typeOfBloodRepository = typeOfBloodRepository;
    }

    @Override
    public List<InventoryDTO> getAllInventory() {
        var inventoryList = inventoryRepository.findAll();
        return inventoryList.stream().map(InventoryDTO::converter).collect(Collectors.toList());
    }

    @Override
    public InventoryDTO createInventory(InventoryCreateDTO inventoryCreateDTO) {
        var typeOfBloodEntity = typeOfBloodRepository.findById(inventoryCreateDTO.getTypeofblood()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Tipo de Sangue não encontrado"));
        var bankOfBloodEntity = bankOfBloodRepository.findById(inventoryCreateDTO.getBankofblood()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Banco de Sangue não encontrado"));

        InventoryEntity inventoryEntity = new InventoryEntity(inventoryCreateDTO);
        inventoryEntity.setTypeOfBloodEntity(typeOfBloodEntity);
        inventoryEntity.setBankOfBloodEntity(bankOfBloodEntity);
        inventoryEntity = inventoryRepository.save(inventoryEntity);

        return InventoryDTO.converter(inventoryEntity);

    }

    @Override
    public InventoryUpdateDTO updateQuantityInventory(Long id, InventoryUpdateDTO inventoryUpdateDTO) {
        var inventoryEntity =  inventoryRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Estoque não encontrado"));

        Double quantityMax = inventoryEntity.getQuantityMax();
        Double quantityOld = inventoryEntity.getQuantity();
        Double quantityNew = inventoryUpdateDTO.getQuantity() + quantityOld;

        if (quantityNew > quantityMax  ) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Quantidade inserida ultrapassa a capacidade do Estoque!");
        }else {
            inventoryEntity.setQuantity(quantityNew );
            inventoryEntity = inventoryRepository.save(inventoryEntity);

        }

        return inventoryUpdateDTO.converter(inventoryEntity);


    }

    @Override
    public InventoryDTO getBankOfBlood(Long id) {
        var inventoryList = inventoryRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Estoque não encontrado"));
        return InventoryDTO.converter(inventoryList);
    }
}
