package br.com.fiap.fiapBlood.service;

import br.com.fiap.fiapBlood.dto.BankOfBloodAddressDTO;
import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodCreateOrUpdateDTO;
import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodDTO;
import br.com.fiap.fiapBlood.entity.BankOfBloodEntity;
import br.com.fiap.fiapBlood.repository.BankOfBloodRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
 
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BankOfBloodServiceImpl implements BankOfBloodService {

    private final BankOfBloodRepository bankOfBloodRepository;
    private BankOfBloodDTO bankOfBloodDTO;

    public BankOfBloodServiceImpl(BankOfBloodRepository bankOfBloodRepository) {
        this.bankOfBloodRepository = bankOfBloodRepository;
    }

    @Override
    public List<BankOfBloodDTO> getAllBankOfBlood() {
        var bankOfBloodList = bankOfBloodRepository.findAll();
        return bankOfBloodList.stream().map(BankOfBloodDTO::converter).collect(Collectors.toList());
    }

    @Override
    public BankOfBloodDTO createBankOfBlood(BankOfBloodCreateOrUpdateDTO bankOfBloodCreateOrUpdateDTO) {

            BankOfBloodEntity bankOfBloodEntity = new BankOfBloodEntity(bankOfBloodCreateOrUpdateDTO);
            bankOfBloodEntity = bankOfBloodRepository.save(bankOfBloodEntity);
            return bankOfBloodDTO.converter(bankOfBloodEntity);

    }

    @Override
    public BankOfBloodDTO updateBankOfBlood(Long id, BankOfBloodCreateOrUpdateDTO bankOfBloodCreateOrUpdateDTO) {
        bankOfBloodRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Banco de Sangue não encontrado"));
        BankOfBloodEntity bankOfBloodEntity = new BankOfBloodEntity(bankOfBloodCreateOrUpdateDTO);
        bankOfBloodEntity.setId(id);
        bankOfBloodEntity = bankOfBloodRepository.save(bankOfBloodEntity);
        return bankOfBloodDTO.converter(bankOfBloodEntity);

    }

    @Override
    public BankOfBloodDTO updateAddressBankOfBlood(Long id, BankOfBloodAddressDTO bankOfBloodAddressDTO) {

        var bank = bankOfBloodRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Banco de Sangue não encontrado"));

        BankOfBloodEntity bankOfBloodEntity = new BankOfBloodEntity(bankOfBloodAddressDTO);
        bankOfBloodEntity.setId(id);
        bankOfBloodEntity.setNome(bank.getNome());
        bankOfBloodEntity.setHorariodeatendimento(bank.getHorariodeatendimento());
        bankOfBloodEntity.setTelefone(bank.getTelefone());

        bankOfBloodEntity = bankOfBloodRepository.save(bankOfBloodEntity);

        return  bankOfBloodDTO.converter(bankOfBloodEntity);

    }

    @Override
    public void deleteBank(Long id) {
        bankOfBloodRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Banco de Sangue não encontrado"));
        bankOfBloodRepository.deleteById(id);

    }
}
