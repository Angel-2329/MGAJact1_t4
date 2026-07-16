package com.mgaj.act1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Controlador2
{
    @GetMapping("/endpointDespedida")
    public String endpointString ()
    {
        return "Endpoint de despedida";
    }

}
