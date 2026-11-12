package com.aep.usuario.itm_doac;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Itm_DoacRepository extends JpaRepository<Itm_DoacModel, Long> {
    Optional<Itm_DoacModel> findByDescricaoDoacao(String nome);
}
