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
    ModelPerimetro modelperimetro;
    ViewPerimetro viewperimetro;

    public ControllerPerimetro(ViewPerimetro viewPerimetro, ModelPerimetro modelPerimetro) {
        this.modelperimetro = modelperimetro;
        this.viewperimetro = viewperimetro;
        
          this.viewperimetro.jBquadrado.addActionListener(this);
          this.viewperimetro.jBrombo.addActionListener(this);
          this.viewperimetro.jBrectangulo.addActionListener(this); 
    }

      public void quadrado(){
        
        this.modelperimetro.setLado(Double.parseDouble(viewperimetro.jTlado.getText()));
        
      this.viewperimetro.jTResultadoquadrado.setText(""+this.modelperimetro.quadrado());
    }
      
          public void rombo(){
       
                this.modelperimetro.setLadoRombo(Double.parseDouble(viewperimetro.jTladoRombo.getText()));
                
      this.viewperimetro.jTresultadorombo.setText(""+this.modelperimetro.rombo());
    }
          
               public void rectangulo(){
        
        this.modelperimetro.setLargo(Double.parseDouble(viewperimetro.jTlargo.getText()));
            this.modelperimetro.setAncho(Double.parseDouble(viewperimetro.jTAncho.getText()));
      this.viewperimetro.jBrectangulo.setText(""+this.modelperimetro.rectangulo());
    }
               
                
        public void actionPerformed(ActionEvent ae) {
             if (ae.getSource() ==viewperimetro.jBquadrado){
            quadrado();
             }else if(ae.getSource() ==viewperimetro.jBrectangulo){
       rectangulo();
             }else if(ae.getSource() ==viewperimetro.jBrombo){
     rombo();
     
    }

}
    
}
