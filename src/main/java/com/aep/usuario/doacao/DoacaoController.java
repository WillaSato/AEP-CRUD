package com.aep.usuario.doacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/doacao")
public class DoacaoController {
    @Autowired
    private DoacaoService doacaoService;

    @GetMapping
    public ResponseEntity<List<DoacaoModel>> findAll(){

        List<DoacaoModel> response = doacaoService.findAll();
        return ResponseEntity.ok().body(response);
    }

    @PostMapping
    public ResponseEntity<DoacaoModel> criarDoacao(@RequestBody DoacaoModel doacaoModel){
        DoacaoModel response = doacaoService.criarDoador(doacaoModel);
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarId( @PathVariable Long id){
        doacaoService.deletarDoacao(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DoacaoModel> atualizarDoador(@PathVariable Long id, @RequestBody DoacaoModel doacaoModel) {
        DoacaoModel response = doacaoService.atualizarDoacao(id, doacaoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<DoacaoModel> buscarId(@PathVariable Long id){
        DoacaoModel response = doacaoService.buscarPorId(id);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/{descricaoOracao}")
    public ResponseEntity<DoacaoModel> buscarPorNomeDoacao(@PathVariable String nome){
        DoacaoModel response = doacaoService.findByDescricaoDoacao(nome);
        return ResponseEntity.ok().body(response);
    }
}
