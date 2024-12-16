/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion.fisioterapia.brazo;

import Modelos.Musculitos_ild;
import Vistas.Mibrazito_ildCarga;
import Controladores.Mtr_Cerebrin_ild;

/**
 *
 * @author ild_37
 */
/**
     Clase main 
     */
public class NerviosAcero_ild {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Iniciando Programa");
        Mibrazito_ildCarga BrazoVistoso=new  Mibrazito_ildCarga();
        Musculitos_ild  MusculoOlimpia=new Musculitos_ild();
        Mtr_Cerebrin_ild CerebroOrquesta=new Mtr_Cerebrin_ild(MusculoOlimpia, BrazoVistoso);
        
    }
    
}
