package com.petsos.api.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "publicaciones")
@Data
@Getter
@Setter
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPublicacion;

    @NotNull
    @Column(name="descripcion", nullable=true, length=250)
    private String decripcion;

    @Column (name="fecha", nullable=false)
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name="id_propietario", nullable=false, foreignKey = @ForeignKey(name="FK_publicacion_propietario"))
    private  Propietario propitario;

    @ManyToOne @JoinColumn (name="id_mascota", nullable=false, foreignKey = @ForeignKey(name="FK_publicacion_mascota"))
    private Mascota mascota;
}
