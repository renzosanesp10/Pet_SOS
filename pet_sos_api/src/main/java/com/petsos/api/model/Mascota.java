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
    @Size(min=4, max=15, message = "El tipo de tener máximo 15 caracteres")
    @Column(name="tipo", nullable = false, length = 15)
    private String tipo;

    @NotNull
    @Size(min=4, max=20, message = "El nombre de tener máximo 20 caracteres")
    @Column(name="nombre", nullable = false, length = 20)
    private String nombre;


    @Column(name="Edad", nullable = false)
    private Integer edad;


    @NotNull
    @Size(min=4, max=10, message = "El tamaño de tener máximo 10 caracteres")
    @Column(name="tamano", nullable = false, length = 10)
    private String tamano;


    @NotNull
    @Size(min=4, max=10, message = "El sexo de tener máximo 10 caracteres")
    @Column(name="sexo", nullable = false, length = 10)
    private String sexo;

    @NotNull
    @Size(min=4, max=20, message = "El nivel de Actividad de tener máximo 20 caracteres")
    @Column(name="nivel_actividad", nullable = false, length = 20)
    private String nivelActividad;

    @NotNull
    @Size(min=4, max=250)
    @Column(name="descripcion", nullable = false)
    private String descripcion;

    @NotNull
    @Size(min=30 )
    @Column(name="foto", nullable = false)
    private String foto;

    @NotNull
    @Size(min=1, max=1 )
    @Column(name="estado", nullable = false, length = 1)
    private String estado;
}
