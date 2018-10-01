package co.com.devco.serviciobase.modelo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Oficina {

    private String identificador;
    private String nombre;
    private Direccion direccion;
    private Grupo grupo;

}



