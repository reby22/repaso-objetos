package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluadorDePromediosAdapter extends EvaluadorDePromedios{
    private EvaluadorDePromedios evaluadorDePromedios;
    protected EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios){
        this.evaluadorDePromedios = evaluadorDePromedios;
    }

    public double evalua(String listaDeCalificaciones){
        List<String> calificaciones = Arrays.asList(listaDeCalificaciones.split(","));
        List<Double> cal = new ArrayList<>();

        for (String calificacion : calificaciones){
            cal.add(Double.parseDouble(calificacion));
        }
        return evaluadorDePromedios.evalua(cal);
    }
}