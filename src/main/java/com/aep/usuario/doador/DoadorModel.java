package com.aep.usuario.doador;

import com.aep.usuario.usuario.UsuarioModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DoadorModel extends UsuarioModel {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDoador() {
        return tipoDoador;
    }

    public void setTipoDoador(String tipoDoador) {
        this.tipoDoador = tipoDoador;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String tipoDoador;


}
