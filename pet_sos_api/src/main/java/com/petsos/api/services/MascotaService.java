package com.petsos.api.services;

import com.petsos.api.model.Mascota;

import java.util.List;

public interface MascotaService {

    Mascota registrarMascota(Mascota mascota);
    Mascota modificarMascota(Mascota mascota);
    List<Mascota> listaMascotas();
    Mascota obtenerMascotaPorId(Integer idMascota);
    void eliminarMascota(Integer idMascota);

}
