/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author ild_37
 */
/**
     Clase Modelo
     */
public class Musculitos_ild {
 private String Titulo="AFisioB";
 private int ancho=700;
 private int alto=500;
 
  public String getTitulo() {
        return Titulo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
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
