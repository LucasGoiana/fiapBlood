package br.com.fiap.fiapBlood.dto.bankOfBlood;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankOfBloodCreateOrUpdateDTO {

    private Long id;

    @ApiModelProperty(example = "Banco de Sangue 1")
    private String nome;

    @ApiModelProperty(example = "9:hrs ás 18:00 hrs")
    private String horariodeatendimento;

    @ApiModelProperty(example = "(11) 99733-8125")
    private String telefone;

    @ApiModelProperty(example = "09855-370")
    private String cep;

    @ApiModelProperty(example = "Rua Serra dos Pinhais")
    private String logradouro;

    @ApiModelProperty(example = "222")
    private Integer numero;

    @ApiModelProperty(example = "Cooperativa")
    private String bairro;

    @ApiModelProperty(example = "")
    private String complemento;

    @ApiModelProperty(example = "SP")
    private String uf;

    @ApiModelProperty(example = "São Bernardo do Campo")
    private String cidade;
}
