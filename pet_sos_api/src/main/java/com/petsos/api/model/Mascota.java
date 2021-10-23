package com.petsos.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "mascotas")
@Getter
@Setter
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMascota;
    @NotNull
    @Size (min=4, max=15, message ="El Tipo de tener maximo 15 caracteres")
    @Column (name="tipo", nullable = false, length = 50)
    private String tipo;
    @NotNull
    @Size (min=3, max=15, message ="El Nombre de tener maximo 15 caracteres")
    @Column (name="nombre", nullable = false, length = 50)
    private String nombre;
    @NotNull
    @Column (name="edade", nullable = false )
    private Integer edad;
    @NotNull
    @Column (name="tamanno", nullable = false, length = 20)
    private String tamanno;
    @NotNull
    @Column (name="sexo", nullable = false, length = 10)
    private String sexo;
    @NotNull
    @Column (name="nivelActividad", nullable = false, length = 10)
    private String nivelActividad;
    @NotNull
    @Column (name="descripcion", nullable = false, length = 100)
    private String descripcion;
    @NotNull
    @Column (name="foto", nullable = false, length = 100)
    private String foto;
    @NotNull
    @Size (min=1, max=1, message ="El Estado de tener sólo 1 caracter")
    @Column (name="estado", nullable = false, length = 1)
    private String estado;
}
