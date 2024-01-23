package com.example.demoRepasoEntidades.repository;

import com.example.demoRepasoEntidades.modelo.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatronRepo extends JpaRepository<Patron,String> {
}
