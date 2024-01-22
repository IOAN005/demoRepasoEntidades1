package com.example.demoRepasoEntidades.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cuentaDT")
public class CDT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInversion;
    private LocalDate mesApertura;
    @Column(nullable = false)
    private double interesesMensuales;
    @Column(nullable = false)
    private double valorInversion;
    @Column(length = 5,nullable = false)
    private String estado;
    @ManyToOne
    @JoinColumn(name = "cuenta",nullable = false,foreignKey = @ForeignKey(name="FK_cdts_cuenta"))
    private Cuenta cuenta;

}
