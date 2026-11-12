package com.aep.usuario.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired

    private UsuarioRepository usuarioRepository;

    public List<UsuarioModel> findAll(){
        return usuarioRepository.findAll();
    }

    public UsuarioModel buscarPorId(Long id){
        return usuarioRepository.findById(id).get();
    }

    public UsuarioModel criarUsuario(UsuarioModel usuarioModel){
        return usuarioRepository.save(usuarioModel);
    }

    public void deletarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    public UsuarioModel atualizarUsuario(Long id, UsuarioModel usuarioNew) {
        UsuarioModel usuarioModel = usuarioRepository.findById(id).get();
        usuarioModel.setNome(usuarioNew.getNome());
        usuarioModel.setEndereco(usuarioNew.getEndereco());

        return usuarioRepository.save(usuarioModel);
    }

    public UsuarioModel findByNome (String nome) {
        return usuarioRepository.findByNome(nome).get();
    }


}
