package com.petsos.api.services.impl;


import com.petsos.api.model.Padrino;
import com.petsos.api.repositories.PadrinoRepository;
import com.petsos.api.services.PadrinoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PadrinoServiceImpl implements PadrinoService {

    private final PadrinoRepository padrinoRepository;


    public PadrinoServiceImpl(PadrinoRepository padrinoRepository) {
        this.padrinoRepository = padrinoRepository;
    }

    @Override
    public Padrino registrarPadrino(Padrino padrino) {
        return padrinoRepository.save(padrino);
    }

    @Override
    public Padrino modificarPadrino(Padrino padrino) {
        return padrinoRepository.save(padrino);
    }

    @Override
    public List<Padrino> listaPadrino() {
        return padrinoRepository.findAll();
    }

    @Override
    public Padrino obtenerPadrinoPorId(Integer idPadrino) {
        return padrinoRepository.findById(idPadrino).orElse(new Padrino());
    }

    @Override
    public void eliminarPadrino(Integer idPadrino) {
        padrinoRepository.deleteById(idPadrino);

    }
}
