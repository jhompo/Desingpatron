package patrones.factory.model;

import patrones.factory.interfac.IConexion;

public class ConexionPostgre implements IConexion {

    private String server;
    private int port;
    private String user;
    private String pass;

    public ConexionPostgre(){
        this.server ="localhost";
        this.port  = 5432;
        this.user ="jhompo";
        this.pass ="12345";
    }
    @Override
    public String Conectar() {
        System.out.printf("CONEXION POSTGRE\n");
        return "CONEXION POSTGRE\n";
    }

    @Override
    public String Desconectar() {
        System.out.printf("DECONEXION POSTGRE\n");
        return "DECONEXION POSTGRE\n";
    }
}
