package upeu.edu.pe.report_ms.models;

public class Categoria {
    private Long idCat;
    private String nombre;
    private String estado;

    public Categoria() {
    }

    public Categoria(Long idCat, String nombre, String estado) {
        this.idCat = idCat;
        this.nombre = nombre;
        this.estado = estado;
    }
    private Categoria(Builder builder) {
        this.idCat = builder.idCat;
        this.nombre = builder.nombre;
        this.estado = builder.estado;
    }

    public Long getIdCat() {
        return idCat;
    }

    public void setIdCat(Long idCat) {
        this.idCat = idCat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    // Builder
    public static class Builder {
        private Long idCat;
        private String nombre;
        private String estado;

        public Builder idCat(Long idCat) {
            this.idCat = idCat;
            return this;
        }

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder estado(String estado) {
            this.estado = estado;
            return this;
        }

        public Categoria build() {
            return new Categoria(this);
        }
    }
}
