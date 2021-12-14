package com.petsos.api.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


@Entity
@NoArgsConstructor
@Table(name = "padrino")
@Getter
@Setter
@Data
public class Padrino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPadrino;

    @NotNull
    @Column(name = "nombres", nullable = false, length = 50)
    private String nombres;

    @NotNull
    @Column(name = "apellidos", nullable = false, length = 70)
    private String apellidos;

    @NotNull
    @Size(min = 8, max = 8, message = "El DNI debe tener 8 caracteres")
    @Column(name = "dni", nullable = false, length = 8, unique = true)
    private String dni;

    @NotNull
    @Size(min=5, max=150, message = "La direccion debe tener minimo 5 caracteres")
    @Column(name = "direccion", nullable = false, length = 150)
    private String direccion;

    @NotNull
    @Column(name = "ciudad", nullable = false, length = 20)
    private String ciudad;

    @NotNull
    @Size(min=9, max = 9, message = "El telefono debe tener 9 caracteres")
    @Column(name = "telefono", nullable = false, length = 9)
    private String telefono;

    @NotNull
    @Email(message = "El email formato incorrecto")
    @Column(name = "email", nullable = false, length = 150)
    private String email;

}


