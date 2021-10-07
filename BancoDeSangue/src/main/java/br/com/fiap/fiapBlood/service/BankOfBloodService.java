package br.com.fiap.fiapBlood.service;

import br.com.fiap.fiapBlood.dto.BankOfBloodAddressDTO;
import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodCreateOrUpdateDTO;
import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodDTO;

import java.util.List;

public interface BankOfBloodService {

    List<BankOfBloodDTO> getAllBankOfBlood();

    BankOfBloodDTO createBankOfBlood(BankOfBloodCreateOrUpdateDTO bankOfBloodCreateOrUpdateDTO);

    BankOfBloodDTO updateBankOfBlood(Long id, BankOfBloodCreateOrUpdateDTO bankOfBloodCreateOrUpdateDTO);

    BankOfBloodDTO updateAddressBankOfBlood(Long id, BankOfBloodAddressDTO bankOfBloodAddressDTO);

    void deleteBank(Long id);
}