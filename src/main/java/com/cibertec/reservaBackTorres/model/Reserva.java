package com.cibertec.reservaBackTorres.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tb_reserva")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codReserva", nullable = false)
    private Long codReserva;

    @Column(name = "fechaReserva", nullable = false)
    private Date fechaReserva;

    @Column(name="codSede", nullable = false)
    private Long codSede;

    @Column(name="codCarrera", nullable = false)
    private Long codCarrera;

    @Column(name="codAlumno", nullable = false)
    private Long codAlumno;

}
