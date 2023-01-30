package patrones.factory.model;

import patrones.factory.interfac.IConexion;

public class ConexionNull implements IConexion {

    private String server;
    private int port;
    private String user;
    private String pass;

    public ConexionNull(){
        this.server ="";
        this.port = 0;
        this.user ="";
        this.pass ="";
    }
    @Override
    public String Conectar() {
        System.out.printf("NO HAY CONEXION\n");
        return "NO HAY CONEXION\n";
    }

    @Override
    public String Desconectar() {
        System.out.printf("NO SE PUEDE DESCONECTAR SI NO HAY CONEXION\n");
        return "NO SE PUEDE DESCONECTAR SI NO HAY CONEXION\n";
    }
}
