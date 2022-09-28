package com.example.demo.domain;


import java.util.HashMap;

public class Concesionario {

    private HashMap<String, Vendedor> vendedores = new HashMap<>();
    private HashMap<String, Coche> coches = new HashMap<>();
    private HashMap<String, Cliente> clientes = new HashMap<>();

    public HashMap<String, Vendedor> getVendedores() {
        return vendedores;
    }

    public HashMap<String, Coche> getCoches() {
        return coches;
    }

    public HashMap<String, Cliente> getClientes() {
        return clientes;
    }


    public void altaVendedor(Vendedor vendedor) {
        this.vendedores.put(vendedor.getDni(), vendedor);
    }

    public void deleteVendedor(String dni) {

        this.vendedores.remove(dni);
    }

    public void modificarVendedores(Vendedor vendedor) {
        this.vendedores.put(vendedor.getDni(), vendedor);
    }

    public void altaCliente(Cliente cliente) {
        this.clientes.put(cliente.getDni(), cliente);
    }

    public void altacoche(Coche coche) {
        this.coches.put(coche.getId(), coche);
    }

    public void reservarCoche(Coche coche)  {

            coche.setReservado(true);


    }

    public void cancelarReservaCoche(Coche coche) {


        coche.setReservado(false);

    }
    public void deleteCoche(String id) {
        coches.remove(id);
    }
        public void modificarCoche(Coche coche){
        this.coches.put(coche.getId(), coche);
        }
        public Concesionario(){

        }
        public void deleteCliente(String cliente){
        clientes.remove(cliente);
        }

    public void modificarCliente(Cliente toDomain) {
    }
}