package com.aep.usuario.instituicao;

import com.aep.usuario.usuario.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/instituicao")
public class InstituicaoController {
    @Autowired
    private InstituicaoService instituicaoService;

    @GetMapping
    public ResponseEntity<List<InstituicaoModel>> findAll(){

        List<InstituicaoModel> response = instituicaoService.findAll();
        return ResponseEntity.ok().body(response);
    }

    @PostMapping
    public ResponseEntity<InstituicaoModel> criarInstituicao(@RequestBody InstituicaoModel instituicaoModel){
        InstituicaoModel response = instituicaoService.criarInstituicao(instituicaoModel);
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarId( @PathVariable Long id){
        instituicaoService.deletarInstituicao(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<InstituicaoModel> atualizarInstituicao(@PathVariable Long id, @RequestBody InstituicaoModel instituicaoModel) {
        InstituicaoModel response = instituicaoService.atualizarInstituicao(id, instituicaoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<InstituicaoModel> buscarId( @PathVariable Long id){
        InstituicaoModel response = instituicaoService.buscarPorId(id);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/{nomeInstituicao}")
    public ResponseEntity<InstituicaoModel> buscarPorNome(@PathVariable String nome){
        InstituicaoModel response = instituicaoService.findByNome(nome);
        return ResponseEntity.ok().body(response);
    }
}
