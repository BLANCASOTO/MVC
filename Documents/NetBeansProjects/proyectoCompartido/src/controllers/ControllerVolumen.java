
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewVolumen;
import models.ModelVolumen;

public class ControllerVolumen   implements ActionListener{
   ViewVolumen viewvolumen;
ModelVolumen modelvolumen;

    public ControllerVolumen(ViewVolumen viewvolumen, ModelVolumen modelvolumen) {
        this.viewvolumen = viewvolumen;
        this.modelvolumen = modelvolumen;
        
             this.viewvolumen.jBquadra.addActionListener(this);
          
          this.viewvolumen.jBrombo.addActionListener(this);
          this.viewvolumen.jBrectangulo.addActionListener(this); 
    }
 
      public void quadrado(){
        
        this.modelvolumen.setLado(Double.parseDouble(viewvolumen.jTlado.getText()));
        
      this.viewvolumen.jTresultadoquadrado.setText(""+this.modelvolumen.quadrado());
    }
          public void rombo(){
        
        this.modelvolumen.setLadoRombo(Double.parseDouble(viewvolumen.jTladoRombo.getText()));
                this.modelvolumen.setAlturaRombo(Double.parseDouble(viewvolumen.jTaltura.getText()));
                
      this.viewvolumen.jTresultadorombo.setText(""+this.modelvolumen.rombo());
    }
               public void rectangulo(){
        
        this.modelvolumen.setLargo(Double.parseDouble(viewvolumen.jTlargo.getText()));
            this.modelvolumen.setAncho(Double.parseDouble(viewvolumen.jTancho.getText()));
                        this.modelvolumen.setAlto(Double.parseDouble(viewvolumen.jTalto.getText()));
      this.viewvolumen.jTresultadorectangulo.setText(""+this.modelvolumen.rectangulo());
    }
      
               
        public void actionPerformed(ActionEvent ae) {
             if (ae.getSource() ==viewvolumen.jBquadra){
            quadrado();
             }else if(ae.getSource() ==viewvolumen.jBrectangulo){
       rectangulo();
             }else if(ae.getSource() ==viewvolumen.jBrombo){
     rombo();
     
    }

}
 
}
