package com.petsos.api.services;

import com.petsos.api.model.Mascota;
import com.petsos.api.model.Publicacion;

import java.util.List;

public interface PublicacionService {
    Publicacion registrarPublicacion(Publicacion publicacion);
    Publicacion modificarPublicacion(Publicacion publicacion);
    List<Publicacion> listaPublicaciones();
    Publicacion obtenerPublicacionPorId(Integer idPublicacion);
    void eliminarPublicacion(Integer idPublicacion);
}
