/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Musculitos_ild;
import Vistas.Mibrazito_ildCarga;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.TimerTask;
import javax.swing.Timer;

/**
 *
 * @author ild_37
 */
/**
     Clase controlador
     */ 
public class Mtr_Cerebrin_ild {
     
    private Musculitos_ild Antebrazo_duro=new Musculitos_ild();
   private Mibrazito_ildCarga Brazo_fashion=new Mibrazito_ildCarga();

    public Mtr_Cerebrin_ild(Musculitos_ild Antebrazo_duro , Mibrazito_ildCarga Brazo_fashion) {
        this.Antebrazo_duro=Antebrazo_duro;
        this.Brazo_fashion=Brazo_fashion;
        System.out.println("Cerebrin al mando");
        ConfiguracionVentana();
        Brazo_fashion.setVisible(true);
        temporizador();
      
    }
        
    

public void ConfiguracionVentana(){
         Brazo_fashion.setIconImage(getIconImage());
         Brazo_fashion.setTitle(Antebrazo_duro.getTitulo());
         Brazo_fashion.setSize(new Dimension(700, 500));
         Brazo_fashion.setLocationRelativeTo(null); 
         
}
public void temporizador(){
    new Thread(() -> {
            try {
                Thread.sleep(15000); // Pausa de 15 segundos
                Brazo_fashion.dispose(); // Cierra la ventana
                System.out.println("Ventana cerrada después de 15 segundos.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

   public Image getIconImage() {
    // Cargar la imagen desde el recurso
    Image originalImage = Toolkit.getDefaultToolkit()
            .getImage(ClassLoader.getSystemResource("imagenes/logo_afisiob.png"));
    // Escalar la imagen al tamaño deseado
    int width = 80;  // Ancho deseado del logo
    int height = 80; // Altura deseada del logo
    Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    return scaledImage;
}
}
