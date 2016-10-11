/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;
import  views.*;
import models.*;
import controllers.*;
import javax.swing.JPanel;
/**
 * 
 * @author Karla
 */
public class Main {

    private static ViewMain viewMain;
    private static ModelMain modelMain;
    private static ControllerMain controllerMain;
 
   private static ViewArea  viewArea;
   private static ModelArea modelArea;
   private static ControllerArea controllerArea;
 
       private static ViewVolumen viewVolumen;
    private static ModelVolumen modelVolumen;
    private static ControllerVolumen controllerVolumen;
    
           private static ViewPerimetro viewPerimetro;
    private static ModelPerimetro modelPerimetro;
    private static ControllerPerimetro controllerPerimetro;
    
    
     public static void main(String [] jr){
        
        viewArea=new ViewArea();
        modelArea=new ModelArea();
        controllerArea=new ControllerArea(viewArea,modelArea);
        
        viewVolumen=new  ViewVolumen();
        modelVolumen=new ModelVolumen();
    controllerVolumen=new ControllerVolumen(viewVolumen,modelVolumen);
    
    
         viewPerimetro=new  ViewPerimetro();
        modelPerimetro=new ModelPerimetro();
  controllerPerimetro=new ControllerPerimetro(viewPerimetro,modelPerimetro);////////////////////////
    
    JPanel views[]=new JPanel[3];  
  views[0]=viewVolumen;   
  views[1]=viewArea;
  views[2]=viewPerimetro;
  
   // declarar
    
    viewMain=new ViewMain();
    modelMain=new ModelMain();
    controllerMain=new ControllerMain(viewMain,modelMain,views);
 
controllerMain.initView();
    }
     
   
}
