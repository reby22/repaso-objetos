package uaslp.objetos.escuela;

public class Direccion {
    private static Direccion direccion = null;
    public static Direccion getInstance(){
        if (direccion == null){
            direccion = new Direccion();
        }
        return direccion;
    }

    private Direccion(){

    }


}