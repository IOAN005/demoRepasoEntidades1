package com.example.demoRepasoEntidades.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cuentas_ahorro")
public class CuentaAhorro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idCuenta;
    @Column(nullable = false)
    private double interesMensual;

    @OneToOne
    @JoinColumn(name = "id_cuenta", nullable = false, foreignKey = @ForeignKey(name = "FK_cuenta_ahorro_cuenta"))
    private Cuenta cuenta;
}
