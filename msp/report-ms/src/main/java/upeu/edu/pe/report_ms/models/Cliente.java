package upeu.edu.pe.report_ms.models;

public class Cliente {
    private Long idC;
    private String nombres;
    private String email;
    private String password;
    private Long celular;
    private String direccion;

    public Cliente() {
    }

    public Cliente(String direccion, Long celular, String password, String email, String nombres, Long idC) {
        this.direccion = direccion;
        this.celular = celular;
        this.password = password;
        this.email = email;
        this.nombres = nombres;
        this.idC = idC;
    }
    private Cliente(Builder builder) {
        this.idC = builder.idC;
        this.nombres = builder.nombres;
        this.email = builder.email;
        this.password = builder.password;
        this.celular = builder.celular;
        this.direccion = builder.direccion;
    }

    public Long getIdC() {
        return idC;
    }

    public void setIdC(Long idC) {
        this.idC = idC;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    // Builder interno
    public static class Builder {
        private Long idC;
        private String nombres;
        private String email;
        private String password;
        private Long celular;
        private String direccion;

        public Builder idC(Long idC) {
            this.idC = idC;
            return this;
        }

        public Builder nombres(String nombres) {
            this.nombres = nombres;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder celular(Long celular) {
            this.celular = celular;
            return this;
        }

        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Cliente build() {
            return new Cliente(this);
        }
    }
}
