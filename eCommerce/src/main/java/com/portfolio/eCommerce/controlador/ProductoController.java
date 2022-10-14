package com.portfolio.eCommerce.controlador;

import com.portfolio.eCommerce.modelo.Producto;
import com.portfolio.eCommerce.modelo.Usuario;
import com.portfolio.eCommerce.servicio.ProductoServicio;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final Logger LOGGER= LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping
    public String show(Model model){
        model.addAttribute("productos",productoServicio.findAll());
        return "productos/show";
    }

    @GetMapping("/create")
    public String create(){
        return "productos/create";
    }

    @PostMapping("/save")
    public String save(Producto producto){
        LOGGER.info("Este es el objeto producto "+producto);
        productoServicio.save(producto);
        return "redirect:/productos";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id,Model model){
        Producto producto = new Producto();
        Optional<Producto> optionalProducto = productoServicio.get(id);
        producto = optionalProducto.get();
        LOGGER.info("Producto buscado"+producto);
        model.addAttribute("producto",producto);
        return "productos/edit";
    }

    @PostMapping("/update")
    public String update(Producto producto){
        productoServicio.update(producto);
        return "redirect:/productos";
    }
}
