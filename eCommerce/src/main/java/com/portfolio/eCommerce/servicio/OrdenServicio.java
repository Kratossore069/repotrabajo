package com.portfolio.eCommerce.servicio;

import com.portfolio.eCommerce.modelo.Orden;

import java.util.List;

public interface OrdenServicio {

    Orden save(Orden orden);
    List<Orden> findAll();
    String generarNumeroOrden();
}
