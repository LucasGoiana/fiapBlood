package br.com.fiap.fiapBlood.dto.address;

import br.com.fiap.fiapBlood.entity.AddressEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AddressDTO {

    private String cep;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String complemento;
    private String uf;
    private String cidade;


    public static AddressDTO converter(AddressEntity addressEntity) {
        var addressDTO = new AddressDTO();

        addressDTO.setCep(addressEntity.getCep());
        addressDTO.setLogradouro(addressEntity.getLogradouro());
        addressDTO.setNumero(addressEntity.getNumero());
        addressDTO.setBairro(addressEntity.getBairro());
        addressDTO.setComplemento(addressEntity.getComplemento());
        addressDTO.setUf(addressEntity.getUf());
        addressDTO.setCidade(addressEntity.getCidade());
        return addressDTO;
    }

}
