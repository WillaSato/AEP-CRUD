package com.aep.usuario.doador;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoadorRepository extends JpaRepository<DoadorModel, Long> {
    Optional<DoadorModel> findByTipoDoador(String nome);
}
