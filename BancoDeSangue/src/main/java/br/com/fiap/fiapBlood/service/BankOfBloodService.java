package br.com.fiap.fiapBlood.service;

import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodAddressDTO;
import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodCreateOrUpdateDTO;
import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodDTO;

import java.util.List;

public interface BankOfBloodService {

    List<BankOfBloodDTO> getAllBankOfBlood();

    List<BankOfBloodDTO> searchBlankOfBlood(String cep);

    BankOfBloodDTO getById(Long id);

    BankOfBloodDTO createBankOfBlood(BankOfBloodCreateOrUpdateDTO bankOfBloodCreateOrUpdateDTO);

    BankOfBloodDTO updateBankOfBlood(Long id, BankOfBloodCreateOrUpdateDTO bankOfBloodCreateOrUpdateDTO);

    BankOfBloodDTO updateAddressBankOfBlood(Long id, BankOfBloodAddressDTO bankOfBloodAddressDTO);

    void deleteBank(Long id);
}
