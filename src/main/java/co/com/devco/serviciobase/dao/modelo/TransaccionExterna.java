package co.com.devco.serviciobase.dao.modelo;

import co.com.devco.serviciobase.modelo.Movimiento;
import co.com.devco.serviciobase.modelo.Persona;
import co.com.devco.serviciobase.modelo.TipoEstado;
import co.com.devco.serviciobase.modelo.Ubicacion;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TransaccionExterna {

    private Ubicacion ubicacionOrigen;
    private Ubicacion ubicacionDestino;
    private Persona companiaOrigen;
    private Persona companiaDestino;
    private Persona remitente;
    private Persona destinatario;
    private String fecha;
    private TipoEstado tipoEstado;
    private Integer valor;
    private List<Movimiento> historialMovimientos;

}



