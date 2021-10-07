package br.com.fiap.fiapBlood.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankOfBloodAddressDTO {

    private String cep;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String complemento;
    private String uf;
    private String cidade;
}
