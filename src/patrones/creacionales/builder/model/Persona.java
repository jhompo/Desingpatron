package patrones.creacionales.builder.model;

public class Persona {

    String nombre;
    String apellido;

    String direccion;
    String telefono;
    String email;

    private Persona(String nombre, String apellido){
        this.nombre =nombre;
        this.apellido = apellido;
        this.direccion="";
        this.telefono="";
        this.email="";
    }

    public static Persona Builder(String nombre, String apellido){
        return new Persona(nombre,apellido);
    }

    public Persona direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public Persona telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public Persona email(String email) {
        this.email = email;
        return this;
    }

    public Persona build(){
        return this;
    }



    @Override
    public String toString() {
        return "Persona{\n" +
                "\tnombre='" + nombre + "' \n" +
                "\tapellido='" + apellido + "'\n" +
                "\tdireccion='" + direccion + "'\n" +
                "\ttelefono='" + telefono + "'\n" +
                "\temail='" + email + "'\n" +
                '}';
    }
}
