package br.com.fiap.fiapBlood.dto.bankOfBlood;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankOfBloodCreateOrUpdateDTO {
    private Long id;
    private String nome;
    private String horariodeatendimento;
    private String telefone;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String complemento;
    private String uf;
    private String cidade;
}
