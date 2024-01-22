package com.example.demoRepasoEntidades.servicio;

import com.example.demoRepasoEntidades.modelo.Socios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISocioServicio  {
    List<Socios> monstrarTodos();
    Socios monstraUno (String dni);
    Socios insertar(Socios s1);
    Socios modificar (Socios s1);
    void eliminar(String dni);


}
