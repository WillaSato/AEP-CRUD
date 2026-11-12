package com.aep.usuario.alimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentoService {
    @Autowired

    private AlimentoRepository alimentoRepository;

    public List<AlimentoModel> findAll(){
        return alimentoRepository.findAll();
    }

    public AlimentoModel buscarPorId(Long id){
        return alimentoRepository.findById(id).get();
    }

    public AlimentoModel criarAlimento(AlimentoModel alimentoModel){
        return alimentoRepository.save(alimentoModel);
    }

    public void deletarAlimento(Long id) {
        alimentoRepository.deleteById(id);
    }

    public AlimentoModel atualizarAlimento(Long id, AlimentoModel alimentoNew) {
        AlimentoModel alimentoModel = alimentoRepository.findById(id).get();
        alimentoModel.setNomeAlimento(alimentoNew.getNomeAlimento());
        alimentoModel.setCategoriaAlimento(alimentoNew.getCategoriaAlimento());
        alimentoModel.setQuantidade(alimentoNew.getQuantidade());
        alimentoModel.setDataValidade(alimentoNew.getDataValidade());

        return alimentoRepository.save(alimentoModel);
    }

    public AlimentoModel findByNomeAlimento(String nome) {
        return alimentoRepository.findByNomeAlimento(nome).get();
    }
}