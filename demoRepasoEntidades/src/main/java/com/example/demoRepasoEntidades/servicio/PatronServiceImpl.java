package com.example.demoRepasoEntidades.servicio;

import com.example.demoRepasoEntidades.modelo.Patron;
import com.example.demoRepasoEntidades.modelo.Socios;
import com.example.demoRepasoEntidades.repository.IPatronRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PatronServiceImpl implements IPatronService{
    @Autowired
    private IPatronRepo repo;
    @Override
    public List<Patron> monstrarTodos() {
        return repo.findAll();
    }

    @Override
    public Patron monstraUno(String dni) {
        return repo.findById(dni).orElse(new Patron());
    }

    @Override
    public Patron insertar(Patron p1) {
        return repo.save(p1);
    }

    @Override
    public Patron modificar(Patron p1) {
        return repo.save(p1);
    }

    @Override
    public void eliminar(String dni) {
        repo.deleteById(dni);

    }
}
