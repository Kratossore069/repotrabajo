package com.portfolio.eCommerce.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibida;

    @ManyToOne
    private Usuario usuario;

    @OneToOne(mappedBy = "orden")
    private DetalleOrden detalle;
}
