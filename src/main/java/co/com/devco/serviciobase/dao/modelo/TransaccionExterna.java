package co.com.devco.serviciobase.dao.modelo;

import co.com.devco.serviciobase.modelo.Movimiento;
import co.com.devco.serviciobase.modelo.Persona;
import co.com.devco.serviciobase.modelo.TipoEstado;
import co.com.devco.serviciobase.modelo.Ubicacion;

import java.util.List;

public class TransaccionExterna {

    private Ubicacion ubicacionOrigen;
    private Ubicacion ubicacionDestino;
    private Persona companiaOrigen;
    private Persona companiaDestino;
    private Persona remitente;
    private Persona destinatario;
    private String fecha;
    private TipoEstado tipoEstado;
    private Integer valor;
    private List<Movimiento> historialMovimientos;

    TransaccionExterna(Ubicacion ubicacionOrigen, Ubicacion ubicacionDestino, Persona companiaOrigen, Persona companiaDestino, Persona remitente, Persona destinatario, String fecha, TipoEstado tipoEstado, Integer valor, List<Movimiento> historialMovimientos) {
        this.ubicacionOrigen = ubicacionOrigen;
        this.ubicacionDestino = ubicacionDestino;
        this.companiaOrigen = companiaOrigen;
        this.companiaDestino = companiaDestino;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.fecha = fecha;
        this.tipoEstado = tipoEstado;
        this.valor = valor;
        this.historialMovimientos = historialMovimientos;
    }

    public static TransaccionExternaBuilder builder() {
        return new TransaccionExternaBuilder();
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

    public Integer getValor() {
        return this.valor;
    }

    public List<Movimiento> getHistorialMovimientos() {
        return this.historialMovimientos;
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

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void setHistorialMovimientos(List<Movimiento> historialMovimientos) {
        this.historialMovimientos = historialMovimientos;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TransaccionExterna)) return false;
        final TransaccionExterna other = (TransaccionExterna) o;
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
        final Object this$valor = this.getValor();
        final Object other$valor = other.getValor();
        if (this$valor == null ? other$valor != null : !this$valor.equals(other$valor)) return false;
        final Object this$historialMovimientos = this.getHistorialMovimientos();
        final Object other$historialMovimientos = other.getHistorialMovimientos();
        if (this$historialMovimientos == null ? other$historialMovimientos != null : !this$historialMovimientos.equals(other$historialMovimientos))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TransaccionExterna;
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
        final Object $valor = this.getValor();
        result = result * PRIME + ($valor == null ? 43 : $valor.hashCode());
        final Object $historialMovimientos = this.getHistorialMovimientos();
        result = result * PRIME + ($historialMovimientos == null ? 43 : $historialMovimientos.hashCode());
        return result;
    }

    public String toString() {
        return "TransaccionExterna(ubicacionOrigen=" + this.getUbicacionOrigen() + ", ubicacionDestino=" + this.getUbicacionDestino() + ", companiaOrigen=" + this.getCompaniaOrigen() + ", companiaDestino=" + this.getCompaniaDestino() + ", remitente=" + this.getRemitente() + ", destinatario=" + this.getDestinatario() + ", fecha=" + this.getFecha() + ", tipoEstado=" + this.getTipoEstado() + ", valor=" + this.getValor() + ", historialMovimientos=" + this.getHistorialMovimientos() + ")";
    }

    public static class TransaccionExternaBuilder {
        private Ubicacion ubicacionOrigen;
        private Ubicacion ubicacionDestino;
        private Persona companiaOrigen;
        private Persona companiaDestino;
        private Persona remitente;
        private Persona destinatario;
        private String fecha;
        private TipoEstado tipoEstado;
        private Integer valor;
        private List<Movimiento> historialMovimientos;

        TransaccionExternaBuilder() {
        }

        public TransaccionExternaBuilder ubicacionOrigen(Ubicacion ubicacionOrigen) {
            this.ubicacionOrigen = ubicacionOrigen;
            return this;
        }

        public TransaccionExternaBuilder ubicacionDestino(Ubicacion ubicacionDestino) {
            this.ubicacionDestino = ubicacionDestino;
            return this;
        }

        public TransaccionExternaBuilder companiaOrigen(Persona companiaOrigen) {
            this.companiaOrigen = companiaOrigen;
            return this;
        }

        public TransaccionExternaBuilder companiaDestino(Persona companiaDestino) {
            this.companiaDestino = companiaDestino;
            return this;
        }

        public TransaccionExternaBuilder remitente(Persona remitente) {
            this.remitente = remitente;
            return this;
        }

        public TransaccionExternaBuilder destinatario(Persona destinatario) {
            this.destinatario = destinatario;
            return this;
        }

        public TransaccionExternaBuilder fecha(String fecha) {
            this.fecha = fecha;
            return this;
        }

        public TransaccionExternaBuilder tipoEstado(TipoEstado tipoEstado) {
            this.tipoEstado = tipoEstado;
            return this;
        }

        public TransaccionExternaBuilder valor(Integer valor) {
            this.valor = valor;
            return this;
        }

        public TransaccionExternaBuilder historialMovimientos(List<Movimiento> historialMovimientos) {
            this.historialMovimientos = historialMovimientos;
            return this;
        }

        public TransaccionExterna build() {
            return new TransaccionExterna(ubicacionOrigen, ubicacionDestino, companiaOrigen, companiaDestino, remitente, destinatario, fecha, tipoEstado, valor, historialMovimientos);
        }

        public String toString() {
            return "TransaccionExterna.TransaccionExternaBuilder(ubicacionOrigen=" + this.ubicacionOrigen + ", ubicacionDestino=" + this.ubicacionDestino + ", companiaOrigen=" + this.companiaOrigen + ", companiaDestino=" + this.companiaDestino + ", remitente=" + this.remitente + ", destinatario=" + this.destinatario + ", fecha=" + this.fecha + ", tipoEstado=" + this.tipoEstado + ", valor=" + this.valor + ", historialMovimientos=" + this.historialMovimientos + ")";
        }
    }
}



