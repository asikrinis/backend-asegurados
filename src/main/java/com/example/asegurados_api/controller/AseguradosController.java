package com.example.asegurados_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asegurados_api.model.Asegurado;
import com.example.asegurados_api.services.AseguradosServices;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/asegurados")
public class AseguradosController {
    @Autowired
    AseguradosServices aseguradosServices;

    @GetMapping
    public List<Asegurado> obtenerAsegurados() {
        return aseguradosServices.obtenerAsegurados();
    }

}