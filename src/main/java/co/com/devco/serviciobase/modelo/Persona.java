package co.com.devco.serviciobase.modelo;

public class Persona {

    private TipoDocumento tipoDocumento;
    private String identificador;
    private String nombres;
    private String apellidos;
    private String razonSocial;
    private String genero;
    private Direccion direccion;

    Persona(TipoDocumento tipoDocumento, String identificador, String nombres, String apellidos, String razonSocial, String genero, Direccion direccion) {
        this.tipoDocumento = tipoDocumento;
        this.identificador = identificador;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.razonSocial = razonSocial;
        this.genero = genero;
        this.direccion = direccion;
    }

    public static PersonaBuilder builder() {
        return new PersonaBuilder();
    }


    public TipoDocumento getTipoDocumento() {
        return this.tipoDocumento;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public String getNombres() {
        return this.nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getRazonSocial() {
        return this.razonSocial;
    }

    public String getGenero() {
        return this.genero;
    }

    public Direccion getDireccion() {
        return this.direccion;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Persona)) return false;
        final Persona other = (Persona) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$tipoDocumento = this.getTipoDocumento();
        final Object other$tipoDocumento = other.getTipoDocumento();
        if (this$tipoDocumento == null ? other$tipoDocumento != null : !this$tipoDocumento.equals(other$tipoDocumento))
            return false;
        final Object this$identificador = this.getIdentificador();
        final Object other$identificador = other.getIdentificador();
        if (this$identificador == null ? other$identificador != null : !this$identificador.equals(other$identificador))
            return false;
        final Object this$nombres = this.getNombres();
        final Object other$nombres = other.getNombres();
        if (this$nombres == null ? other$nombres != null : !this$nombres.equals(other$nombres)) return false;
        final Object this$apellidos = this.getApellidos();
        final Object other$apellidos = other.getApellidos();
        if (this$apellidos == null ? other$apellidos != null : !this$apellidos.equals(other$apellidos)) return false;
        final Object this$razonSocial = this.getRazonSocial();
        final Object other$razonSocial = other.getRazonSocial();
        if (this$razonSocial == null ? other$razonSocial != null : !this$razonSocial.equals(other$razonSocial))
            return false;
        final Object this$genero = this.getGenero();
        final Object other$genero = other.getGenero();
        if (this$genero == null ? other$genero != null : !this$genero.equals(other$genero)) return false;
        final Object this$direccion = this.getDireccion();
        final Object other$direccion = other.getDireccion();
        if (this$direccion == null ? other$direccion != null : !this$direccion.equals(other$direccion)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Persona;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $tipoDocumento = this.getTipoDocumento();
        result = result * PRIME + ($tipoDocumento == null ? 43 : $tipoDocumento.hashCode());
        final Object $identificador = this.getIdentificador();
        result = result * PRIME + ($identificador == null ? 43 : $identificador.hashCode());
        final Object $nombres = this.getNombres();
        result = result * PRIME + ($nombres == null ? 43 : $nombres.hashCode());
        final Object $apellidos = this.getApellidos();
        result = result * PRIME + ($apellidos == null ? 43 : $apellidos.hashCode());
        final Object $razonSocial = this.getRazonSocial();
        result = result * PRIME + ($razonSocial == null ? 43 : $razonSocial.hashCode());
        final Object $genero = this.getGenero();
        result = result * PRIME + ($genero == null ? 43 : $genero.hashCode());
        final Object $direccion = this.getDireccion();
        result = result * PRIME + ($direccion == null ? 43 : $direccion.hashCode());
        return result;
    }

    public String toString() {
        return "Persona(tipoDocumento=" + this.getTipoDocumento() + ", identificador=" + this.getIdentificador() + ", nombres=" + this.getNombres() + ", apellidos=" + this.getApellidos() + ", razonSocial=" + this.getRazonSocial() + ", genero=" + this.getGenero() + ", direccion=" + this.getDireccion() + ")";
    }

    public static class PersonaBuilder {
        private TipoDocumento tipoDocumento;
        private String identificador;
        private String nombres;
        private String apellidos;
        private String razonSocial;
        private String genero;
        private Direccion direccion;

        PersonaBuilder() {
        }

        public PersonaBuilder tipoDocumento(TipoDocumento tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
            return this;
        }

        public PersonaBuilder identificador(String identificador) {
            this.identificador = identificador;
            return this;
        }

        public PersonaBuilder nombres(String nombres) {
            this.nombres = nombres;
            return this;
        }

        public PersonaBuilder apellidos(String apellidos) {
            this.apellidos = apellidos;
            return this;
        }

        public PersonaBuilder razonSocial(String razonSocial) {
            this.razonSocial = razonSocial;
            return this;
        }

        public PersonaBuilder genero(String genero) {
            this.genero = genero;
            return this;
        }

        public PersonaBuilder direccion(Direccion direccion) {
            this.direccion = direccion;
            return this;
        }

        public Persona build() {
            return new Persona(tipoDocumento, identificador, nombres, apellidos, razonSocial, genero, direccion);
        }

        public String toString() {
            return "Persona.PersonaBuilder(tipoDocumento=" + this.tipoDocumento + ", identificador=" + this.identificador + ", nombres=" + this.nombres + ", apellidos=" + this.apellidos + ", razonSocial=" + this.razonSocial + ", genero=" + this.genero + ", direccion=" + this.direccion + ")";
        }
    }
}



