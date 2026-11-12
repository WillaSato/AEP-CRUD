package com.aep.usuario.alimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/alimento")
public class AlimentoController {
    @Autowired
    private AlimentoService alimentoService;

    @GetMapping
    public ResponseEntity<List<AlimentoModel>> findAll(){

        List<AlimentoModel> response = alimentoService.findAll();
        return ResponseEntity.ok().body(response);
    }

    @PostMapping
    public ResponseEntity<AlimentoModel> criarAlimento(@RequestBody AlimentoModel alimentoModel){
        AlimentoModel response = alimentoService.criarAlimento(alimentoModel);
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarId( @PathVariable Long id){
        alimentoService.deletarAlimento(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlimentoModel> atualizarAlimento(@PathVariable Long id, @RequestBody AlimentoModel alimentoModel) {
        AlimentoModel response = alimentoService.atualizarAlimento(id, alimentoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<AlimentoModel> buscarId(@PathVariable Long id){
        AlimentoModel response = alimentoService.buscarPorId(id);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/{nomeAlimento}")
    public ResponseEntity<AlimentoModel> buscarPorNomeAlimento(@PathVariable String nomeAlimento){
        AlimentoModel response = alimentoService.findByNomeAlimento(nomeAlimento);
        return ResponseEntity.ok().body(response);
    }
}