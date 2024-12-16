/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Musculitos_ild;
import Vistas.Configuracion;
import Vistas.MibrazitoMain;
import java.awt.Dimension;

/**
 *
 * @author ild_37
 */
public class mtr_Cerbrin_ild_Main {
   private Configuracion AjustesVentanitaMain;
   private MibrazitoMain VentanitaMain=new MibrazitoMain();
   private Musculitos_ild ModeloVentanita=new Musculitos_ild();

    public mtr_Cerbrin_ild_Main(Configuracion AjustesVentanitaMain,MibrazitoMain VentanitaMain,Musculitos_ild ModeloVentanita) {
        this.AjustesVentanitaMain = AjustesVentanitaMain;
        this.ModeloVentanita= ModeloVentanita;
        this.VentanitaMain=VentanitaMain;
              System.out.println("Cerebrin del main hablando");
        ConfiguracionVentana();
        VentanitaMain.setVisible(true);

    }
        
    

public void ConfiguracionVentana(){
         VentanitaMain.setIconImage(ModeloVentanita.getIconImage());
         VentanitaMain.setTitle(ModeloVentanita.getTitulo());
         VentanitaMain.setSize(new Dimension(ModeloVentanita.getAncho(),ModeloVentanita.getAlto()));
         VentanitaMain.setLocationRelativeTo(null); 
         VentanitaMain.setResizable(false); // Deshabilita el cambio de tamaño
         
        }



}
   

