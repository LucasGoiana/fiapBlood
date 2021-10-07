package br.com.fiap.fiapBlood.controller;

import br.com.fiap.fiapBlood.dto.BankOfBloodAddressDTO;
import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodCreateOrUpdateDTO;
import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodDTO;
import br.com.fiap.fiapBlood.service.BankOfBloodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bank")
public class BankOfBloodController {

    private final BankOfBloodService bankOfBloodService;

    public BankOfBloodController(BankOfBloodService bankOfBloodService) {
        this.bankOfBloodService = bankOfBloodService;
    }

    @GetMapping("/")
    public List<BankOfBloodDTO> getAllBankOfBlood() {
        return bankOfBloodService.getAllBankOfBlood();
    }

    @GetMapping("/{id}")
    public BankOfBloodDTO getById(@PathVariable Long id){
        //return bankOfBloodService.getById(id);
        return null;
    }

    @PostMapping("/")
    public BankOfBloodDTO createBankOfBlood(@RequestBody BankOfBloodCreateOrUpdateDTO bankOfBloodCreateOrUpdateDTO){
        return bankOfBloodService.createBankOfBlood(bankOfBloodCreateOrUpdateDTO);

    }

    @PutMapping("/{id}")
    public BankOfBloodDTO updateBankOfBlood(@PathVariable Long id,@RequestBody BankOfBloodCreateOrUpdateDTO bankOfBloodCreateOrUpdateDTO){
        return bankOfBloodService.updateBankOfBlood(id, bankOfBloodCreateOrUpdateDTO);

    }

    @PutMapping("/{id}/address/")
    public BankOfBloodDTO updateAddressBankOfBlood(@PathVariable Long id,@RequestBody BankOfBloodAddressDTO bankOfBloodAddressDTO){
        return bankOfBloodService.updateAddressBankOfBlood(id, bankOfBloodAddressDTO);

    }

    @DeleteMapping("/{id}/")
    public String deleteBank (@PathVariable Long id){
        bankOfBloodService.deleteBank(id);
        return "Deletado com sucesso";
    }
}
