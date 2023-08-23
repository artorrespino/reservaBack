package com.cibertec.reservaBackTorres.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlumnoDTO {
    private Long codAlumno;
    private String nombres;
    private String apePaterno;
    private String apeMaterno;
    private Long celular;
    private String email;

}
