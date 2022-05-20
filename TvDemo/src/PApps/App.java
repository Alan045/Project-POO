package PApps;

import javax.swing.JFrame;



/**
 * Class App
 */
public class App extends JFrame {
    public static void main(String[] args) {
   
  //
  // Fields ghfghfgh
  //
    SubInterfaz Primventana = new SubInterfaz();
    Primventana.setSize(1920,1080);
    Primventana.setVisible(true);
    
    
   }
  //
  // Constructors
  //
  //Herrera improvement public App () { };
  
  //
  // Methods
  //
   public void panelGeneral(){
       SubInterfaz vent = new SubInterfaz();
       vent.setUndecorated(true);
       vent.setSize(1920,1080);
       vent.specsVentana();
   }

  //
  // Accessor methods
  //

  //
  // Other methods
  //
   
}
