package com.petsos.api.controller;


import com.petsos.api.model.Padrino;
import com.petsos.api.services.PadrinoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/padrinos")
public class PadrinoController {

    private final PadrinoService padrinoService;

    public PadrinoController(PadrinoService padrinoService) {
        this.padrinoService = padrinoService;
    }

    @GetMapping
    public ResponseEntity<List<Padrino>> listarPadrinos(){
        List<Padrino> padrinos = padrinoService.listaPadrino();
        return new ResponseEntity<List<Padrino>>(padrinos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Padrino> obtenerPadrinoPorId(@PathVariable("id") Integer id){
        Padrino padrino = padrinoService.obtenerPadrinoPorId(id);
        return new ResponseEntity<Padrino>(padrino, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Padrino> registrarPadrino(@Valid @RequestBody Padrino padrino){
        Padrino padrinoNew=padrinoService.registrarPadrino(padrino);
        return new ResponseEntity<Padrino>(padrinoNew, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Padrino> modificarPadrino(@Valid @RequestBody Padrino padrino){
        Padrino padrinoUpdate= padrinoService.modificarPadrino(padrino);
        return new ResponseEntity<Padrino>(padrinoUpdate, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPadrino(@PathVariable("id") Integer id){
        padrinoService.eliminarPadrino(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
