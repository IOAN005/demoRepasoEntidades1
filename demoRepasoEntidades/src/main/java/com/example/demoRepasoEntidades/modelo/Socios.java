package com.example.demoRepasoEntidades.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
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

    // @ManyToOne
    // @JoinColumn(name = "dni", nullable = false, foreignKey = @ForeignKey(name = "FK_socio_barco"))
    // private Socio c1;
}

