package com.aep.usuario.entrega;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaService {
    @Autowired

    private EntregaRepository entregaRepository;

    public List<EntregaModel> findAll(){
        return entregaRepository.findAll();
    }

    public EntregaModel buscarPorId(Long id){
        return entregaRepository.findById(id).get();
    }

    public EntregaModel criarEntrega(EntregaModel entregaModel){
        return entregaRepository.save(entregaModel);
    }

    public void deletarEntrega(Long id) {
        entregaRepository.deleteById(id);
    }

    public EntregaModel atualizarEntrega(Long id, EntregaModel entregaNew) {
        EntregaModel entregaModel = entregaRepository.findById(id).get();
        entregaModel.setEnderecoColeta(entregaNew.getEnderecoColeta());
        entregaModel.setEnderecoEntrega(entregaNew.getEnderecoEntrega());
        entregaModel.setDataEntrega(entregaNew.getDataEntrega());
        entregaModel.setHorarioEntrega(entregaNew.getHorarioEntrega());
        entregaModel.setTipoEntrega(entregaNew.getTipoEntrega());
        entregaModel.setStatus(entregaNew.getStatus());

        return entregaRepository.save(entregaModel);
    }

    public EntregaModel findByTipoEntrega(String tipoEntrega) {
        return entregaRepository.findByTipoEntrega(tipoEntrega).get();
    }
}