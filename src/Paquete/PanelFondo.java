
package Paquete;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class PanelFondo extends JPanel {
    //declaramos variables necesarias
    Color colorfondo=Color.red;
    int tammax,tam,can,res;
    //creamos el contrucctor, le asignamos los parametros y asiganamos calor a cada variable
    public PanelFondo (int tammax, int can){
      this.tammax=tammax;
      this.can=can;
      this.tam=tammax/can;
      this.res=tammax%can;
    }
    
    //creamos la clase Graphigs para grficar
    @Override
    public void paint(Graphics pintor){
       super.paint(pintor);
       //agregamos un color al pintor
       pintor .setColor(colorfondo);
       //dibujamos la cuadricula de fondo que genera los cuadraditos de fondo, i para x j para y.
       for(int i=0; i < can; i++){
       for(int j=0; j < can; j++){
       pintor.fillRect(res/2+i*tam,res/2+j*tam, tam-1, tam-1);
       }
       }
    }
}
