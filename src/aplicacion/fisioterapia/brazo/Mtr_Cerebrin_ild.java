/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion.fisioterapia.brazo;

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
    }


   
}
