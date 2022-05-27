package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {
    private static SalaDeJuntas salaA = new SalaDeJuntasA();
    private static SalaDeJuntas salaB = new SalaDeJuntasB();
    private static SalaDeJuntas salaC = new SalaDeJuntasC();
    public static SalaDeJuntas get(String nombre) {

        if (nombre.equals("Sala A")){
            return salaA;
        }
        if (nombre.equals("Sala B")){
            return salaB;
        }
        if (nombre.equals("Sala C")){
            return salaC;
        }
        return null;
    }
}