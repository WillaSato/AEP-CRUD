package com.aep.usuario.itm_doac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/itemdoacao")
public class Itm_DoacController {
    @Autowired
    private Itm_DoacService itmDoacService;

    @GetMapping
    public ResponseEntity<List<Itm_DoacModel>> findAll(){

        List<Itm_DoacModel> response = itmDoacService.findAll();
        return ResponseEntity.ok().body(response);
    }

    @PostMapping
    public ResponseEntity<Itm_DoacModel> criarItemDoacao(@RequestBody Itm_DoacModel itmDoacModel){
        Itm_DoacModel response = itmDoacService.criarDoador(itmDoacModel);
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarId( @PathVariable Long id){
        itmDoacService.deletarDoacao(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Itm_DoacModel> atualizarItemDoacao(@PathVariable Long id, @RequestBody Itm_DoacModel itmDoacModel) {
        Itm_DoacModel response = itmDoacService.atualizarDoacao(id, itmDoacModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Itm_DoacModel> buscarId(@PathVariable Long id){
        Itm_DoacModel response = itmDoacService.buscarPorId(id);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/{descricaoOracao}")
    public ResponseEntity<Itm_DoacModel> buscarPorNomeDoacao(@PathVariable String nome){
        Itm_DoacModel response = itmDoacService.findByDescricaoDoacao(nome);
        return ResponseEntity.ok().body(response);
    }
}
