package co.com.devco.serviciobase.servicioweb.recurso;

import co.com.devco.serviciobase.modelo.Persona;
import co.com.devco.serviciobase.modelo.TipoEstado;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.xml.bind.annotation.XmlRootElement;


@Schema(description = "TransaccionRecurso")
@XmlRootElement
public class TransaccionRecurso {

    private Persona remitente;
    private Persona destinatario;
    private String fecha;
    private TipoEstado tipoEstado;
    private int valor;

    TransaccionRecurso(Persona remitente, Persona destinatario, String fecha, TipoEstado tipoEstado, int valor) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.fecha = fecha;
        this.tipoEstado = tipoEstado;
        this.valor = valor;
    }

    public static TransaccionRecursoBuilder builder() {
        return new TransaccionRecursoBuilder();
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
        if (!(o instanceof TransaccionRecurso)) return false;
        final TransaccionRecurso other = (TransaccionRecurso) o;
        if (!other.canEqual((Object) this)) return false;
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
        return other instanceof TransaccionRecurso;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        return "TransaccionRecurso(remitente=" + this.getRemitente() + ", destinatario=" + this.getDestinatario() + ", fecha=" + this.getFecha() + ", tipoEstado=" + this.getTipoEstado() + ", valor=" + this.getValor() + ")";
    }

    public static class TransaccionRecursoBuilder {
        private Persona remitente;
        private Persona destinatario;
        private String fecha;
        private TipoEstado tipoEstado;
        private int valor;

        TransaccionRecursoBuilder() {
        }

        public TransaccionRecursoBuilder remitente(Persona remitente) {
            this.remitente = remitente;
            return this;
        }

        public TransaccionRecursoBuilder destinatario(Persona destinatario) {
            this.destinatario = destinatario;
            return this;
        }

        public TransaccionRecursoBuilder fecha(String fecha) {
            this.fecha = fecha;
            return this;
        }

        public TransaccionRecursoBuilder tipoEstado(TipoEstado tipoEstado) {
            this.tipoEstado = tipoEstado;
            return this;
        }

        public TransaccionRecursoBuilder valor(int valor) {
            this.valor = valor;
            return this;
        }

        public TransaccionRecurso build() {
            return new TransaccionRecurso(remitente, destinatario, fecha, tipoEstado, valor);
        }

        public String toString() {
            return "TransaccionRecurso.TransaccionRecursoBuilder(remitente=" + this.remitente + ", destinatario=" + this.destinatario + ", fecha=" + this.fecha + ", tipoEstado=" + this.tipoEstado + ", valor=" + this.valor + ")";
        }
    }
}
