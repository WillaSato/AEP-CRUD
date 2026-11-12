package com.aep.usuario.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<UsuarioModel>> findAll(){

        List<UsuarioModel> response = usuarioService.findAll();
        return ResponseEntity.ok().body(response);
    }

    @PostMapping
    public ResponseEntity<UsuarioModel> criarUsuario(@RequestBody UsuarioModel usuarioModel){
        UsuarioModel response = usuarioService.criarUsuario(usuarioModel);
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarId( @PathVariable Long id){
        usuarioService.deletarUsuario(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioModel> atualizarUsuario(@PathVariable Long id, @RequestBody UsuarioModel usuarioModel) {
        UsuarioModel response = usuarioService.atualizarUsuario(id, usuarioModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<UsuarioModel> buscarId( @PathVariable Long id){
        UsuarioModel response = usuarioService.buscarPorId(id);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<UsuarioModel> buscarPorNome( @PathVariable String nome){
        UsuarioModel response = usuarioService.findByNome(nome);
        return ResponseEntity.ok().body(response);
    }

}
