/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import views.ViewMain;
import models.ModelMain;

/**
 * 
 * @author Bnc
 */
public class ControllerMain  implements ActionListener {
ViewMain viewmain;
ModelMain modelmain;
   JPanel views[];
   
    public ControllerMain(ViewMain viewmain, ModelMain modelmain, JPanel[] views) {
        this.viewmain = viewmain;
        this.modelmain = modelmain;
        this.views = views;
        
         this.viewmain.jMcalcular.addActionListener( this);
          this.viewmain.jMVolumen.addActionListener( this);
                this.viewmain.jMPerimetro.addActionListener( this);
          initView();
    }
    
public void actionPerformed(ActionEvent ae) {
    
        if(ae.getSource ()==viewmain.jMarea){
jmiArea(); 

    }else if (ae.getSource ()==viewmain.jMVolumen){
      jmiVolumen();
      
    }else if (ae.getSource ()==viewmain.jMPerimetro){
      jmiPerimetro();
    }
 }


    public void jmiVolumen(){
        this.viewmain.setContentPane(views[0]);
        this.viewmain.revalidate();
        this.viewmain.repaint();
    }
       public void jmiArea(){
        this.viewmain.setContentPane(views[1]);
        this.viewmain.revalidate();
        this.viewmain.repaint();

    }
         public void jmiPerimetro(){
        this.viewmain.setContentPane(views[2]);
        this.viewmain.revalidate();
        this.viewmain.repaint();

    }
     public void initView(){
        this.viewmain.setTitle("Areas, Perimetros y Volumenes");
        this.viewmain.setLocationRelativeTo(null);
        this.viewmain.setVisible(true);
   }

   

    
}
