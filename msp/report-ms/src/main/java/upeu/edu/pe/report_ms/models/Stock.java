package upeu.edu.pe.report_ms.models;

public class Stock {
    private Long id;
    private Producto producto;
    private String descripcion;
    private Integer entradas;
    private Integer salidas;
    private Integer balance;

    public Stock() {
    }

    public Stock(Long id, Producto producto, String descripcion, Integer entradas, Integer salidas, Integer balance) {
        this.id = id;
        this.producto = producto;
        this.descripcion = descripcion;
        this.entradas = entradas;
        this.salidas = salidas;
        this.balance = balance;
    }
    private Stock(Builder builder) {
        this.id = builder.id;
        this.producto = builder.producto;
        this.descripcion = builder.descripcion;
        this.entradas = builder.entradas;
        this.salidas = builder.salidas;
        this.balance = builder.balance;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEntradas() {
        return entradas;
    }

    public void setEntradas(Integer entradas) {
        this.entradas = entradas;
    }

    public Integer getSalidas() {
        return salidas;
    }

    public void setSalidas(Integer salidas) {
        this.salidas = salidas;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
    // Builder
    public static class Builder {
        private Long id;
        private Producto producto;
        private String descripcion;
        private Integer entradas;
        private Integer salidas;
        private Integer balance;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder producto(Producto producto) {
            this.producto = producto;
            return this;
        }

        public Builder descripcion(String descripcion) {
            this.descripcion = descripcion;
            return this;
        }

        public Builder entradas(Integer entradas) {
            this.entradas = entradas;
            return this;
        }

        public Builder salidas(Integer salidas) {
            this.salidas = salidas;
            return this;
        }

        public Builder balance(Integer balance) {
            this.balance = balance;
            return this;
        }

        public Stock build() {
            return new Stock(this);
        }
    }
}
