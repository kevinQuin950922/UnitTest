package co.com.devco.serviciobase.modelo;

public enum TipoUbicacion {

    PAIS("PAIS", "123"),

    DEPARTAMENTO("DEPARTAMENTO", "456"),

    CIUDAD("CIUDAD", "789");

    private String value;
    private String code;

    TipoUbicacion(String value, String code) {
        this.value = value;
        this.code = code;
    }


    public String getValue() {
        return value;
    }
    public String getCode() {
        return code;
    }


}



