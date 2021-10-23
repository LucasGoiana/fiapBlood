package br.com.fiap.fiapBlood.entity;

import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodAddressDTO;
import br.com.fiap.fiapBlood.dto.bankOfBlood.BankOfBloodCreateOrUpdateDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="tb_banco_de_sangue")
public class BankOfBloodEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_banco_de_sangue")
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

    public BankOfBloodEntity(BankOfBloodCreateOrUpdateDTO bankOfBloodCreateOrUpdateDTO){

        this.id = bankOfBloodCreateOrUpdateDTO.getId();
        this.nome = bankOfBloodCreateOrUpdateDTO.getNome();
        this.horariodeatendimento = bankOfBloodCreateOrUpdateDTO.getHorariodeatendimento();
        this.telefone = bankOfBloodCreateOrUpdateDTO.getTelefone();
        this.cep = bankOfBloodCreateOrUpdateDTO.getCep();
        this.logradouro = bankOfBloodCreateOrUpdateDTO.getLogradouro();
        this.numero = bankOfBloodCreateOrUpdateDTO.getNumero();
        this.complemento = bankOfBloodCreateOrUpdateDTO.getComplemento();
        this.bairro = bankOfBloodCreateOrUpdateDTO.getBairro();
        this.uf = bankOfBloodCreateOrUpdateDTO.getUf();
        this.cidade = bankOfBloodCreateOrUpdateDTO.getCidade();

    }
    public BankOfBloodEntity(BankOfBloodAddressDTO bankOfBloodAddressDTO){

        this.cep = bankOfBloodAddressDTO.getCep();
        this.logradouro = bankOfBloodAddressDTO.getLogradouro();
        this.numero = bankOfBloodAddressDTO.getNumero();
        this.complemento = bankOfBloodAddressDTO.getComplemento();
        this.bairro = bankOfBloodAddressDTO.getBairro();
        this.uf = bankOfBloodAddressDTO.getUf();
        this.cidade = bankOfBloodAddressDTO.getCidade();

    }
}
