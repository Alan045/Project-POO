package PApps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/*
MONTSERRAT ROJAS SANTILLAN
para poder realizar los metodos de la interfaz en las clases abstractas, se utilizaran los metodos swing y awt 
que nos ayudan a crear los botones que se vayan a utilizar ya sean de texto, imagen, iconos
etc; estos nos ayudaran a crear nuevas pestañas para mostrar las operaciones de la television.
para que el kit de herramientas awt tenga mas opciones, se pueden utilizar los eventos para facilitar los cambios 
que se hagan dentro de las clases abstractas, estos seran accionados por medio de los botones
*/

/**
 * Class App
 */
public class App implements ActionListener {
    AppStreaming stream;
    AppMusica music;
    Acciones hacer;
  //
  // Fields
  //

/*
MONTSERRAT ROJAS SANTILLAN
la clase App llama a la interfaz actionlistener para detectar el movimiento de los eventos ya sea por uso de botones
cuadros de texto, imagenes, pestañas/ventanas
las aplicaciones de transmision y de sonido se encargaran mostrar la accion de la imagen o video, el reproductor 
de audio o musica, las imagenes/iconos para el menu, el volumen, los canales y la configuracion.
*/
  
  //
  // Constructors
  //
  //
    public App(){
    }
    
    public App(AppStreaming a, Acciones b){
        this.stream = a;
        this.hacer = b;
    }
  
/*
MONTSERRAT ROJAS SANTILLAN
se hace el llamado de la clase app en la cual se ejecutan las acciones de la transmision y las acciones por medio
de metodos denominados como a y b, haciendo referencia a los objetos
*/ 
	
    public App(AppMusica c, Acciones b){
        this.music = c;
        this.hacer = b;
    }
    
/*
MONTSERRAT ROJAS SANTILLAN
se hace el llamado de la clase app en la cual se ejecutan las acciones de la musica y las que por medio de metodos 
denominados como c y d se hace referencia a los objetos agreando de el uso de la app de musica y que va a reproducir.
*/
  
  //
  // Methods
  //
    

  //
  // Accessor methods
  //


  //
  // Other methods
  //
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Esta en la activacion de APPs");
        //System.out.println("El valor de APP en activacion: "+e.getActionCommand());
        if ("Stream".equals(e.getActionCommand())) {
            
            System.out.println("Activo la App Stream");
            stream.abrir();
            
        }else if ("Musica".equals(e.getActionCommand())) {
            music.abrir();
            System.out.println("Activo la App Musica");
	
        }
    }
	
/*
MONTSERRAT ROJAS SANTILLAN
invocamos el metodo actionEvent para que el evento de generacion realice las acciones de los botones de transmision y sonido
esto con el fin de darle a la pestaña la accion de los botones, si dado el caso se selecciona "stream" se realizara la transmision de
imagen, pero si no, se realizara la accion de la aplicacion de la musica
*/

}
