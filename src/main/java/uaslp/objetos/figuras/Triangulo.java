package uaslp.objetos.figuras;
public class Triangulo extends Figura
{
    double base;
    double altura;
    String description;

    public  Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }
    public Triangulo()
    {

        description = "Cualquier triangulo";
    }
    public void setBase(double base)
    {
        this.base = base;
    }
    public double getBase()
    {
        return base;
    }
    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    public double getAltura()
    {
        return altura;
    }
    public double getArea()
    {
        double area;
        area = (base * altura) / 2;
        return area;
    }

    public String getDescription() {
        return description;
    }
}