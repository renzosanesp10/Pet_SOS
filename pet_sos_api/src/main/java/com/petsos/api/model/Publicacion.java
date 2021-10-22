package com.petsos.api.model;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "publicaciones")
@Getter
@Setter

public class Publicaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdPublicacion;
    private LocalDateTime Fechapublicacion;
    private String Descripcion;

}


