package com.bosonit.demowebflux.controlador;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosonit.demowebflux.modelo.Jugador;
import com.bosonit.demowebflux.servicio.JugadorServicio;

import ch.qos.logback.classic.Logger;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/")
public class JugadoresController {

    private static final Logger log = (Logger) LoggerFactory.getLogger(JugadoresController.class);

    @Autowired
    private JugadorServicio jugadorServicio;

    @GetMapping("/bienvenido")
    public String bienvenido(@PathVariable("nombre") String nombre, Model model) {
        model.addAttribute("nombre", nombre);
        return "bienvenido";
    }

    @PostMapping("/aniadir")
    public Mono<Jugador> crearJugador(@RequestBody Jugador jugador) {
        return Mono.just(jugadorServicio.crearJugador(jugador));
    }

    // Operaciones de Flux y Mono de apuntes

    @GetMapping("/mostrar")
    public Mono<Jugador> mostrar() {
        return Mono.just(new Jugador(1, "Carlos"));
    }

    @GetMapping
    public Flux<Jugador> listar() {
        List<Jugador> lista = new ArrayList<>();
        lista.add(new Jugador(1, "Pedro"));
        lista.add(new Jugador(2, "Santi"));

        Flux<Jugador> listaFlux = Flux.fromIterable(lista);
        return listaFlux;
    }

    @GetMapping("/listado")
    public Mono<ResponseEntity<Flux<Jugador>>> listarEntity() {
        List<Jugador> lista = new ArrayList<>();
        lista.add(new Jugador(1, "Pedro"));
        lista.add(new Jugador(2, "Santi"));

        Flux<Jugador> listaFlux = Flux.fromIterable(lista);
        return Mono.just(ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(listaFlux));
    }

    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Void>> eliminar(@PathVariable("id") int id) {
        return buscarPorId(id).flatMap(jugador -> {
            return eliminar(jugador).then(Mono.just(new ResponseEntity<Void>(HttpStatus.NO_CONTENT)));
        });
    }

    public Mono<Void> eliminar(Jugador jugador) {
        log.info("Eliminado " + jugador.getIdPersona() + jugador.getNombre());
        return Mono.empty();
    }

    public Mono<Jugador> buscarPorId(int id) {
        if (id == 1) {
            return Mono.just(new Jugador(1, "Pedro"));
        } else {
            return Mono.empty();
        }
    }
}
