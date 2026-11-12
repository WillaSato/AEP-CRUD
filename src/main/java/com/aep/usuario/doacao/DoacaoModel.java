package com.aep.usuario.doacao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class DoacaoModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idDoacao;
    private String descricaoDoacao;
    private Date dataDoacao;
    private String status;

    public int getIdDoacao() {
        return idDoacao;
    }

    public void setIdDoacao(int idDoacao) {
        this.idDoacao = idDoacao;
    }

    public String getDescricaoDoacao() {
        return descricaoDoacao;
    }

    public void setDescricaoDoacao(String descricaoDoacao) {
        this.descricaoDoacao = descricaoDoacao;
    }

    public Date getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(Date dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
