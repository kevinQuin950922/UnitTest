package co.com.devco.serviciobase.servicio.impl;

import co.com.devco.serviciobase.fachada.GiroFachada;
import co.com.devco.serviciobase.modelo.Transaccion;
import co.com.devco.serviciobase.servicio.GiroServicio;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class GiroServicioImpl implements GiroServicio {

    private GiroFachada giroFachada;

    public GiroServicioImpl(GiroFachada giroFachada) {
        this.giroFachada = giroFachada;
    }

    @Override
    public Transaccion consultarGiro(String idTransaccion, String fechaInicio, String fechaFin) {
        validarIdTransaccion(idTransaccion);
        validarFecha(fechaInicio, "fechaInicio");
        validarFormatoFecha(fechaInicio, "fechaInicio");
        validarFecha(fechaFin, "fechaFin");
        validarFormatoFecha(fechaFin, "fechaFin");
        return giroFachada.consultarGiro();
    }

    protected void validarIdTransaccion(String idTransaccion) {
        if (StringUtils.isEmpty(idTransaccion)) {
            throw new RuntimeException("Id de transaccion invalida");
        }
    }

    protected void validarFecha(String fecha, String atributo) {
        if (StringUtils.isEmpty(fecha)) {
            throw new RuntimeException("Fecha invalida");
        }
    }

    protected void validarFormatoFecha(String fecha, String atributo) {
        if (StringUtils.isEmpty(fecha)) {
            throw new RuntimeException("Fecha invalida");
        }
    }
}
