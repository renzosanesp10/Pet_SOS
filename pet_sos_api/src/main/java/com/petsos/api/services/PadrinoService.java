package com.petsos.api.services;

import com.petsos.api.model.Padrino;

import java.util.List;

public interface PadrinoService {

    Padrino registrarPadrino(Padrino padrino);
    Padrino modificarPadrino(Padrino padrino);
    List<Padrino> listaPadrino();
    Padrino obtenerPadrinoPorId(Integer idPadrino);
    void eliminarPadrino(Integer idPadrino);
}
