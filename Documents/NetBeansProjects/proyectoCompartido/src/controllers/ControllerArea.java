/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewArea;
import models.ModelArea;
/**
 * 
 * @author Bnc
 */
public class ControllerArea  implements ActionListener{
   ViewArea viewarea;
    ModelArea modelarea;
    
    public ControllerArea(ViewArea viewarea, ModelArea modelarea) {
        this.viewarea = viewarea;
        this.modelarea = modelarea;
        
           this.viewarea.jBquadrado.addActionListener(this);
          
          this.viewarea.jBrombo.addActionListener(this);
          this.viewarea.jBrectangulo.addActionListener(this); 
    }
 
       public void quadrado(){
        
        this.modelarea.setLado(Double.parseDouble(viewarea.jTlado.getText()));
        
      this.viewarea.jTresultquadrado.setText(""+this.modelarea.quadrado());
    }
          public void rombo(){
        
        this.modelarea.setGDiagonal(Double.parseDouble(viewarea.jTGdiagonal.getText()));
                this.modelarea.setPDiagonal(Double.parseDouble(viewarea.jTPdiagonal.getText()));
                
      this.viewarea.jTResultadoRombo.setText(""+this.modelarea.rombo());
    }
               public void rectangulo(){
        
        this.modelarea.setLargo(Double.parseDouble(viewarea.jTlargo.getText()));
            this.modelarea.setAncho(Double.parseDouble(viewarea.jTancho.getText()));
      this.viewarea.jTresultadoRectangulo.setText(""+this.modelarea.rectangulo());
    }
          
   
 
        public void actionPerformed(ActionEvent ae) {
             if (ae.getSource() ==viewarea.jBquadrado){
            quadrado();
             }else if(ae.getSource() ==viewarea.jBrectangulo){
       rectangulo();
             }else if(ae.getSource() ==viewarea.jBrombo){
     rombo();
     
    }

}
    
}
