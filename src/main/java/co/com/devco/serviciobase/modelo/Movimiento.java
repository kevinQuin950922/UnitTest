package co.com.devco.serviciobase.modelo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Movimiento {

    private String fechaInicio;
    private String fechaFin;
    private Oficina oficinaOrigen;
    private Oficina oficinaDestino;
    private TipoEstado estadoInicio;
    private TipoEstado estadoFin;
    private Persona cliente;


}



