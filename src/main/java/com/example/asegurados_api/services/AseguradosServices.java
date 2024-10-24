package com.example.asegurados_api.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.asegurados_api.model.Asegurado;
import com.example.asegurados_api.model.Direccion;

@Service
public class AseguradosServices {
    public List<Asegurado> obtenerAsegurados() {
        List<Asegurado> asegurados = new ArrayList<>();
        // Datos en duro
        asegurados.add(new Asegurado("410230009871", "Juan", "Perez", "Lopez", "juan.perez@mail.com", "1234567890", new Direccion("Calle 1", "Colonia A", "Ciudad X")));
        asegurados.add(new Asegurado("410230006548", "Maria", "Garcia", "Martinez", "maria.garcia@mail.com", "0987654321", new Direccion("Calle 2", "Colonia B", "Ciudad Y")));
        asegurados.add(new Asegurado("410230001597", "Luis", "Ramirez", "Gomez", "luis.ramirez@mail.com", "1122334455", new Direccion("Calle 3", "Colonia C", "Ciudad Z")));
 
        // Ordenar
        asegurados.sort(Comparator.comparing(Asegurado::getNumeroPoliza));
        return asegurados;
    }
}
