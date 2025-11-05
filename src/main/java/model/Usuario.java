package model;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private boolean activo;

    public Usuario() {} // Jackson necesita constructor vacío

    public Usuario(int id, String nombre, String email, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.activo = activo;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    @Override public String toString() {
        return "Usuario{id=" + id + ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' + ", activo=" + activo + '}';
    }
}
