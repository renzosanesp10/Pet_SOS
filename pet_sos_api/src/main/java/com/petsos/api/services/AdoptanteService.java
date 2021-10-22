package com.petsos.api.services;

import com.petsos.api.model.Adoptante;

import java.util.List;

public interface AdoptanteService {

    Adoptante registrarAdoptante(Adoptante adoptante);
    Adoptante modificarAdoptante(Adoptante adoptante);
    List<Adoptante> listaAdoptantes();
    Adoptante obtenerAdoptantePorId(Integer idAdoptante);
    void eliminarAdoptante(Integer idAdoptante);

}
