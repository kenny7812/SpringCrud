package com.crud.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.crud.demo.modelo.Cliente;

public interface IclienteService {
    public List<Cliente> Listar();
    public Optional<Cliente> listarid(int id);
    public int save(Cliente c);
    public void delete(int id);
}

