package co.com.devco.serviciobase.modelo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Grupo {

    private String identificador;
    private String nombre;
    private Persona representante;


}



