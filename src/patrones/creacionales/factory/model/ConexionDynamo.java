package patrones.creacionales.factory.model;

import patrones.creacionales.factory.interfac.IConexion;

public class ConexionDynamo implements IConexion {

    private String server;
    private int port;
    private String user;
    private String pass;

    public ConexionDynamo(){
        this.server ="localhost";
        this.port = 8000;
        this.user ="jhompo";
        this.pass ="12345";
    }
    @Override
    public String Conectar() {
        System.out.printf("CONEXION DYNAMO\n");
        return "CONEXION DYNAMO\n";
    }

    @Override
    public String Desconectar() {
        System.out.printf("DESCONEXION DYNAMO\n");
        return "DESCONEXION DYNAMO\n";
    }
}
