package com.petsos.api.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="adoptantes")
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
