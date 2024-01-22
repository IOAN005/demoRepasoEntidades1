package com.example.demoRepasoEntidades.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Barcos")
public class Barcos {
    @Id
    @Column(length = 9)
    private String matricula;
    @Column(nullable = false)
    private int amarre;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(nullable = false)
    private double cuota;

    @ManyToOne
    @JoinColumn(name="dni" ,nullable = false,foreignKey =@ForeignKey(name="FK_barcos_socios") )
private Socios socio;
}
