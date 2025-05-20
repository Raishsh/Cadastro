package dev.rai.Cadastro.Empregos;

import dev.rai.Cadastro.Pessoas.PessoasModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_emprego")
public class EmpregoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String emprego;
    private double salario;
    @OneToMany(mappedBy = "missoes")
    private List<PessoasModel> pessoa;

    public EmpregoModel() {
    }

    public EmpregoModel(String emprego, double salario) {
        this.emprego = emprego;
        this.salario = salario;
    }

    public String getEmprego() {
        return emprego;
    }

    public void setEmprego(String emprego) {
        this.emprego = emprego;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
