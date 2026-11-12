package com.aep.usuario.doacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoacaoService {
    @Autowired

    private DoacaoRepository doacaoRepository;

    public List<DoacaoModel> findAll(){
        return doacaoRepository.findAll();
    }

    public DoacaoModel buscarPorId(Long id){
        return doacaoRepository.findById(id).get();
    }

    public DoacaoModel criarDoador(DoacaoModel doacaoModel){
        return doacaoRepository.save(doacaoModel);
    }

    public void deletarDoacao(Long id) {
        doacaoRepository.deleteById(id);
    }

    public DoacaoModel atualizarDoacao(Long id, DoacaoModel doacaoNew) {
        DoacaoModel doacaoModel = doacaoRepository.findById(id).get();
        doacaoModel.setDescricaoDoacao(doacaoNew.getDescricaoDoacao());
        doacaoModel.setDataDoacao(doacaoNew.getDataDoacao());
        doacaoModel.setStatus(doacaoNew.getStatus());

        return doacaoRepository.save(doacaoModel);
    }

    public DoacaoModel findByDescricaoDoacao(String nome) {
        return doacaoRepository.findByDescricaoDoacao(nome).get();
    }
}
