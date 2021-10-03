package br.com.fiap.fiapBlood.service;

import br.com.fiap.fiapBlood.dto.address.AddressCreateOrUpdateDTO;
import br.com.fiap.fiapBlood.dto.address.AddressDTO;

import java.util.List;

public interface AddressService {

    List<AddressDTO> getAllAddress();

    AddressDTO createAddress(AddressCreateOrUpdateDTO addressCreateOrUpdateDTO);
}
