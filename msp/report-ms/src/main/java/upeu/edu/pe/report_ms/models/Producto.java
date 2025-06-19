package upeu.edu.pe.report_ms.models;


import java.util.List;

public class Producto {
    private Long idPro;
    private String nombre;
    private String descripcion;
    private String imagen;
    private Long precio;
    private List<Stock> stockList;
    private Categoria categoria;

    public Producto() {
    }

    public Producto(Long idPro, String nombre, String descripcion, String imagen, Long precio, List<Stock> stockList, Categoria categoria) {
        this.idPro = idPro;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
        this.stockList = stockList;
        this.categoria = categoria;
    }
    private Producto(Builder builder) {
        this.idPro = builder.idPro;
        this.nombre = builder.nombre;
        this.descripcion = builder.descripcion;
        this.imagen = builder.imagen;
        this.precio = builder.precio;
        this.stockList = builder.stockList;
        this.categoria = builder.categoria;
    }

    public Long getIdPro() {
        return idPro;
    }

    public void setIdPro(Long idPro) {
        this.idPro = idPro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public List<Stock> getStockList() {
        return stockList;
    }

    public void setStockList(List<Stock> stockList) {
        this.stockList = stockList;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    // Builder
    public static class Builder {
        private Long idPro;
        private String nombre;
        private String descripcion;
        private String imagen;
        private Long precio;
        private List<Stock> stockList;
        private Categoria categoria;

        public Builder idPro(Long idPro) {
            this.idPro = idPro;
            return this;
        }

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder descripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public Builder imagen(String imagen) {
            this.imagen = imagen;
            return this;
        }

        public Builder precio(Long precio) {
            this.precio = precio;
            return this;
        }

        public Builder stockList(List<Stock> stockList) {
            this.stockList = stockList;
            return this;
        }

        public Builder categoria(Categoria categoria) {
            this.categoria = categoria;
            return this;
        }

        public Producto build() {
            return new Producto(this);
        }
    }
}
