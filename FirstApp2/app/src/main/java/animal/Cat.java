package animal;

public class Cat {
    private String nombre;
    private String raza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Cat(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String greet() {
        return "......";
    }
}
