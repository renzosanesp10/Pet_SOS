package com.petsos.api.services.impl;

import com.petsos.api.model.Adoptante;
import com.petsos.api.model.SolicitudAdopcion;
import com.petsos.api.repositories.AdoptanteRepository;
import com.petsos.api.repositories.SolicitudAdopcionRepository;
import com.petsos.api.services.SolicitudAdopcionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitudAdopcionServiceImpl implements SolicitudAdopcionService {

    private final SolicitudAdopcionRepository solicitudAdopcionRepository;


    public SolicitudAdopcionServiceImpl(SolicitudAdopcionRepository solicitudAdopcionRepository){
        this.solicitudAdopcionRepository = solicitudAdopcionRepository;
    }

}
