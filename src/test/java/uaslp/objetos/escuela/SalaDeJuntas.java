package uaslp.objetos.escuela;

public abstract class SalaDeJuntas {
    private final String nombre;

    public SalaDeJuntas(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
}