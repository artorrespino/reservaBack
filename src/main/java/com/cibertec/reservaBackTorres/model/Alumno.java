package com.cibertec.reservaBackTorres.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tb_alumno")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codAlumno")
    private Long codAlumno;

    @Column(name = "nombres", length = 100, nullable = false)
    private String nombres;

    @Column(name = "apePaterno", length = 100, nullable = false)
    private String apePaterno;

    @Column(name = "apeMaterno", length = 100, nullable = false)
    private String apeMaterno;

    @Column(name = "celular",nullable = false)
    private Long celular;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

}
