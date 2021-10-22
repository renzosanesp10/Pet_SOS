package com.petsos.api.controller;

import com.petsos.api.model.Adoptante;
import com.petsos.api.services.AdoptanteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/adoptantes")
public class AdoptanteController {

    private final AdoptanteService adoptanteService;

    public AdoptanteController(AdoptanteService adoptanteService){
        this.adoptanteService = adoptanteService;
    }

    @GetMapping
    public ResponseEntity<List<Adoptante>> listarAdoptantes(){
        List<Adoptante> adoptantes = adoptanteService.listaAdoptantes();
        return new ResponseEntity<List<Adoptante>>(adoptantes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity <Adoptante> obtenerAdoptantePorId(@PathVariable("id") Integer id){
        Adoptante adoptante = adoptanteService.obtenerAdoptantePorId(id);
        return new ResponseEntity<Adoptante>(adoptante, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Adoptante> registrarAdoptante(@Valid @RequestBody Adoptante adoptante){
        Adoptante adoptanteNew=adoptanteService.registrarAdoptante(adoptante);
        return new ResponseEntity<Adoptante>(adoptanteNew, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Adoptante> modificarAdoptante(@Valid @RequestBody Adoptante adoptante){
        Adoptante adoptanteUpdate=adoptanteService.modificarAdoptante(adoptante);
        return new ResponseEntity<Adoptante>(adoptanteUpdate, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAdoptante(@PathVariable("id") Integer id){
        //Adoptante adoptante = adoptanteService.obtenerAdoptantePorId(id);
        adoptanteService.eliminarAdoptante(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
