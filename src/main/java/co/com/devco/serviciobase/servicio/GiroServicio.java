package co.com.devco.serviciobase.servicio;

import co.com.devco.serviciobase.modelo.Transaccion;

public interface GiroServicio {

    Transaccion consultarGiro(String idTransaccion, String fechaInicio, String fechaFin);
}
