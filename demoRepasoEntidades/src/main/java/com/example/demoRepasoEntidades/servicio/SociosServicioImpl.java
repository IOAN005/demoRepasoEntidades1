package com.example.demoRepasoEntidades.servicio;

import com.example.demoRepasoEntidades.modelo.Socios;
import com.example.demoRepasoEntidades.repository.ISocioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class SociosServicioImpl implements ISocioServicio{
    @Autowired
    private ISocioRepo repo;
    @Override
    public List<Socios> monstrarTodos() {
        return repo.findAll();
    }

    @Override
    public Socios monstraUno(String dni) {
        return repo.findById(dni).orElse(new Socios());
    }

    @Override
    public Socios insertar(Socios s1) {
        return null;
    }

    @Override
    public Socios modificar(Socios s1) {
        return null;
    }

    @Override
    public void eliminar(String dni) {

    }
}
