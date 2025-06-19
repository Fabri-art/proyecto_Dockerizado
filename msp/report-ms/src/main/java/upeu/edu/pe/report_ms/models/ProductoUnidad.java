package upeu.edu.pe.report_ms.models;

public class ProductoUnidad {
    private Long idProductoUNidad;
    private Producto producto;
    private UnidadesMedida unidadesMedida;

    public ProductoUnidad() {
    }

    public ProductoUnidad(Long idProductoUNidad, Producto producto, UnidadesMedida unidadesMedida) {
        this.idProductoUNidad = idProductoUNidad;
        this.producto = producto;
        this.unidadesMedida = unidadesMedida;
    }
    private ProductoUnidad(Builder builder) {
        this.idProductoUNidad = builder.idProductoUNidad;
        this.producto = builder.producto;
        this.unidadesMedida = builder.unidadesMedida;
    }

    public Long getIdProductoUNidad() {
        return idProductoUNidad;
    }

    public void setIdProductoUNidad(Long idProductoUNidad) {
        this.idProductoUNidad = idProductoUNidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public UnidadesMedida getUnidadesMedida() {
        return unidadesMedida;
    }

    public void setUnidadesMedida(UnidadesMedida unidadesMedida) {
        this.unidadesMedida = unidadesMedida;
    }
    // Builder
    public static class Builder {
        private Long idProductoUNidad;
        private Producto producto;
        private UnidadesMedida unidadesMedida;

        public Builder idProductoUNidad(Long idProductoUNidad) {
            this.idProductoUNidad = idProductoUNidad;
            return this;
        }

        public Builder producto(Producto producto) {
            this.producto = producto;
            return this;
        }

        public Builder unidadesMedida(UnidadesMedida unidadesMedida) {
            this.unidadesMedida = unidadesMedida;
            return this;
        }

        public ProductoUnidad build() {
            return new ProductoUnidad(this);
        }
    }
}
