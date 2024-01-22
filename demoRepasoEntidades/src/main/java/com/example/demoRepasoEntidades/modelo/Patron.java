package com.example.demoRepasoEntidades.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "patrones")
public class Patron {
    @Id
    @Column(length = 9,nullable = false)
    private String dni;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(length = 60,nullable = false)
    private String direccion; }