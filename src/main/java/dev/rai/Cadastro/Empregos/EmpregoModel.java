package dev.rai.Cadastro.Empregos;

import dev.rai.Cadastro.Pessoas.PessoasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_emprego")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmpregoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String emprego;

    private double salario;

    @OneToMany(mappedBy = "missoes")
    private List<PessoasModel> pessoa;


}
