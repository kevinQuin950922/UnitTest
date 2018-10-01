package co.com.devco.serviciobase.modelo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Transaccion {

    private Ubicacion ubicacionOrigen;
    private Ubicacion ubicacionDestino;
    private Persona companiaOrigen;
    private Persona companiaDestino;
    private Persona remitente;
    private Persona destinatario;
    private String fecha;
    private TipoEstado tipoEstado;
    private int valor;

}



