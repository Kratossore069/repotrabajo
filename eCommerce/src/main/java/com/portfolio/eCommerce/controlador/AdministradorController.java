package com.portfolio.eCommerce.controlador;

import com.portfolio.eCommerce.modelo.Producto;
import com.portfolio.eCommerce.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {

    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping
    public String home(Model model) {
        List<Producto> productos = productoServicio.findAll();
        model.addAttribute("productos", productos);
        return "administrador/home";
    }
}
