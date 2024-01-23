package com.example.demoRepasoEntidades.servicio;

import com.example.demoRepasoEntidades.modelo.Patron;
import com.example.demoRepasoEntidades.modelo.Socios;

import java.util.List;

public interface IPatronService {
    List<Patron> monstrarTodos();
    Patron monstraUno (String dni);
    Patron insertar(Patron p1);
    Patron modificar (Patron p1);
    void eliminar(String dni);
}
