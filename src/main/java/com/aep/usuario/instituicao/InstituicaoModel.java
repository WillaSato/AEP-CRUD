package com.aep.usuario.instituicao;

import com.aep.usuario.usuario.UsuarioModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InstituicaoModel extends UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nomeInstituicao;
    private String cnpj;
    private String enderecoInstituicao;
    private String telefoneInstituicao;

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefoneInstituicao() {
        return telefoneInstituicao;
    }

    public void setTelefoneInstituicao(String telefoneInstituicao) {
        this.telefoneInstituicao = telefoneInstituicao;
    }

    public String getEnderecoInstituicao() {
        return enderecoInstituicao;
    }

    public void setEnderecoInstituicao(String enderecoInstituicao) {
        this.enderecoInstituicao = enderecoInstituicao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
