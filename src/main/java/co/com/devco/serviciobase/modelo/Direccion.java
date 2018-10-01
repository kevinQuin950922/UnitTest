package co.com.devco.serviciobase.modelo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Direccion {

    private String identificador;
    private String descripcion;
    private TipoEstado tipoEstado;


}



