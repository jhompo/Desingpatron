package patrones.factory.model;

import patrones.abstractfactory.interfac.AbstractFactory;
import patrones.abstractfactory.model.AnimalFactory;
import patrones.factory.interfac.IConexion;

public class FactoryDB  {


    public IConexion getInstancia(String opcion)  {
        IConexion objeto;
        try {
            //CREACION DINAMICA DEL OBJETO PARA PRICIPIO SOLID OPEN/CLOSE
            String namespace = "patrones.factory.model.Conexion" + opcion;
            objeto = (IConexion)Class.forName(namespace).newInstance();

        }catch (Exception ex) {
            System.out.printf("NO EXISTE EL PROVEEDOR DE conexion");
            objeto = new ConexionNull();
        }

        //CREACION STATICA DE OBJETOS
        /*
          switch (conex){
            case "DYNAMO": objeto = new ConexionDynamo(); break;
            case "MYSQL": objeto = new ConexionMysql(); break;
            case "ORACLE": objeto = new ConexionOracle(); break;
            case "POSTGRE": objeto = new ConexionPostgre(); break;
            default: objeto = new ConexionNull(); break;
        }*/

        return objeto;
    }


}
