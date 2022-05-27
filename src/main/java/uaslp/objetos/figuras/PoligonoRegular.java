package uaslp.objetos.figuras;
import  java.lang.Math;
public class PoligonoRegular
{
    int numeroDeLados;
    double lado;
    public PoligonoRegular(int numeroDeLados)
    {
        this.numeroDeLados = numeroDeLados;
    }
    public PoligonoRegular(int numeroDeLados, double lado)
    {
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado;
    }

    public double getLado()
    {
        return lado;
    }

    public double getArea()
    {
        double area;
        double perimetro = lado * numeroDeLados;
        double radianes = (360 / numeroDeLados)*(Math.PI / 180);
        double apotema = lado / (2 * Math.tan(radianes/2));
        area = (perimetro * apotema)/2;
        return area;
    }
}