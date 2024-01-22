package com.example.demoRepasoEntidades.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cuentas")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCuenta;
    @Column(length = 30,nullable = false)
    private String estado;
    @Column(nullable = false)
    private double saldo;

    @ManyToOne
    @JoinColumn(name="nif" ,nullable = false,foreignKey =@ForeignKey(name="FK_cuenta_clientes") )
    private Cliente cliente;
}
