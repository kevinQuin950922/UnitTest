package co.com.devco.serviciobase.servicioweb.recurso;

import javax.xml.bind.annotation.XmlRootElement;

import co.com.devco.serviciobase.modelo.Persona;
import co.com.devco.serviciobase.modelo.TipoEstado;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@Schema(description = "TransaccionRecurso")
@XmlRootElement
public class TransaccionRecurso {

    private Persona remitente;
    private Persona destinatario;
    private String fecha;
    private TipoEstado tipoEstado;
    private int valor;
}
