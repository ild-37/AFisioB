/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Musculitos_ild;
import Vistas.MiBrazito_ild;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author ild_37
 */
/**
     Clase controlador
     */ 
public class Mtr_Cerebrin_ild {
     
    private Musculitos_ild Antebrazo_duro=new Musculitos_ild();
   private MiBrazito_ild Brazo_fashion=new MiBrazito_ild();

    public Mtr_Cerebrin_ild(Musculitos_ild Antebrazo_duro , MiBrazito_ild Brazo_fashion) {
        this.Antebrazo_duro=Antebrazo_duro;
        this.Brazo_fashion=Brazo_fashion;
        System.out.println("Cerebrin al mando");
        ConfiguracionVentana();
        Brazo_fashion.setVisible(true);
        
    }

public void ConfiguracionVentana(){
         Brazo_fashion.setIconImage(getIconImage());
         Brazo_fashion.setTitle(Antebrazo_duro.getTitulo());
         Brazo_fashion.setSize(new Dimension(700, 500));
         
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
