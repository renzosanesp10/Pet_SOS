package com.petsos.api.services.impl;

import com.petsos.api.model.Mascota;
import com.petsos.api.repositories.MascotaRepository;
import com.petsos.api.services.MascotaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaServiceImpl  implements MascotaService{

    private final MascotaRepository mascotaRepository;
    private int edad=5;

    public MascotaServiceImpl(MascotaRepository mascotaRepository){
        this.mascotaRepository = mascotaRepository;
    }

    @Override
    public Mascota registrarMascota(Mascota mascota) {

        if(mascota.getEdad()<=this.edad){
            return mascotaRepository.save(mascota);
        } else {
            return null;
        }
    }

    @Override
    public Mascota modificarMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @Override
    public List<Mascota> listaMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota obtenerMascotaPorId(Integer idMascota) {
        return mascotaRepository.findById(idMascota).orElse(new Mascota());
    }

    @Override
    public void eliminarMascota(Integer idMascota) {
        mascotaRepository.deleteById(idMascota);
    }
}
