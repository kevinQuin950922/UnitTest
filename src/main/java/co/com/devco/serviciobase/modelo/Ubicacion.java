package co.com.devco.serviciobase.modelo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Ubicacion {

    private String identificador;
    private String nombre;
    private TipoUbicacion tipoUbicacion;
    private Ubicacion ubicacionPadre;

}



