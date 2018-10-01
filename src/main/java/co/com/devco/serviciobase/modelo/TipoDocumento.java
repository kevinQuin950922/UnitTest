package co.com.devco.serviciobase.modelo;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class TipoDocumento {

    private String codigo;
    private String descripcion;

}



