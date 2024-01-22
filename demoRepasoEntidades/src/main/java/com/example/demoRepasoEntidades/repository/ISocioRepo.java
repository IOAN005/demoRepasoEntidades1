package com.example.demoRepasoEntidades.repository;

import com.example.demoRepasoEntidades.modelo.Socios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISocioRepo extends JpaRepository<Socios,String> {
}
