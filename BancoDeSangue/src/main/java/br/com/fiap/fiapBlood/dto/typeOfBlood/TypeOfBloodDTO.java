package br.com.fiap.fiapBlood.dto.typeOfBlood;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class TypeOfBloodDTO {

    private String nome;
}
