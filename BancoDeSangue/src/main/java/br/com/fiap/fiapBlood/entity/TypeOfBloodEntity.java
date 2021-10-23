package br.com.fiap.fiapBlood.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "tb_tipo_sangue")
public class TypeOfBloodEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_tipo_sangue")
    private Long id;

    @Column(name="nome")
    private String nomeOfType;


}
