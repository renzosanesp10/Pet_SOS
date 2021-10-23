package com.petsos.api.controller;

import com.petsos.api.model.Mascota;
import com.petsos.api.services.MascotaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    private final MascotaService mascotaService;

    public MascotaController(MascotaService mascotaService){
        this.mascotaService = mascotaService;
    }

    @GetMapping
    public ResponseEntity<List<Mascota>> listarMascotas(){
        List<Mascota> mascotas = mascotaService.listaMascotas();
        return new ResponseEntity<List<Mascota>>(mascotas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity <Mascota> obtenerMascotaPorId(@PathVariable("id") Integer id){
        Mascota mascota = mascotaService.obtenerMascotaPorId(id);
        return new ResponseEntity<Mascota>(mascota, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Mascota> registrarMascota(@Valid @RequestBody Mascota mascota){
        Mascota mascotaNew=mascotaService.registrarMascota(mascota);
        return new ResponseEntity<Mascota>(mascotaNew, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Mascota> modificarMascota(@Valid @RequestBody Mascota mascota){
        Mascota mascotaUpdate=mascotaService.modificarMascota(mascota);
        return new ResponseEntity<Mascota>(mascotaUpdate, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMascota(@PathVariable("id") Integer id){
        mascotaService.eliminarMascota(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}

