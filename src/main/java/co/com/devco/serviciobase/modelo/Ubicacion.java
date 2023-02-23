package co.com.devco.serviciobase.modelo;

public class Ubicacion {

    private String identificador;
    private String nombre;
    private TipoUbicacion tipoUbicacion;
    private Ubicacion ubicacionPadre;

    Ubicacion(String identificador, String nombre, TipoUbicacion tipoUbicacion, Ubicacion ubicacionPadre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tipoUbicacion = tipoUbicacion;
        this.ubicacionPadre = ubicacionPadre;
    }

    public static UbicacionBuilder builder() {
        return new UbicacionBuilder();
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public TipoUbicacion getTipoUbicacion() {
        return this.tipoUbicacion;
    }

    public Ubicacion getUbicacionPadre() {
        return this.ubicacionPadre;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoUbicacion(TipoUbicacion tipoUbicacion) {
        this.tipoUbicacion = tipoUbicacion;
    }

    public void setUbicacionPadre(Ubicacion ubicacionPadre) {
        this.ubicacionPadre = ubicacionPadre;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Ubicacion)) return false;
        final Ubicacion other = (Ubicacion) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$identificador = this.getIdentificador();
        final Object other$identificador = other.getIdentificador();
        if (this$identificador == null ? other$identificador != null : !this$identificador.equals(other$identificador))
            return false;
        final Object this$nombre = this.getNombre();
        final Object other$nombre = other.getNombre();
        if (this$nombre == null ? other$nombre != null : !this$nombre.equals(other$nombre)) return false;
        final Object this$tipoUbicacion = this.getTipoUbicacion();
        final Object other$tipoUbicacion = other.getTipoUbicacion();
        if (this$tipoUbicacion == null ? other$tipoUbicacion != null : !this$tipoUbicacion.equals(other$tipoUbicacion))
            return false;
        final Object this$ubicacionPadre = this.getUbicacionPadre();
        final Object other$ubicacionPadre = other.getUbicacionPadre();
        if (this$ubicacionPadre == null ? other$ubicacionPadre != null : !this$ubicacionPadre.equals(other$ubicacionPadre))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Ubicacion;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $identificador = this.getIdentificador();
        result = result * PRIME + ($identificador == null ? 43 : $identificador.hashCode());
        final Object $nombre = this.getNombre();
        result = result * PRIME + ($nombre == null ? 43 : $nombre.hashCode());
        final Object $tipoUbicacion = this.getTipoUbicacion();
        result = result * PRIME + ($tipoUbicacion == null ? 43 : $tipoUbicacion.hashCode());
        final Object $ubicacionPadre = this.getUbicacionPadre();
        result = result * PRIME + ($ubicacionPadre == null ? 43 : $ubicacionPadre.hashCode());
        return result;
    }

    public String toString() {
        return "Ubicacion(identificador=" + this.getIdentificador() + ", nombre=" + this.getNombre() + ", tipoUbicacion=" + this.getTipoUbicacion() + ", ubicacionPadre=" + this.getUbicacionPadre() + ")";
    }

    public static class UbicacionBuilder {
        private String identificador;
        private String nombre;
        private TipoUbicacion tipoUbicacion;
        private Ubicacion ubicacionPadre;

        UbicacionBuilder() {
        }

        public UbicacionBuilder identificador(String identificador) {
            this.identificador = identificador;
            return this;
        }

        public UbicacionBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public UbicacionBuilder tipoUbicacion(TipoUbicacion tipoUbicacion) {
            this.tipoUbicacion = tipoUbicacion;
            return this;
        }

        public UbicacionBuilder ubicacionPadre(Ubicacion ubicacionPadre) {
            this.ubicacionPadre = ubicacionPadre;
            return this;
        }

        public Ubicacion build() {
            return new Ubicacion(identificador, nombre, tipoUbicacion, ubicacionPadre);
        }

        public String toString() {
            return "Ubicacion.UbicacionBuilder(identificador=" + this.identificador + ", nombre=" + this.nombre + ", tipoUbicacion=" + this.tipoUbicacion + ", ubicacionPadre=" + this.ubicacionPadre + ")";
        }
    }
}



