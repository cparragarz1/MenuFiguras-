
package Clases;


public class Paralelogramo extends Figura{
private double base;
private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Paralelogramo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculoArea() {
        double paralelogramoArea=(this.base*this.altura);
        return paralelogramoArea;
        
    }
    
}
