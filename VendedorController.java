package com.example.demo.controller;


import com.example.demo.domain.Coche;
import com.example.demo.domain.Concesionario;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class VendedorController {

     private Concesionario concesionario = new Concesionario();
    @PostMapping("/vendedores")
    public void altaVendedor( @Valid @RequestBody VendedorInput vendedor) {
        concesionario.altaVendedor(vendedor.toDomain());
    }
    @PutMapping("/vendedores/{dni}")
    public void modificarVendedor(@PathVariable String dni, @Valid @RequestBody  VendedorUpdate vendedor){
        concesionario.modificarVendedores(vendedor.toDomain(dni));
    }
    @DeleteMapping("/vendedores/{dni}")
    public void deleteVendedor(@PathVariable String dni){
        concesionario.deleteVendedor(dni);
    }
}

