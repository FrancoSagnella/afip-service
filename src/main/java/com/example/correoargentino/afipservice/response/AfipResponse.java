package com.example.correoargentino.afipservice.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AfipResponse {
    private long id_usuario;
    private String nombre;
    private String apellido;
    private String dni;
    private long cuit;
    private String telefono;
    private String provincia;
    private String localidad;
    private String direccion;
    private String codigo_postal;
    private String rubro;
    private String condicion_impositiva;
    private long id_cuenta;

}
