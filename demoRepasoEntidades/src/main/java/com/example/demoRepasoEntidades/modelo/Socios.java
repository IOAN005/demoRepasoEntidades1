package com.example.demoRepasoEntidades.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="socios")
public class Socios {


    @Id
    @Column(length = 9, nullable = false)
    private String dni;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(length = 120, nullable = false)
    private String direccion;

    //opcional -solo que lo pida el front
    @OneToMany(mappedBy = "socio",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Barcos> barco;

    @Override
    public String toString() {
        return "Socios{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", barco=" + barco +
                '}';
    }

    public Socios(String dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void setBarco(List<Barcos> barco) {
        this.barco = barco;
    }
}

