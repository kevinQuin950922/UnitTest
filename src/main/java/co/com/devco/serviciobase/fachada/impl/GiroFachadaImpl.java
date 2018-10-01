package co.com.devco.serviciobase.fachada.impl;

import co.com.devco.serviciobase.dao.GiroDAO;
import co.com.devco.serviciobase.fachada.GiroFachada;
import co.com.devco.serviciobase.modelo.Transaccion;
import org.springframework.stereotype.Component;

@Component
public class GiroFachadaImpl implements GiroFachada {

    private GiroDAO giroDAO;

    public GiroFachadaImpl(GiroDAO giroDAO){
        this.giroDAO = giroDAO;
    }

    @Override
    public Transaccion consultarGiro() {
        return giroDAO.consultarGiro();
    }
}
