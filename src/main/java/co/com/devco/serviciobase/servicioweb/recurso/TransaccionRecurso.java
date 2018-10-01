package co.com.devco.serviciobase.servicioweb.recurso;

import co.com.devco.serviciobase.modelo.Persona;
import co.com.devco.serviciobase.modelo.TipoEstado;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class TransaccionRecurso {

    private Persona remitente;
    private Persona destinatario;
    private String fecha;
    private TipoEstado tipoEstado;
    private int valor;
}
