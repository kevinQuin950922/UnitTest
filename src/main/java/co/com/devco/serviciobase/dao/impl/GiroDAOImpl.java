package co.com.devco.serviciobase.dao.impl;

import java.io.File;
import java.io.IOException;
import java.util.function.Function;

import co.com.devco.serviciobase.dao.GiroDAO;
import co.com.devco.serviciobase.dao.mapeador.GiroDAOMapeador;
import co.com.devco.serviciobase.dao.modelo.TransaccionExterna;
import co.com.devco.serviciobase.modelo.Transaccion;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class GiroDAOImpl implements GiroDAO {

    private Function<TransaccionExterna, Transaccion> covertirAModelo = GiroDAOMapeador::mapear;

    @Override
    public Transaccion consultarGiro() {

        TransaccionExterna transaccionExterna = consultarGiroExterno();

        Transaccion transaccion = covertirAModelo.apply(transaccionExterna);

        return transaccion;
    }

    private TransaccionExterna consultarGiroExterno() {
        ObjectMapper mapper = new ObjectMapper();
        TransaccionExterna transaccionExterna = null;

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("TransaccionExterna.json").getFile());

        try {
            transaccionExterna = mapper.readValue(file, TransaccionExterna.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return transaccionExterna;
    }
}
