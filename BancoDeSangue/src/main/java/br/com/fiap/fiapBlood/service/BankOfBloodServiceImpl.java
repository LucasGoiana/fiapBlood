package br.com.fiap.fiapBlood.service;

import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodAddressDTO;
import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodCreateOrUpdateDTO;
import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodDTO;
import br.com.fiap.fiapBlood.entity.BankOfBloodEntity;
import br.com.fiap.fiapBlood.repository.BankOfBloodRepository;
import br.com.fiap.fiapBlood.repository.InventoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BankOfBloodServiceImpl implements BankOfBloodService {

    private final BankOfBloodRepository bankOfBloodRepository;
    private final GeoLocationService geoLocationService;
    private final ViaCepService viaCepService;
    private final InventoryRepository inventoryRepository;

    public BankOfBloodServiceImpl(BankOfBloodRepository bankOfBloodRepository, GeoLocationService geoLocationService, ViaCepService viaCepService, InventoryRepository inventoryRepository) {
        this.bankOfBloodRepository = bankOfBloodRepository;
        this.geoLocationService = geoLocationService;
        this.viaCepService = viaCepService;
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public List<BankOfBloodDTO> getAllBankOfBlood() {
        var bankOfBloodList = bankOfBloodRepository.findAll();
        return bankOfBloodList.stream().map(BankOfBloodDTO::converter).collect(Collectors.toList());
    }

    @Override
    public List<BankOfBloodDTO> searchBlankOfBlood(String cep) {
        var addressUser = viaCepService.getInfoAddress(cep);
        var blankBloodCity = bankOfBloodRepository.findBlankOfBloodEntityByUf(addressUser.uf);
        var geographicPointUser = geoLocationService.getGeographicCoordinates(addressUser.logradouro,addressUser.bairro,addressUser.localidade);

        var lista = blankBloodCity.stream()
                .filter(blankBlood -> geoLocationService.calculateDistance(Double.parseDouble(geographicPointUser.getLatitude()),Double.parseDouble(geographicPointUser.getLongitude()),blankBlood.getLatitude(),blankBlood.getLongitude()) < 100)
                .sorted((o1,o2) -> geoLocationService.calculateDistance(Double.parseDouble(geographicPointUser.getLatitude()),Double.parseDouble(geographicPointUser.getLongitude()),o2.getLatitude(),o1.getLongitude()).compareTo(geoLocationService.calculateDistance(Double.parseDouble(geographicPointUser.getLatitude()),Double.parseDouble(geographicPointUser.getLongitude()),o2.getLatitude(),o2.getLongitude())) )
                .map(BankOfBloodDTO::converter).collect(Collectors.toList());
        return lista;

    }

    @Override
    public BankOfBloodDTO getById(Long id) {
        var bankOfBloodEntity = bankOfBloodRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Banco de Sangue não encontrado"));
        return BankOfBloodDTO.converter(bankOfBloodEntity);
    }

    @Override
    public BankOfBloodDTO createBankOfBlood(BankOfBloodCreateOrUpdateDTO bankOfBloodCreateOrUpdateDTO) {

            BankOfBloodEntity bankOfBloodEntity = new BankOfBloodEntity(bankOfBloodCreateOrUpdateDTO);
            var geoPoints = geoLocationService.getGeographicCoordinates(bankOfBloodCreateOrUpdateDTO.getLogradouro(),bankOfBloodCreateOrUpdateDTO.getBairro(),bankOfBloodCreateOrUpdateDTO.getCidade());
            bankOfBloodEntity.setLatitude(Double.parseDouble(geoPoints.getLatitude()));
            bankOfBloodEntity.setLongitude(Double.parseDouble(geoPoints.getLongitude()));

            bankOfBloodEntity = bankOfBloodRepository.save(bankOfBloodEntity);
            return BankOfBloodDTO.converter(bankOfBloodEntity);

    }

    @Override
    public BankOfBloodDTO updateBankOfBlood(Long id, BankOfBloodCreateOrUpdateDTO bankOfBloodCreateOrUpdateDTO) {
        bankOfBloodRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Banco de Sangue não encontrado"));
        BankOfBloodEntity bankOfBloodEntity = new BankOfBloodEntity(bankOfBloodCreateOrUpdateDTO);
        bankOfBloodEntity.setId(id);
        var geoPoints = geoLocationService.getGeographicCoordinates(bankOfBloodCreateOrUpdateDTO.getLogradouro(),bankOfBloodCreateOrUpdateDTO.getBairro(),bankOfBloodCreateOrUpdateDTO.getCidade());
        bankOfBloodEntity.setLatitude(Double.parseDouble(geoPoints.getLatitude()));
        bankOfBloodEntity.setLongitude(Double.parseDouble(geoPoints.getLongitude()));
        bankOfBloodEntity = bankOfBloodRepository.save(bankOfBloodEntity);
        return BankOfBloodDTO.converter(bankOfBloodEntity);

    }

    @Override
    public BankOfBloodDTO updateAddressBankOfBlood(Long id, BankOfBloodAddressDTO bankOfBloodAddressDTO) {

        var bank = bankOfBloodRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Banco de Sangue não encontrado"));

        BankOfBloodEntity bankOfBloodEntity = new BankOfBloodEntity(bankOfBloodAddressDTO);
        bankOfBloodEntity.setId(id);
        bankOfBloodEntity.setNome(bank.getNome());
        bankOfBloodEntity.setHorariodeatendimento(bank.getHorariodeatendimento());
        bankOfBloodEntity.setTelefone(bank.getTelefone());
        var geoPoints = geoLocationService.getGeographicCoordinates(bankOfBloodAddressDTO.getLogradouro(),bankOfBloodAddressDTO.getBairro(),bankOfBloodAddressDTO.getCidade());
        bankOfBloodEntity.setLatitude(Double.parseDouble(geoPoints.getLatitude()));
        bankOfBloodEntity.setLongitude(Double.parseDouble(geoPoints.getLongitude()));

        bankOfBloodEntity = bankOfBloodRepository.save(bankOfBloodEntity);

        return  BankOfBloodDTO.converter(bankOfBloodEntity);

    }

    @Override
    public void deleteBank(Long id) {
        var bank = bankOfBloodRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Banco de Sangue não encontrado"));
        inventoryRepository.deleteAllByBankOfBloodEntityId(1L);

        bankOfBloodRepository.deleteById(id);

    }
}
