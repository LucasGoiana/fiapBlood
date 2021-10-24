package br.com.fiap.fiapBlood.dto.geographic;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class GeographicPointsDTO {

    @ApiModelProperty(example = "23.730611")
    private String latitude;

    @ApiModelProperty(example = "46.589536")
    private String longitude;
}
