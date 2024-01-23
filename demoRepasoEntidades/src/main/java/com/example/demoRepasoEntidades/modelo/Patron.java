package com.example.demoRepasoEntidades.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "patrones")
public class Patron {
    @Id
    @Column(length = 9,nullable = false)
    private String dni;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(length = 60,nullable = false)
    private String direccion;
    @OneToMany(mappedBy = "patron",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    List<Salidas> s1;

    public Patron(String dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void setS1(List<Salidas> s1) {
        this.s1 = s1;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", s1=" + s1 +
                '}';
    }
}

