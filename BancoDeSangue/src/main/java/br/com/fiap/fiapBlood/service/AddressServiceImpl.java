package br.com.fiap.fiapBlood.service;

import br.com.fiap.fiapBlood.dto.address.AddressCreateOrUpdateDTO;
import br.com.fiap.fiapBlood.dto.address.AddressDTO;
import br.com.fiap.fiapBlood.entity.AddressEntity;
import br.com.fiap.fiapBlood.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<AddressDTO> getAllAddress() {
        var addressList = addressRepository.findAll();
        return addressList.stream().map(AddressDTO::converter).collect(Collectors.toList());
    }

    @Override
    public AddressDTO createAddress(AddressCreateOrUpdateDTO addressCreateOrUpdateDTO) {

            AddressEntity addressEntity = new AddressEntity(addressCreateOrUpdateDTO);
            addressEntity = addressRepository.save(addressEntity);
            return new AddressDTO().converter(addressEntity);

    }
}
