package co.com.devco.serviciobase.modelo;

public class Transaccion {

    private Ubicacion ubicacionOrigen;
    private Ubicacion ubicacionDestino;
    private Persona companiaOrigen;
    private Persona companiaDestino;
    private Persona remitente;
    private Persona destinatario;
    private String fecha;
    private TipoEstado tipoEstado;
    private int valor;

    Transaccion(Ubicacion ubicacionOrigen, Ubicacion ubicacionDestino, Persona companiaOrigen, Persona companiaDestino, Persona remitente, Persona destinatario, String fecha, TipoEstado tipoEstado, int valor) {
        this.ubicacionOrigen = ubicacionOrigen;
        this.ubicacionDestino = ubicacionDestino;
        this.companiaOrigen = companiaOrigen;
        this.companiaDestino = companiaDestino;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.fecha = fecha;
        this.tipoEstado = tipoEstado;
        this.valor = valor;
    }

    public static TransaccionBuilder builder() {
        return new TransaccionBuilder();
    }

    public Ubicacion getUbicacionOrigen() {
        return this.ubicacionOrigen;
    }

    public Ubicacion getUbicacionDestino() {
        return this.ubicacionDestino;
    }

    public Persona getCompaniaOrigen() {
        return this.companiaOrigen;
    }

    public Persona getCompaniaDestino() {
        return this.companiaDestino;
    }

    public Persona getRemitente() {
        return this.remitente;
    }

    public Persona getDestinatario() {
        return this.destinatario;
    }

    public String getFecha() {
        return this.fecha;
    }

    public TipoEstado getTipoEstado() {
        return this.tipoEstado;
    }

    public int getValor() {
        return this.valor;
    }

    public void setUbicacionOrigen(Ubicacion ubicacionOrigen) {
        this.ubicacionOrigen = ubicacionOrigen;
    }

    public void setUbicacionDestino(Ubicacion ubicacionDestino) {
        this.ubicacionDestino = ubicacionDestino;
    }

    public void setCompaniaOrigen(Persona companiaOrigen) {
        this.companiaOrigen = companiaOrigen;
    }

