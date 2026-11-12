package com.aep.usuario.doador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoadorService {
    @Autowired

    private DoadorRepository doadorRepository;

    public List<DoadorModel> findAll(){
        return doadorRepository.findAll();
    }

    public DoadorModel buscarPorId(Long id){
        return doadorRepository.findById(id).get();
    }

    public DoadorModel criarDoador(DoadorModel doadorModel){
        return doadorRepository.save(doadorModel);
    }

    public void deletarInstituicao(Long id) {
        doadorRepository.deleteById(id);
    }

    public DoadorModel atualizarDoador(Long id, DoadorModel doadorNew) {
        DoadorModel doadorModel = doadorRepository.findById(id).get();
        doadorModel.setTipoDoador(doadorNew.getTipoDoador());

        return doadorRepository.save(doadorModel);
    }

    public DoadorModel findByTipoDoador(String nome) {
        return doadorRepository.findByTipoDoador(nome).get();
    }
}
