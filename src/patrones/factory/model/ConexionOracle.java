package patrones.factory.model;

import patrones.factory.interfac.IConexion;

public class ConexionOracle implements IConexion {

    private String server;
    private int port;
    private String user;
    private String pass;

    public ConexionOracle(){
        this.server ="localhost";
        this.port = 1521;
        this.user ="jhompo";
        this.pass ="12345";
    }
    @Override
    public String Conectar() {
        System.out.printf("CONEXION ORACLE\n");
        return "CONEXION ORACLE\n";
    }

    @Override
    public String Desconectar() {
        System.out.printf("DESCONEXION ORACLE\n");
        return "DESCONEXION ORACLE\n";
    }
}
