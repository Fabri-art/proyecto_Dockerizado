package upeu.edu.pe.report_ms.models;

public class DetPedido {
    private Long idDP;
    private Integer cantidad;
    private Long precioUnitario;

    private Producto producto;
    private Pedido pedido;

    public DetPedido() {
    }

    public DetPedido(Long idDP, Integer cantidad, Long precioUnitario, Producto producto, Pedido pedido) {
        this.idDP = idDP;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.producto = producto;
        this.pedido = pedido;
    }
    private DetPedido(Builder builder) {
        this.idDP = builder.idDP;
        this.cantidad = builder.cantidad;
        this.precioUnitario = builder.precioUnitario;
        this.producto = builder.producto;
        this.pedido = builder.pedido;
    }

    public Long getIdDP() {
        return idDP;
    }

    public void setIdDP(Long idDP) {
        this.idDP = idDP;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Long getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Long precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    // Builder
    public static class Builder {
        private Long idDP;
        private Integer cantidad;
        private Long precioUnitario;
        private Producto producto;
        private Pedido pedido;

        public Builder idDP(Long idDP) {
            this.idDP = idDP;
            return this;
        }

        public Builder cantidad(Integer cantidad) {
            this.cantidad = cantidad;
            return this;
        }

        public Builder precioUnitario(Long precioUnitario) {
            this.precioUnitario = precioUnitario;
            return this;
        }

        public Builder producto(Producto producto) {
            this.producto = producto;
            return this;
        }

        public Builder pedido(Pedido pedido) {
            this.pedido = pedido;
            return this;
        }

        public DetPedido build() {
            return new DetPedido(this);
        }
    }
}
