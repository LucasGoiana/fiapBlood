package br.com.fiap.fiapBlood.dto.bankOfBlood;

import br.com.fiap.fiapBlood.entity.BankOfBloodEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BankOfBloodDTO {

    @ApiModelProperty(example = "1")
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

    public static BankOfBloodDTO converter(BankOfBloodEntity bankOfBloodEntity) {
        var bankOfBloodDTO = new BankOfBloodDTO();

        bankOfBloodDTO.setId(bankOfBloodEntity.getId());
        bankOfBloodDTO.setNome(bankOfBloodEntity.getNome());
        bankOfBloodDTO.setHorariodeatendimento(bankOfBloodEntity.getHorariodeatendimento());
        bankOfBloodDTO.setTelefone(bankOfBloodEntity.getTelefone());
        bankOfBloodDTO.setCep(bankOfBloodEntity.getCep());
        bankOfBloodDTO.setLogradouro(bankOfBloodEntity.getLogradouro());
        bankOfBloodDTO.setNumero(bankOfBloodEntity.getNumero());
        bankOfBloodDTO.setBairro(bankOfBloodEntity.getBairro());
        bankOfBloodDTO.setComplemento(bankOfBloodEntity.getComplemento());
        bankOfBloodDTO.setUf(bankOfBloodEntity.getUf());
        bankOfBloodDTO.setCidade(bankOfBloodEntity.getCidade());

        return bankOfBloodDTO;
    }

}
