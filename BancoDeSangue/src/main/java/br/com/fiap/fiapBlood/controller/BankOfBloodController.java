package br.com.fiap.fiapBlood.controller;

import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodAddressDTO;
import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodCreateOrUpdateDTO;
import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodDTO;
import br.com.fiap.fiapBlood.service.BankOfBloodService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/banks")
public class BankOfBloodController {

    private final BankOfBloodService bankOfBloodService;

    public BankOfBloodController(BankOfBloodService bankOfBloodService) {
        this.bankOfBloodService = bankOfBloodService;
    }

    @ApiOperation(value = "Lista todos os bancos de sangue", notes = "Este endpoint lista todos os bancos de sangue", authorizations = { @Authorization(value="Bearer Token") })
    @GetMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BankOfBloodDTO> getAllBankOfBlood() {
        return bankOfBloodService.getAllBankOfBlood();
    }

    @ApiOperation(value = "Cadastra banco de sangue", notes = "Este endpoint cadastra um banco de sangue",authorizations = { @Authorization(value="Bearer Token") })
    @PostMapping(value = "/",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public BankOfBloodDTO createBankOfBlood(@RequestBody BankOfBloodCreateOrUpdateDTO bankOfBloodCreateOrUpdateDTO){
        return bankOfBloodService.createBankOfBlood(bankOfBloodCreateOrUpdateDTO);

    }

    @ApiOperation(value = "Lista banco de sangue conforme cep informado", notes = "Este endpoint lista todos os bancos de sangue conforme cep informado")
    @GetMapping(value = "/search",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<BankOfBloodDTO> searchBankOfBlood(
            @RequestParam("cep") String cep
    ) {
        return bankOfBloodService.searchBlankOfBlood(cep);
    }

    @ApiOperation(value = "Recupera um banco de sangue", notes = "Este endpoint recupera um banco de sangue conforme ID informado",authorizations = { @Authorization(value="Bearer Token") })
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public BankOfBloodDTO getById(@PathVariable Long id){
        return bankOfBloodService.getById(id);
    }

    @ApiOperation(value = "Atualiza banco de sangue", notes = "Este endpoint atualiza um banco de sangue",authorizations = { @Authorization(value="Bearer Token") })
    @PutMapping(value = "/{id}",consumes =MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public BankOfBloodDTO updateBankOfBlood(@PathVariable Long id,@RequestBody BankOfBloodCreateOrUpdateDTO bankOfBloodCreateOrUpdateDTO){
        return bankOfBloodService.updateBankOfBlood(id, bankOfBloodCreateOrUpdateDTO);

    }

    @ApiOperation(value = "Atualiza endereço", notes = "Este endpoint atualiza somente o endereço de um banco de sangue ja cadastrado",authorizations = { @Authorization(value="Bearer Token") })
    @PutMapping(value = "/{id}/address/",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public BankOfBloodDTO updateAddressBankOfBlood(@PathVariable Long id,@RequestBody BankOfBloodAddressDTO bankOfBloodAddressDTO){
        return bankOfBloodService.updateAddressBankOfBlood(id, bankOfBloodAddressDTO);

    }

    @ApiOperation(value = "Deleta um banco de sangue", notes = "Este endpoint deleta um banco de sangue",authorizations = { @Authorization(value="Bearer Token") })
    @DeleteMapping(value = "/{id}/",produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteBank (@PathVariable Long id){
        bankOfBloodService.deleteBank(id);
        return "Deletado com sucesso";
    }
}
