package com.cibertec.reservaBackTorres.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlumnoCreateDTO {
    private String nombres;
    private String apePaterno;
    private String apeMaterno;
    private Long celular;
    private String email;
}
