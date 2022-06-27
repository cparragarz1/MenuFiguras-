
package Clases;


public class Trapecio  extends Figura {
    private double base1;
    private double base2;
     private double altura;

    public Trapecio(double base1, double base2, double altura) {
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase2() {
        return base2;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculoArea() {
        double trapecioArea=((this.base1+ this.base2)/2);
                return trapecioArea;
    }

    public void setBase1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

