package co.com.devco.serviciobase.modelo;

public enum TipoEstado {

    //estado de transaccion
    DISPONIBLE("DISPONIBLE"),
    NO_DISPONIBLE("NO DISPONIBLE"),

    //estados giro
    BORRADOR("BORRADOR"),
    CREADO("CREADO"),
    PAGADO("PAGADO"),
    CANCELADO("CANCELADO");

    private String value;

    TipoEstado(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }


}



