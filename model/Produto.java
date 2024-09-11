package model;

import java.time.LocalDate;

public class Produto {
    public String nome;
    public float preco;
    public Disponibilidade disponibilidade;
    public LocalDate dataCadastro;

    public Produto(String nome, float preco, Disponibilidade disponibilidade, LocalDate dataCadastro) {
        this.nome = nome;
        this.preco = preco;
        this.disponibilidade = disponibilidade;
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void imprimir() {
       
    }
}
