package br.com.fiap.fiapBlood.enumerate.converter;

import br.com.fiap.fiapBlood.enumerate.TypeOfBlood;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class TypeOfBloodConverter implements AttributeConverter<TypeOfBlood,Integer> {

    @Override
    public Integer convertToDatabaseColumn(TypeOfBlood typeOfBlood) {
        if(typeOfBlood == null){
            return null;
        }
        return typeOfBlood.getCod();
    }

    @Override
    public TypeOfBlood convertToEntityAttribute(Integer code) {
        if (code == null){
            return null;
        }

        return Stream.of(TypeOfBlood.values())
                .filter(orderStatus -> orderStatus.getCod().equals(code))
                .findFirst()
                .orElseThrow(IllegalAccessError::new);
    }
}
