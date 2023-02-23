package co.com.devco.serviciobase.modelo;

public class Direccion {

    private String identificador;
    private String descripcion;
    private TipoEstado tipoEstado;

    Direccion(String identificador, String descripcion, TipoEstado tipoEstado) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.tipoEstado = tipoEstado;
    }

    public static DireccionBuilder builder() {
        return new DireccionBuilder();
    }


    public String getIdentificador() {
        return this.identificador;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public TipoEstado getTipoEstado() {
        return this.tipoEstado;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipoEstado(TipoEstado tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Direccion)) return false;
        final Direccion other = (Direccion) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$identificador = this.getIdentificador();
        final Object other$identificador = other.getIdentificador();
        if (this$identificador == null ? other$identificador != null : !this$identificador.equals(other$identificador))
            return false;
        final Object this$descripcion = this.getDescripcion();
        final Object other$descripcion = other.getDescripcion();
        if (this$descripcion == null ? other$descripcion != null : !this$descripcion.equals(other$descripcion))
            return false;
        final Object this$tipoEstado = this.getTipoEstado();
        final Object other$tipoEstado = other.getTipoEstado();
        if (this$tipoEstado == null ? other$tipoEstado != null : !this$tipoEstado.equals(other$tipoEstado))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Direccion;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $identificador = this.getIdentificador();
        result = result * PRIME + ($identificador == null ? 43 : $identificador.hashCode());
        final Object $descripcion = this.getDescripcion();
        result = result * PRIME + ($descripcion == null ? 43 : $descripcion.hashCode());
        final Object $tipoEstado = this.getTipoEstado();
        result = result * PRIME + ($tipoEstado == null ? 43 : $tipoEstado.hashCode());
        return result;
    }

    public String toString() {
        return "Direccion(identificador=" + this.getIdentificador() + ", descripcion=" + this.getDescripcion() + ", tipoEstado=" + this.getTipoEstado() + ")";
    }

    public static class DireccionBuilder {
        private String identificador;
        private String descripcion;
        private TipoEstado tipoEstado;

        DireccionBuilder() {
        }

        public DireccionBuilder identificador(String identificador) {
            this.identificador = identificador;
            return this;
        }

        public DireccionBuilder descripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public DireccionBuilder tipoEstado(TipoEstado tipoEstado) {
            this.tipoEstado = tipoEstado;
            return this;
        }

        public Direccion build() {
            return new Direccion(identificador, descripcion, tipoEstado);
        }

        public String toString() {
            return "Direccion.DireccionBuilder(identificador=" + this.identificador + ", descripcion=" + this.descripcion + ", tipoEstado=" + this.tipoEstado + ")";
        }
    }
}



