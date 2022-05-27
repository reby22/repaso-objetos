package uaslp.objetos.figuras;
public class Triangulo extends Figura
{
    Double base;
    Double altura;
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
        if(base == null)
            throw new BaseNoProvistaException();
        if(altura == null)
            throw new AlturaNoProvistaException();
        area = (base * altura) / 2;
        return area;
    }

    public String getDescription() {
        return description;
    }
}