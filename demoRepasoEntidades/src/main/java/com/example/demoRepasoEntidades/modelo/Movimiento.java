package com.example.demoRepasoEntidades.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="movimientos")
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovimiento;

    private LocalDate fecha;
    @Column(length = 10,nullable = false)
    private String tipoMovimientos;
    @Column(nullable = false)
    private double cantidad;
    @ManyToOne
    @JoinColumn(name="id_cuenta", nullable = false, foreignKey = @ForeignKey(name="FK_movimientos_cuentas"))
    private Cuenta cuenta;


}
