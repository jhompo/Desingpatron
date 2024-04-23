package patrones.creacionales.factory.model;

import patrones.creacionales.factory.interfac.IConexion;

public class ConexionMysql implements IConexion {

    private String server;
    private int port;
    private String user;
    private String pass;

    public ConexionMysql(){
        this.server ="localhost";
        this.port = 3306;
        this.user ="jhompo";
        this.pass ="12345";
    }
    @Override
    public String Conectar() {
        System.out.printf("CONEXION MYSQL\n");
        return "CONEXION MYSQL\n";
    }

    @Override
    public String Desconectar() {
        System.out.printf("DESCONEXION MYSQL\n");
        return "DESCONEXION MYSQL\n";
    }
}
