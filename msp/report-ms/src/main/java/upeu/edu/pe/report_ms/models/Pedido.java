package upeu.edu.pe.report_ms.models;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private Long idP;
    private Long numpedido;
    private String estado;
    private Long totalpago;
    private String tipocomprobante;
    private Long numerocomprobante;
    private String metodopago;
    private LocalDateTime fechaEmision;
    private List<DetPedido> detallesPedido;
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(Long idP, Long numpedido, String estado, Long totalpago, String tipocomprobante, Long numerocomprobante, String metodopago, LocalDateTime fechaEmision, List<DetPedido> detallesPedido, Cliente cliente) {
        this.idP = idP;
        this.numpedido = numpedido;
        this.estado = estado;
        this.totalpago = totalpago;
        this.tipocomprobante = tipocomprobante;
        this.numerocomprobante = numerocomprobante;
        this.metodopago = metodopago;
        this.fechaEmision = fechaEmision;
        this.detallesPedido = detallesPedido;
        this.cliente = cliente;
    }
    private Pedido(Builder builder) {
        this.idP = builder.idP;
        this.numpedido = builder.numpedido;
        this.estado = builder.estado;
        this.totalpago = builder.totalpago;
        this.tipocomprobante = builder.tipocomprobante;
        this.numerocomprobante = builder.numerocomprobante;
        this.metodopago = builder.metodopago;
        this.fechaEmision = builder.fechaEmision;
        this.detallesPedido = builder.detallesPedido;
        this.cliente = builder.cliente;
    }

    public Long getIdP() {
        return idP;
    }

    public void setIdP(Long idP) {
        this.idP = idP;
    }

    public Long getNumpedido() {
        return numpedido;
    }

    public void setNumpedido(Long numpedido) {
        this.numpedido = numpedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getTotalpago() {
        return totalpago;
    }

    public void setTotalpago(Long totalpago) {
        this.totalpago = totalpago;
    }

    public String getTipocomprobante() {
        return tipocomprobante;
    }

    public void setTipocomprobante(String tipocomprobante) {
        this.tipocomprobante = tipocomprobante;
    }

    public Long getNumerocomprobante() {
        return numerocomprobante;
    }

    public void setNumerocomprobante(Long numerocomprobante) {
        this.numerocomprobante = numerocomprobante;
    }

    public String getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(String metodopago) {
        this.metodopago = metodopago;
    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDateTime fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public List<DetPedido> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(List<DetPedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    // Builder
    public static class Builder {
        private Long idP;
        private Long numpedido;
        private String estado;
        private Long totalpago;
        private String tipocomprobante;
        private Long numerocomprobante;
        private String metodopago;
        private LocalDateTime fechaEmision;
        private List<DetPedido> detallesPedido;
        private Cliente cliente;

        public Builder idP(Long idP) {
            this.idP = idP;
            return this;
        }

        public Builder numpedido(Long numpedido) {
            this.numpedido = numpedido;
            return this;
        }

        public Builder estado(String estado) {
            this.estado = estado;
            return this;
        }

        public Builder totalpago(Long totalpago) {
            this.totalpago = totalpago;
            return this;
        }

        public Builder tipocomprobante(String tipocomprobante) {
            this.tipocomprobante = tipocomprobante;
            return this;
        }

        public Builder numerocomprobante(Long numerocomprobante) {
            this.numerocomprobante = numerocomprobante;
            return this;
        }

        public Builder metodopago(String metodopago) {
            this.metodopago = metodopago;
            return this;
        }

        public Builder fechaEmision(LocalDateTime fechaEmision) {
            this.fechaEmision = fechaEmision;
            return this;
        }

        public Builder detallesPedido(List<DetPedido> detallesPedido) {
            this.detallesPedido = detallesPedido;
            return this;
        }

        public Builder cliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public Pedido build() {
            return new Pedido(this);
        }
    }
}
