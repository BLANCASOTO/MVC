/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewPerimetro;
import models.ModelPerimetro;
/**
 * 
 * @author Bnc
 */
public class ControllerPerimetro    implements ActionListener{
    ModelPerimetro modelPerimetro;
    ViewPerimetro viewPerimetro;

    public ControllerPerimetro(ViewPerimetro viewPerimetro, ModelPerimetro modelPerimetro) {
        this.modelPerimetro = modelPerimetro;
        this.viewPerimetro = viewPerimetro;
        
          this.viewPerimetro.jBquadrado.addActionListener(this);/////////////////////////
          this.viewPerimetro.jBrombo.addActionListener(this);
          this.viewPerimetro.jBrectangulo.addActionListener(this); 
    }

      public void quadrado(){
        
        this.modelPerimetro.setLado(Double.parseDouble(viewPerimetro.jTlado.getText()));
        
      this.viewPerimetro.jTResultadoquadrado.setText(""+this.modelPerimetro.quadrado());
    }
      
          public void rombo(){
       
                this.modelPerimetro.setLadoRombo(Double.parseDouble(viewPerimetro.jTladoRombo.getText()));
                
      this.viewPerimetro.jTresultadorombo.setText(""+this.modelPerimetro.rombo());
    }
          
               public void rectangulo(){
        
        this.modelPerimetro.setLargo(Double.parseDouble(viewPerimetro.jTlargo.getText()));
            this.modelPerimetro.setAncho(Double.parseDouble(viewPerimetro.jTAncho.getText()));
      this.viewPerimetro.jTresultadorectangulo.setText(""+this.modelPerimetro.rectangulo());
    }
               
                
        public void actionPerformed(ActionEvent ae) {
             if (ae.getSource() ==viewPerimetro.jBquadrado){
            quadrado();
             }else if(ae.getSource() ==viewPerimetro.jBrectangulo){
       rectangulo();
             }else if(ae.getSource() ==viewPerimetro.jBrombo){
     rombo();
     
    }

}
    
}