    public void setCompaniaDestino(Persona companiaDestino) {
        this.companiaDestino = companiaDestino;
    }

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTipoEstado(TipoEstado tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Transaccion)) return false;
        final Transaccion other = (Transaccion) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$ubicacionOrigen = this.getUbicacionOrigen();
        final Object other$ubicacionOrigen = other.getUbicacionOrigen();
        if (this$ubicacionOrigen == null ? other$ubicacionOrigen != null : !this$ubicacionOrigen.equals(other$ubicacionOrigen))
            return false;
        final Object this$ubicacionDestino = this.getUbicacionDestino();
        final Object other$ubicacionDestino = other.getUbicacionDestino();
        if (this$ubicacionDestino == null ? other$ubicacionDestino != null : !this$ubicacionDestino.equals(other$ubicacionDestino))
            return false;
        final Object this$companiaOrigen = this.getCompaniaOrigen();
        final Object other$companiaOrigen = other.getCompaniaOrigen();
        if (this$companiaOrigen == null ? other$companiaOrigen != null : !this$companiaOrigen.equals(other$companiaOrigen))
            return false;
        final Object this$companiaDestino = this.getCompaniaDestino();
        final Object other$companiaDestino = other.getCompaniaDestino();
        if (this$companiaDestino == null ? other$companiaDestino != null : !this$companiaDestino.equals(other$companiaDestino))
            return false;
        final Object this$remitente = this.getRemitente();
        final Object other$remitente = other.getRemitente();
        if (this$remitente == null ? other$remitente != null : !this$remitente.equals(other$remitente)) return false;
        final Object this$destinatario = this.getDestinatario();
        final Object other$destinatario = other.getDestinatario();
        if (this$destinatario == null ? other$destinatario != null : !this$destinatario.equals(other$destinatario))
            return false;
        final Object this$fecha = this.getFecha();
        final Object other$fecha = other.getFecha();
        if (this$fecha == null ? other$fecha != null : !this$fecha.equals(other$fecha)) return false;
        final Object this$tipoEstado = this.getTipoEstado();
        final Object other$tipoEstado = other.getTipoEstado();
        if (this$tipoEstado == null ? other$tipoEstado != null : !this$tipoEstado.equals(other$tipoEstado))
            return false;
        if (this.getValor() != other.getValor()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Transaccion;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $ubicacionOrigen = this.getUbicacionOrigen();
        result = result * PRIME + ($ubicacionOrigen == null ? 43 : $ubicacionOrigen.hashCode());
        final Object $ubicacionDestino = this.getUbicacionDestino();
        result = result * PRIME + ($ubicacionDestino == null ? 43 : $ubicacionDestino.hashCode());
        final Object $companiaOrigen = this.getCompaniaOrigen();
        result = result * PRIME + ($companiaOrigen == null ? 43 : $companiaOrigen.hashCode());
        final Object $companiaDestino = this.getCompaniaDestino();
        result = result * PRIME + ($companiaDestino == null ? 43 : $companiaDestino.hashCode());
        final Object $remitente = this.getRemitente();
        result = result * PRIME + ($remitente == null ? 43 : $remitente.hashCode());
        final Object $destinatario = this.getDestinatario();
        result = result * PRIME + ($destinatario == null ? 43 : $destinatario.hashCode());
        final Object $fecha = this.getFecha();
        result = result * PRIME + ($fecha == null ? 43 : $fecha.hashCode());
        final Object $tipoEstado = this.getTipoEstado();
        result = result * PRIME + ($tipoEstado == null ? 43 : $tipoEstado.hashCode());
        result = result * PRIME + this.getValor();
        return result;
    }

    public String toString() {
        return "Transaccion(ubicacionOrigen=" + this.getUbicacionOrigen() + ", ubicacionDestino=" + this.getUbicacionDestino() + ", companiaOrigen=" + this.getCompaniaOrigen() + ", companiaDestino=" + this.getCompaniaDestino() + ", remitente=" + this.getRemitente() + ", destinatario=" + this.getDestinatario() + ", fecha=" + this.getFecha() + ", tipoEstado=" + this.getTipoEstado() + ", valor=" + this.getValor() + ")";
    }

    public static class TransaccionBuilder {
        private Ubicacion ubicacionOrigen;
        private Ubicacion ubicacionDestino;
        private Persona companiaOrigen;
        private Persona companiaDestino;
        private Persona remitente;
        private Persona destinatario;
        private String fecha;
        private TipoEstado tipoEstado;
        private int valor;

        TransaccionBuilder() {
        }

        public TransaccionBuilder ubicacionOrigen(Ubicacion ubicacionOrigen) {
            this.ubicacionOrigen = ubicacionOrigen;
            return this;
        }

        public TransaccionBuilder ubicacionDestino(Ubicacion ubicacionDestino) {
            this.ubicacionDestino = ubicacionDestino;
            return this;
        }

        public TransaccionBuilder companiaOrigen(Persona companiaOrigen) {
            this.companiaOrigen = companiaOrigen;
            return this;
        }

        public TransaccionBuilder companiaDestino(Persona companiaDestino) {
            this.companiaDestino = companiaDestino;
            return this;
        }

        public TransaccionBuilder remitente(Persona remitente) {
            this.remitente = remitente;
            return this;
        }

        public TransaccionBuilder destinatario(Persona destinatario) {
            this.destinatario = destinatario;
            return this;
        }

        public TransaccionBuilder fecha(String fecha) {
            this.fecha = fecha;
            return this;
        }

        public TransaccionBuilder tipoEstado(TipoEstado tipoEstado) {
            this.tipoEstado = tipoEstado;
            return this;
        }

        public TransaccionBuilder valor(int valor) {
            this.valor = valor;
            return this;
        }

        public Transaccion build() {
            return new Transaccion(ubicacionOrigen, ubicacionDestino, companiaOrigen, companiaDestino, remitente, destinatario, fecha, tipoEstado, valor);
        }

        public String toString() {
            return "Transaccion.TransaccionBuilder(ubicacionOrigen=" + this.ubicacionOrigen + ", ubicacionDestino=" + this.ubicacionDestino + ", companiaOrigen=" + this.companiaOrigen + ", companiaDestino=" + this.companiaDestino + ", remitente=" + this.remitente + ", destinatario=" + this.destinatario + ", fecha=" + this.fecha + ", tipoEstado=" + this.tipoEstado + ", valor=" + this.valor + ")";
        }
    }
}



