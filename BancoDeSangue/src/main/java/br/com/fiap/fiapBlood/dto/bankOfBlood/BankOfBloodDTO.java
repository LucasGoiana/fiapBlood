package br.com.fiap.fiapBlood.dto.bankOfBlood;

import br.com.fiap.fiapBlood.entity.BankOfBloodEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BankOfBloodDTO {

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


    public static BankOfBloodDTO converter(BankOfBloodEntity bankOfBloodEntity) {
        var bankOfBloodDTO = new BankOfBloodDTO();

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
