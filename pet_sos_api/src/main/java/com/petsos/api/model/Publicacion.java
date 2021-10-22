package com.petsos.api.model;

public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Integer idPublicacion;
    @NotNull
    @Column (name="descripcion", nullable=true, length=250)
    private String decripcion;
    @Column (name="fecha", nullable=false)
    privada LocalDateTime fecha;
    @ManyToOne
    @JoinColumn (name="id_propietario", nullable=false, foreignKey = @ForeignKey(name="FK_publicacion_propietario"))
    private  Propietario propitario;
    @ManyToOne @JoinColumn (nombre="id_mascota", nullable=false, foreignKey = @ForeignKey(name="FK_publicacion_mascota"))
    private Mascota mascota privada Mascota
}
