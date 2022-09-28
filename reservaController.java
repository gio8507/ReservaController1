package com.example.demo.controller;

import com.example.demo.domain.Coche;
import com.example.demo.domain.Concesionario;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class reservaController {
    private Concesionario concesionario = new Concesionario();
    @PostMapping("/reservar/coches/{cocheId}/cliente/{clienteId}")
    public void hacerReserva(@PathVariable String cocheId, @PathVariable String clienteId){
         Coche coche = concesionario.getCoches().get(cocheId);
        concesionario.reservarCoche(coche);
    }

    @DeleteMapping("/reservar/coches/{cocheId}/cliente/{clienteId}")
    public void cencelarReserva(@PathVariable String cocheId, @PathVariable String clienteId) {
        Coche coche=concesionario.getCoches().get(cocheId);
        concesionario.cancelarReservaCoche(coche);
    }
}