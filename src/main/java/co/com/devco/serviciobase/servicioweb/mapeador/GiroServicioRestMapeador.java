package co.com.devco.serviciobase.servicioweb.mapeador;

import co.com.devco.serviciobase.modelo.Direccion;
import co.com.devco.serviciobase.modelo.Persona;
import co.com.devco.serviciobase.modelo.TipoDocumento;
import co.com.devco.serviciobase.modelo.Transaccion;
import co.com.devco.serviciobase.servicioweb.recurso.TransaccionRecurso;
import org.springframework.util.StringUtils;

import static java.util.Optional.ofNullable;

public class GiroServicioRestMapeador {

    private GiroServicioRestMapeador(){
        //No puede ser inicializada
    }

    public static TransaccionRecurso convertirARecurso(Transaccion transaccion){
        return ofNullable(transaccion).map(x -> {
            return TransaccionRecurso
                    .builder()
                    .remitente(mapearPersona(x.getRemitente()))
                    .destinatario(mapearPersona(x.getDestinatario()))
                    .fecha(x.getFecha())
                    .valor(x.getValor())
                    .tipoEstado(x.getTipoEstado())
                    .build();
        }).orElse(null);
    }

    private static Persona mapearPersona (Persona persona){
        TipoDocumento tipoDocumento = persona.getTipoDocumento();
        if(tipoDocumento != null || StringUtils.isEmpty(tipoDocumento.getCodigo())){
            if(tipoDocumento.getCodigo().equals("456")){
                return mapearPersonaNatural(persona);
            }else {
                return mapearPersonaJuridica(persona);
            }
        }else {
            throw new RuntimeException("Tipo de documento no identificado");
        }
    }

    private static Persona mapearPersonaJuridica(Persona personaJuridica) {
        return ofNullable(personaJuridica).map(x -> {
            return Persona
                    .builder()
                    .identificador(x.getIdentificador())
                    .razonSocial(x.getRazonSocial())
                    .tipoDocumento(mapear(x.getTipoDocumento()))
                    .build();
        }).orElse(null);
    }

    private static Persona mapearPersonaNatural(Persona personaNatural) {
        return ofNullable(personaNatural).map(x -> {
            return Persona
                    .builder()
                    .identificador(x.getIdentificador())
                    .nombres(x.getNombres())
                    .apellidos(x.getApellidos())
                    .tipoDocumento(mapear(x.getTipoDocumento()))
                    .direccion(mapear(x.getDireccion()))
                    .genero(x.getGenero())
                    .build();
        }).orElse(null);
    }

    private static TipoDocumento mapear(TipoDocumento tipoDocumento) {
        return ofNullable(tipoDocumento).map(x -> {
            return TipoDocumento
                    .builder()
                    .codigo(x.getCodigo())
                    .descripcion(x.getDescripcion())
                    .build();
        }).orElse(null);
    }

    private static Direccion mapear(Direccion direccion) {
        return ofNullable(direccion).map(x -> {
            return Direccion
                    .builder()
                    .identificador(x.getIdentificador())
                    .descripcion(x.getDescripcion())
                    .tipoEstado(x.getTipoEstado())
                    .build();
        }).orElse(null);
    }
}
