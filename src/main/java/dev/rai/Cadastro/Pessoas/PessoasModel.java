package dev.rai.Cadastro.Pessoas;


import dev.rai.Cadastro.Empregos.EmpregoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


//Entity transforma uma classe comum numa entidade do banco de dados.

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    @ManyToOne
    @JoinColumn(name = "emprego_id")
    private EmpregoModel emprego;

}
