package dev.rai.Cadastro.Empregos;

import dev.rai.Cadastro.Pessoas.PessoasModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmpregoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String emprego;
    private double salario;
    private PessoasModel pessoa;

    public EmpregoModel() {
    }

    public EmpregoModel(PessoasModel pessoa) {
        this.pessoa = pessoa;
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
