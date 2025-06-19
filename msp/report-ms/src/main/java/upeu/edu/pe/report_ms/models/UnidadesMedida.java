package upeu.edu.pe.report_ms.models;

public class UnidadesMedida {
    private Long idUnidades;
    private String nombre;
    private String simbolo;

    public UnidadesMedida() {
    }

    public UnidadesMedida(Long idUnidades, String nombre, String simbolo) {
        this.idUnidades = idUnidades;
        this.nombre = nombre;
        this.simbolo = simbolo;
    }
    private UnidadesMedida(Builder builder) {
        this.idUnidades = builder.idUnidades;
        this.nombre = builder.nombre;
        this.simbolo = builder.simbolo;
    }

    public Long getIdUnidades() {
        return idUnidades;
    }

    public void setIdUnidades(Long idUnidades) {
        this.idUnidades = idUnidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    // Builder
    public static class Builder {
        private Long idUnidades;
        private String nombre;
        private String simbolo;

        public Builder idUnidades(Long idUnidades) {
            this.idUnidades = idUnidades;
            return this;
        }

        public Builder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder simbolo(String simbolo) {
            this.simbolo = simbolo;
            return this;
        }

        public UnidadesMedida build() {
            return new UnidadesMedida(this);
        }
    }
}
