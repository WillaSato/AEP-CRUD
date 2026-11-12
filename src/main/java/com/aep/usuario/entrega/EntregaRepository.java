package com.aep.usuario.entrega;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EntregaRepository extends JpaRepository<EntregaModel, Long> {
    Optional<EntregaModel> findByTipoEntrega(String tipoEntrega);
}