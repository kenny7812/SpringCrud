package com.crud.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.demo.interfaceService.IclienteService;
import com.crud.demo.modelo.Cliente;

@Controller
@RequestMapping
public class Controlador {
    
    @Autowired
    private IclienteService service;
    
    @GetMapping("/listar") 
    public String listar(Model model) {
        List<Cliente> clientes = service.Listar();
        model.addAttribute("clientes", clientes);
        return "index"; // Suponiendo que "index" es la vista que muestra la lista de clientes
    }
}
