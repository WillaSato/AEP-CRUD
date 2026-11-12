package com.aep.usuario.doacao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoacaoRepository extends JpaRepository<DoacaoModel, Long> {
    Optional<DoacaoModel> findByDescricaoDoacao(String nome);
}
