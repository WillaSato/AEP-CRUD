package com.aep.usuario.alimento;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class AlimentoModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idAlimento;
    private String nomeAlimento;
    private String categoriaAlimento;
    private int quantidade;
    private Date dataValidade;

    public int getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(int idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getNomeAlimento() {
        return nomeAlimento;
    }

    public void setNomeAlimento(String nomeAlimento) {
        this.nomeAlimento = nomeAlimento;
    }

    public String getCategoriaAlimento() {
        return categoriaAlimento;
    }

    public void setCategoriaAlimento(String categoriaAlimento) {
        this.categoriaAlimento = categoriaAlimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
}