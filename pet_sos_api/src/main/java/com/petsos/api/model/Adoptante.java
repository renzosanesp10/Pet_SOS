package com.petsos.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity  //@author: Diego Vergara Aranguri
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "adoptantess")
@Getter
@Setter
public class Adoptante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(min=8, max=8, message ="DNI debe tener 8 caracteres")
    @Column (name="dni", nullable = false, length =  8, unique = true)
    private String dni;

    @NotNull
    @Column (name="nombre", nullable = false, length = 20)
    private String nombre;

    @NotNull
    @Column (name="apellido", nullable = false, length = 30)
    private String apellido;

    @NotNull
    @Size(min=5, max=150, message ="Direccion debe tener mínimo 5 caracteres")
    @Column (name="direccion", nullable = false, length =  150)
    private String direccion;

    @NotNull
    @Column (name="ciudad", nullable = false, length =  20)
    private String ciudad;

    @NotNull
    @Size(min=9, max=9, message = "Teléfono debe tener 9 caracteres")
    @Column (name="telefono", nullable = false, length =  9)
    private String telefono;

    @NotNull
    @Email(message="Email formato incorrecto")
    @Column(name="email", nullable = false, length = 150)
    private String email;

    @NotNull
    @Column(name="estado", nullable = false, length = 1)
    private String estado;


}
