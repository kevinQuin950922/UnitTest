package co.com.devco.serviciobase.dao.mapeador;

import co.com.devco.serviciobase.dao.modelo.TransaccionExterna;
import co.com.devco.serviciobase.modelo.*;
import org.springframework.util.StringUtils;

import static java.util.Optional.ofNullable;

public final class GiroDAOMapeador {

    private GiroDAOMapeador() {
        //No puede ser inicializada
    }

    public static Transaccion mapear(TransaccionExterna transaccionExterna) {
        return ofNullable(transaccionExterna).map( x -> {
            return Transaccion
                    .builder()
                    .ubicacionOrigen(mapear(x.getUbicacionOrigen()))
                    .ubicacionDestino(mapear(x.getUbicacionDestino()))
                    .companiaOrigen(mapearPersonaJuridica(x.getCompaniaOrigen()))
                    .companiaDestino(mapearPersonaJuridica(x.getCompaniaDestino()))
                    .remitente( mapearPersona(x.getRemitente()))
                    .destinatario(mapearPersona(x.getDestinatario()))
                    .fecha(x.getFecha())
                    .tipoEstado(x.getTipoEstado())
                    .valor(x.getValor())
                    .build();
        }).orElse(null);
    }

    private static Ubicacion mapear(Ubicacion ubicacion) {
        return ofNullable(ubicacion).map(x -> {
            return Ubicacion
                    .builder()
                    .identificador(x.getIdentificador())
                    .nombre(x.getNombre())
                    .tipoUbicacion(x.getTipoUbicacion())
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
