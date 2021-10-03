package br.com.fiap.fiapBlood.entity;

import br.com.fiap.fiapBlood.dto.address.AddressCreateOrUpdateDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="tb_endereco")

public class AddressEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_endereco")
    private Long id;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String complemento;
    private String uf;
    private String cidade;

    public AddressEntity(AddressCreateOrUpdateDTO addressCreateOrUpdateDTO){

        this.id = addressCreateOrUpdateDTO.getId();
        this.cep = addressCreateOrUpdateDTO.getCep();
        this.logradouro = addressCreateOrUpdateDTO.getLogradouro();
        this.numero = addressCreateOrUpdateDTO.getNumero();
        this.complemento = addressCreateOrUpdateDTO.getComplemento();
        this.bairro = addressCreateOrUpdateDTO.getComplemento();
        this.uf = addressCreateOrUpdateDTO.getUf();
        this.cidade = addressCreateOrUpdateDTO.getCidade();

    }
}
