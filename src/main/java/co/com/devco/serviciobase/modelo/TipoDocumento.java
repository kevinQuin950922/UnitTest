package co.com.devco.serviciobase.modelo;


public class TipoDocumento {

    private String codigo;
    private String descripcion;

    TipoDocumento(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public static TipoDocumentoBuilder builder() {
        return new TipoDocumentoBuilder();
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TipoDocumento)) return false;
        final TipoDocumento other = (TipoDocumento) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$codigo = this.getCodigo();
        final Object other$codigo = other.getCodigo();
        if (this$codigo == null ? other$codigo != null : !this$codigo.equals(other$codigo)) return false;
        final Object this$descripcion = this.getDescripcion();
        final Object other$descripcion = other.getDescripcion();
        if (this$descripcion == null ? other$descripcion != null : !this$descripcion.equals(other$descripcion))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TipoDocumento;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $codigo = this.getCodigo();
        result = result * PRIME + ($codigo == null ? 43 : $codigo.hashCode());
        final Object $descripcion = this.getDescripcion();
        result = result * PRIME + ($descripcion == null ? 43 : $descripcion.hashCode());
        return result;
    }

    public String toString() {
        return "TipoDocumento(codigo=" + this.getCodigo() + ", descripcion=" + this.getDescripcion() + ")";
    }

    public static class TipoDocumentoBuilder {
        private String codigo;
        private String descripcion;

        TipoDocumentoBuilder() {
        }

        public TipoDocumentoBuilder codigo(String codigo) {
            this.codigo = codigo;
            return this;
        }

        public TipoDocumentoBuilder descripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public TipoDocumento build() {
            return new TipoDocumento(codigo, descripcion);
        }

        public String toString() {
            return "TipoDocumento.TipoDocumentoBuilder(codigo=" + this.codigo + ", descripcion=" + this.descripcion + ")";
        }
    }
}



