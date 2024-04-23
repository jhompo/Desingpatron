package patrones.creacionales.builder.model;

public class Cliente {

    String nombre;
    String apellido;
    boolean medioContacto = false;
    String direccion;
    String telefono;
    String email;
    String medioPago;


    private Cliente(String nombre, String apellido){
        this.nombre =nombre;
        this.apellido = apellido;
        this.medioContacto = false;
    }

    public BuilderContacto medioContacto(boolean medioContacto) {
        this.medioContacto = medioContacto;
        if (!medioContacto){
            throw new IllegalArgumentException("EL valor debe ser true");
        }
        return new BuilderContacto(this);
    }


    public BuilderPago pago(){
        return new BuilderPago(this);
    }

    public static Cliente Builder(String nombre, String apellido){
        return new Cliente(nombre,apellido);
    }



    public static class BuilderContacto {

        private Cliente cliente;

        private BuilderContacto(Cliente cliente) {
            this.cliente = cliente;
        }


        public BuilderContacto Direccion(String direccion) {
            cliente.direccion = direccion;
            return this;
        }

        public BuilderContacto Telefono(String telefono) {
            cliente.telefono = telefono;
            return this;
        }

        public BuilderContacto Email(String email) {
            cliente.email = email;
            return this;
        }

        public Cliente build(){
            return cliente;
        }

    }



    public static class BuilderPago {

        Cliente cliente;


        private BuilderPago(Cliente cliente){
            this.cliente = cliente;
        }


        public BuilderPago medioPago(String medioPago){
            cliente.medioPago =medioPago;
            return this;
        }

        public Cliente build(){
            return cliente;
        }

    }
    @Override
    public String toString() {
        return "Cliente{\n" +
                "\tnombre='" + nombre + "' \n" +
                "\tapellido='" + apellido + "'\n" +
                "\tdireccion='" + direccion + "'\n" +
                "\ttelefono='" + telefono + "'\n" +
                "\temail='" + email + "'\n" +
                '}';
    }
}
