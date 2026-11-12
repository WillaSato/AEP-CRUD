package com.aep.usuario.entrega;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/entrega")
public class EntregaController {
    @Autowired
    private EntregaService entregaService;

    @GetMapping
    public ResponseEntity<List<EntregaModel>> findAll(){

        List<EntregaModel> response = entregaService.findAll();
        return ResponseEntity.ok().body(response);
    }

    @PostMapping
    public ResponseEntity<EntregaModel> criarEntrega(@RequestBody EntregaModel entregaModel){
        EntregaModel response = entregaService.criarEntrega(entregaModel);
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarId( @PathVariable Long id){
        entregaService.deletarEntrega(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<EntregaModel> atualizarEntrega(@PathVariable Long id, @RequestBody EntregaModel entregaModel) {
        EntregaModel response = entregaService.atualizarEntrega(id, entregaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<EntregaModel> buscarId(@PathVariable Long id){
        EntregaModel response = entregaService.buscarPorId(id);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/{tipoEntrega}")
    public ResponseEntity<EntregaModel> buscarPorTipoEntrega(@PathVariable String tipoEntrega){
        EntregaModel response = entregaService.findByTipoEntrega(tipoEntrega);
        return ResponseEntity.ok().body(response);
    }
}