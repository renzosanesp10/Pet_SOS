package com.petsos.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuarios")
@Setter
@Getter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @NotNull
    @Size(min=8, max=8, message ="DNI debe tener 8 caracteres")
    @Column(name="dni", nullable = false, length =  8, unique = true)
    private Integer dni;

    @NotNull
    @Size(min=4, message ="Nombre debe tener 8 caracteres")
    @Column (name="nombres", nullable = false, length = 20)
    private String nombres;

    @NotNull
    @Size(min=4, message ="Apellidos debe tener 4 caracteres")
    @Column (name="apellidos", nullable = false, length = 30)
    private String apellidos;

    @NotNull
    @Size(min=6, message ="La clave debe tener un mínimo de 6 caracteres")
    @Column (name="clave", nullable = false, length = 15)
    private String clave;

    @NotNull
    @Size(min=1, max=1, message ="Estado debe tener 1 caracter")
    @Column (name="estado", nullable = false, length = 1)
    private String estado;


}
