package upeu.edu.pe.report_ms.models;

public class Envio {
    private Long id;
    private Producto producto;
    private Cliente cliente;
    private String direccion;
    private String estado;

    public Envio() {
    }

    public Envio(Long id, Producto producto, Cliente cliente, String direccion, String estado) {
        this.id = id;
        this.producto = producto;
        this.cliente = cliente;
        this.direccion = direccion;
        this.estado = estado;
    }
    private Envio(Builder builder) {
        this.id = builder.id;
        this.producto = builder.producto;
        this.cliente = builder.cliente;
        this.direccion = builder.direccion;
        this.estado = builder.estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    // Builder
    public static class Builder {
        private Long id;
        private Producto producto;
        private Cliente cliente;
        private String direccion;
        private String estado;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder producto(Producto producto) {
            this.producto = producto;
            return this;
        }

        public Builder cliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder estado(String estado) {
            this.estado = estado;
            return this;
        }

        public Envio build() {
            return new Envio(this);
        }
    }
}
