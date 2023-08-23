package com.cibertec.reservaBackTorres.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class SedeDTO {
    private Long codSede;
    private String desSede;
}
