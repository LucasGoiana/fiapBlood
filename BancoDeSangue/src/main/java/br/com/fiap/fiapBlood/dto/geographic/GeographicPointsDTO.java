package br.com.fiap.fiapBlood.dto.geographic;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class GeographicPointsDTO {
    private String latitude;
    private String longitude;
}
