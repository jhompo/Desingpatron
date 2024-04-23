package patrones.creacionales.singleton.model;

public class Conexion {

    private static Conexion instancia ;

    private Conexion(){}

    public static Conexion getInstance(){
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public String Conectar() {
        System.out.printf("CONECTAR\n");
        return "CONEXION:UNICA INSTANCIA \n";
    }

    public String Desconectar(){
        System.out.printf("DESCONECTAR\n");
        return "DESCONEXION \n";
    }
}