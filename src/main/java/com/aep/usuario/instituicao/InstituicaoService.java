package com.aep.usuario.instituicao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstituicaoService {
    @Autowired

    private InstituicaoRepository instituicaoRepository;

    public List<InstituicaoModel> findAll(){
        return instituicaoRepository.findAll();
    }

    public InstituicaoModel buscarPorId(Long id){
        return instituicaoRepository.findById(id).get();
    }

    public InstituicaoModel criarInstituicao(InstituicaoModel instituicaoModel){
        return instituicaoRepository.save(instituicaoModel);
    }

    public void deletarInstituicao(Long id) {
        instituicaoRepository.deleteById(id);
    }

    public InstituicaoModel atualizarInstituicao(Long id, InstituicaoModel instituicaoNew) {
        InstituicaoModel instituicaoModel = instituicaoRepository.findById(id).get();
        instituicaoModel.setNomeInstituicao(instituicaoNew.getNomeInstituicao());
        instituicaoModel.setEnderecoInstituicao(instituicaoNew.getEnderecoInstituicao());

        return instituicaoRepository.save(instituicaoModel);
    }

    public InstituicaoModel findByNome(String nome) {
        return instituicaoRepository.findByNomeInstituicao(nome).get();
    }
}
