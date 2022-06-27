package com.bosonit.reservas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/reservas")
public class ReservasRestController {

    @Autowired
    private ReservasRepository reservasRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Reservas> findAll() {
        return reservasRepository.findAll();
    }
    
	@RequestMapping(method = RequestMethod.GET, value = "/{reservasId}")
    public Reservas findOne(@PathVariable Long reservasId) {
        return reservasRepository.findOne(reservasId);
    }
    
	@RequestMapping(method = RequestMethod.POST)
    public Reservas add(@RequestBody Reservas reservas) {
        return reservasRepository.save(reservas);
    }

	@RequestMapping(method = RequestMethod.PUT)
    public Reservas update(@RequestBody Reservas reservas) {
        return reservasRepository.save(reservas);
    }
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{reservasId}")
    public void delete(@PathVariable Long reservasId) {
        reservasRepository.delete(reservasId);
    }
	
}

