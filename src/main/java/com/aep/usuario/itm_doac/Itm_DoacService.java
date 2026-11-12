package com.aep.usuario.itm_doac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Itm_DoacService {
    @Autowired

    private Itm_DoacRepository itmDoacRepository;

    public List<Itm_DoacModel> findAll(){
        return itmDoacRepository.findAll();
    }

    public Itm_DoacModel buscarPorId(Long id){
        return itmDoacRepository.findById(id).get();
    }

    public Itm_DoacModel criarDoador(Itm_DoacModel itmDoacModel){
        return itmDoacRepository.save(itmDoacModel);
    }

    public void deletarDoacao(Long id) {
        itmDoacRepository.deleteById(id);
    }

    public Itm_DoacModel atualizarDoacao(Long id, Itm_DoacModel doacaoNew) {
        Itm_DoacModel itmDoacModel = itmDoacRepository.findById(id).get();
        itmDoacModel.setDescricaoDoacao(doacaoNew.getDescricaoDoacao());
        itmDoacModel.setDataDoacao(doacaoNew.getDataDoacao());
        itmDoacModel.setStatus(doacaoNew.getStatus());

        return itmDoacRepository.save(itmDoacModel);
    }

    public Itm_DoacModel findByDescricaoDoacao(String nome) {
        return itmDoacRepository.findByDescricaoDoacao(nome).get();
    }
}
