package com.mgaj.act1.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Controlador1 
{
    @GetMapping("/endpointSaludo")
    public String endpointString ()
    {
        return "Endpoint que da un String: Hecho por AJMG";
    }

    @GetMapping("/endpointLista")
    public Map <String, Object> endpointLista ()
    {
        Map <String, Object> Lista = new HashMap<>();
        Lista.put("Nombre", "Angel");
        Lista.put("Apellido", "Mendez");
        Lista.put("Semestre", "7");
        Lista.put("Edad", "21");
        return Lista;
    }
    
    @GetMapping("/endpointEdad")
    public int endpointNumero ()
    {
        return 67;
    }

}
