package com.crud.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.demo.interfaceService.IclienteService;
import com.crud.demo.interfaces.ICliente;
import com.crud.demo.modelo.Cliente;

@Service
public class ClienteService implements IclienteService {
    
    @Autowired
    private ICliente data;
    
    @Override
    public List<Cliente> Listar() {
        return (List<Cliente>) data.findAll();
    }

    @Override
    public Optional<Cliente> listarid(int id) {
        return data.findById(id); // Implementación para encontrar un cliente por su ID
    }

    @Override
    public int save(Cliente c) {
        // Aquí deberías implementar la lógica para guardar un nuevo cliente
        // Esta función puede devolver un código de estado o el ID del cliente guardado
        // Implementación ficticia de ejemplo:
        data.save(c);
        return c.getId(); // Devuelve el ID del cliente guardado
    }

    @Override
    public void delete(int id) {
        // Aquí deberías implementar la lógica para eliminar un cliente por su ID
        data.deleteById(id);
    }
}
