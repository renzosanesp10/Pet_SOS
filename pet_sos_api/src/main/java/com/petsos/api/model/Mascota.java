package com.petsos.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "mascotas")
@Getter
@Setter
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMascota;
    @NotNull
    @Column (name="tipos", nullable = false, length = 50)
    private String tipo;
    @NotNull
    @Column (name="nombres", nullable = false, length = 50)
    private String nombre;
    @NotNull
    @Column (name="edades", nullable = false )
    private Integer edad;
    @NotNull
    @Column (name="tamannos", nullable = false, length = 20)
    private String tamanno;
    @NotNull
    @Column (name="sexos", nullable = false, length = 10)
    private String sexo;
    @NotNull
    @Column (name="nivelActividades", nullable = false, length = 10)
    private String nivelActividad;
    @NotNull
    @Column (name="descripciones", nullable = false, length = 100)
    private String descripcion;
    @NotNull
    @Column (name="fotos", nullable = false, length = 100)
    private String foto;
    @NotNull
    @Column (name="estados", nullable = false, length = 1)
    private String estado;

}
