package com.petsos.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "mascotas")
@Getter
@Setter
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMascota;
    private String tipo;
    private String nombre;
    private Integer edad;
    private String tamaño;
    private String sexo;
    private String nivelActividad;
    private String descripcion;
    private String foto;
    private String estado;

}
