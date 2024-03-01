package com.crud.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List; // Agrega la importación de List

import com.crud.demo.modelo.Cliente;

@Repository
public interface ICliente extends CrudRepository<Cliente, Integer> {
    // Método para recuperar todos los clientes
    List<Cliente> findAll();
}

