package personas;

public class Empleado extends Persona{
    private String cargo;

    public Empleado(String cargo, String nombre, String identificacion) {
        super(nombre, identificacion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
