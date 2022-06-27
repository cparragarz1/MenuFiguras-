
package Clases;

import Interfaces.IFigura;


public abstract class Figura implements IFigura {
     protected String nombreFigura;
    
      public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }
     public abstract double calculoArea();
}
