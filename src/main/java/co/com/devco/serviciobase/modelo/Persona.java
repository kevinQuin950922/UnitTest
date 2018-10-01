package co.com.devco.serviciobase.modelo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Persona {

    private TipoDocumento tipoDocumento;
    private String identificador;
    private String nombres;
    private String apellidos;
    private String razonSocial;
    private String genero;
    private Direccion direccion;


}



