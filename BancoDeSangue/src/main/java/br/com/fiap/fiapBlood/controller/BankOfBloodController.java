package br.com.fiap.fiapBlood.controller;

import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodAddressDTO;
import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodCreateOrUpdateDTO;
import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodDTO;
import br.com.fiap.fiapBlood.service.BankOfBloodService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("banks")
public class BankOfBloodController {

    private final BankOfBloodService bankOfBloodService;

    public BankOfBloodController(BankOfBloodService bankOfBloodService) {
        this.bankOfBloodService = bankOfBloodService;
    }

    @ApiOperation(value = "Lista todos os bancos de sangue", notes = "Este endpoint lista todos os bancos de sangue")
    @GetMapping("/")
    public List<BankOfBloodDTO> getAllBankOfBlood() {
        return bankOfBloodService.getAllBankOfBlood();
    }

    @ApiOperation(value = "Cadastra banco de sangue", notes = "Este endpoint cadastra um banco de sangue")
    @PostMapping("/")
    public BankOfBloodDTO createBankOfBlood(@RequestBody BankOfBloodCreateOrUpdateDTO bankOfBloodCreateOrUpdateDTO){
        return bankOfBloodService.createBankOfBlood(bankOfBloodCreateOrUpdateDTO);

    }

    @ApiOperation(value = "Lista banco de sangue conforme cep informado", notes = "Este endpoint lista todos os bancos de sangue conforme cep informado")
    @GetMapping("/search")
    public List<BankOfBloodDTO> searchBankOfBlood(
            @RequestParam("cep") String cep
    ) {
        return bankOfBloodService.searchBlankOfBlood(cep);
    }

    @ApiOperation(value = "Recupera um banco de sangue", notes = "Este endpoint recupera um banco de sangue conforme ID informado")
    @GetMapping("/{id}")
    public BankOfBloodDTO getById(@PathVariable Long id){
        //return bankOfBloodService.getById(id);
        return null;
    }

    @ApiOperation(value = "Atualiza banco de sangue", notes = "Este endpoint atualiza um banco de sangue")
    @PutMapping("/{id}")
    public BankOfBloodDTO updateBankOfBlood(@PathVariable Long id,@RequestBody BankOfBloodCreateOrUpdateDTO bankOfBloodCreateOrUpdateDTO){
        return bankOfBloodService.updateBankOfBlood(id, bankOfBloodCreateOrUpdateDTO);

    }

    @ApiOperation(value = "Atualiza endereço", notes = "Este endpoint atualiza somente o endereço de um banco de sangue ja cadastrado")
    @PutMapping("/{id}/address/")
    public BankOfBloodDTO updateAddressBankOfBlood(@PathVariable Long id,@RequestBody BankOfBloodAddressDTO bankOfBloodAddressDTO){
        return bankOfBloodService.updateAddressBankOfBlood(id, bankOfBloodAddressDTO);

    }

    @ApiOperation(value = "Deleta um banco de sangue", notes = "Este endpoint deleta um banco de sangue")
    @DeleteMapping("/{id}/")
    public String deleteBank (@PathVariable Long id){
        bankOfBloodService.deleteBank(id);
        return "Deletado com sucesso";
    }
}
