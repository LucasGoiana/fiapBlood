package br.com.fiap.fiapBlood.dto.address;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressCreateOrUpdateDTO {
    private Long id;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String complemento;
    private String uf;
    private String cidade;
}
