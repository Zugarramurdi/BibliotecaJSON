package model;

public class Cliente {
    private int id;
    private String nombre;
    private String telefono;
    private double deuda; // € pendiente, por ejemplo

    public Cliente() {}

    public Cliente(int id, String nombre, String telefono, double deuda) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.deuda = deuda;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public double getDeuda() { return deuda; }
    public void setDeuda(double deuda) { this.deuda = deuda; }

    @Override public String toString() {
        return "Cliente{id=" + id + ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' + ", deuda=" + deuda + '}';
    }
}
