package com.aep.usuario.alimento;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlimentoRepository extends JpaRepository<AlimentoModel, Long> {
    Optional<AlimentoModel> findByNomeAlimento(String nome);
}