package br.com.fiap.fiapBlood.controller;

import br.com.fiap.fiapBlood.dto.address.AddressCreateOrUpdateDTO;
import br.com.fiap.fiapBlood.dto.address.AddressDTO;
import br.com.fiap.fiapBlood.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/")
    public List<AddressDTO> getAllAddress() {
        return addressService.getAllAddress();
    }

    @PostMapping("/")
    public AddressDTO createAddress (@RequestBody  AddressCreateOrUpdateDTO addressCreateOrUpdateDTO){
        return addressService.createAddress(addressCreateOrUpdateDTO);

    }
}
