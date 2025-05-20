package dev.rai.Cadastro.Pessoas;


import dev.rai.Cadastro.Empregos.EmpregoModel;
import jakarta.persistence.*;

import java.util.List;


//Entity transforma uma classe comum numa entidade do banco de dados.

@Entity
@Table(name = "tb_cadastro")
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

    public PessoasModel() {
    }

    public PessoasModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
