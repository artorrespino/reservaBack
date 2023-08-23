package com.cibertec.reservaBackTorres.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tb_sede")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codCarrera", nullable = false)
    private Long codSede;

    @Column(name="desCarrera", length = 200, nullable = false)
    private String desSede;
}
