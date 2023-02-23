package co.com.devco.serviciobase.servicio.impl;

import co.com.devco.serviciobase.fachada.GiroFachada;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;

public class GiroServicioImplTest {

    @Mock
    GiroFachada giroFachada;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testConsultarGiroCuandoSeIngresaIdTransaccionVacioEntoncesDebeRetornarUnaExepcion() {
        // arrange
        String idTransaccion = "";
        String fechaInicio = anyString();
        String fechaFin = anyString();
        GiroServicioImpl giroServicio = new GiroServicioImpl(giroFachada);
        String mensajeEsperado="Id de transaccion invalida";
        //act
        Exception exception = assertThrows(RuntimeException.class,()-> giroServicio.consultarGiro(idTransaccion,fechaInicio,fechaFin));
        String mensajeCapturado = exception.getMessage();
        //assert
        assertEquals(mensajeCapturado,mensajeEsperado);
    }
}
