package com.aep.usuario.instituicao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InstituicaoRepository extends JpaRepository<InstituicaoModel, Long> {
    Optional<InstituicaoModel> findByNomeInstituicao(String nome);
}
