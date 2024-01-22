package com.example.demoRepasoEntidades.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @Column(length = 10,nullable = false)
    private String nif;
    @Column(length = 30,nullable = false)
    private String nombre;
    private LocalDate mes ;
    @Column (length =120,nullable = false )
    private String dirrecion;
}
