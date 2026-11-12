package com.aep.usuario.doador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/doador")
public class DoadorController {
    @Autowired
    private DoadorService doadorService;

    @GetMapping
    public ResponseEntity<List<DoadorModel>> findAll(){

        List<DoadorModel> response = doadorService.findAll();
        return ResponseEntity.ok().body(response);
    }

    @PostMapping
    public ResponseEntity<DoadorModel> criarDoador(@RequestBody DoadorModel doadorModel){
        DoadorModel response = doadorService.criarDoador(doadorModel);
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarId( @PathVariable Long id){
        doadorService.deletarInstituicao(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DoadorModel> atualizarDoador(@PathVariable Long id, @RequestBody DoadorModel doadorModel) {
        DoadorModel response = doadorService.atualizarDoador(id, doadorModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<DoadorModel> buscarId(@PathVariable Long id){
        DoadorModel response = doadorService.buscarPorId(id);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/{tipoDoador}")
    public ResponseEntity<DoadorModel> buscarPorTipoDoador(@PathVariable String nome){
        DoadorModel response = doadorService.findByTipoDoador(nome);
        return ResponseEntity.ok().body(response);
    }
}
