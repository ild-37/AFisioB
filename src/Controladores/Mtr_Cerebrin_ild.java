/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Musculitos_ild;
import Vistas.Configuracion;
import Vistas.MibrazitoMain;
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
   private  mtr_Cerbrin_ild_Main MasterDelMain;
   private MibrazitoMain Main_fashion;
   private Configuracion ConfigDialog;

   /**
     * Constructor que inicializa la vista y el modelo.
     * <p>
     * Este constructor establece el modelo y la vista para que el controlador pueda gestionarlos. Además, se configura la ventana de la vista
     * y se inicia un temporizador para la transición entre vistas.
     * </p>
     *
     * @param Antebrazo_duro el modelo que se utilizará para la configuración de la vista
     * @param Brazo_fashion la vista que se mostrará al usuario
     */
    public Mtr_Cerebrin_ild(Musculitos_ild Antebrazo_duro, Mibrazito_ildCarga Brazo_fashion) {
        this.Antebrazo_duro = Antebrazo_duro;
        this.Brazo_fashion = Brazo_fashion;
        System.out.println("Cerebrin al mando");
        ConfiguracionVentana();
        Brazo_fashion.setVisible(true);
        temporizador();
    }

    /**
     * Configura la ventana de la vista inicial.
     * <p>
     * Esta función ajusta la imagen, el título, las dimensiones y la ubicación de la ventana. También impide que la ventana se pueda redimensionar.
     * </p>
     */
    public void ConfiguracionVentana() {
        Brazo_fashion.setIconImage(Antebrazo_duro.getIconImage());
        Brazo_fashion.setTitle(Antebrazo_duro.getTitulo());
        Brazo_fashion.setSize(new Dimension(Antebrazo_duro.getAncho(), Antebrazo_duro.getAlto()));
        Brazo_fashion.setLocationRelativeTo(null);
        Brazo_fashion.setResizable(false); // Deshabilita el cambio de tamaño
    }

    /**
     * Inicia un temporizador para cambiar la vista después de un intervalo de tiempo.
     * <p>
     * Esta función crea un hilo que espera durante 5 segundos antes de llamar a la siguiente ventana y cerrar la actual.
     * </p>
     */
    public void temporizador() {
        new Thread(() -> {
            try {
                Thread.sleep(5000); // Pausa de 5 segundos
                llamar_Ventanita_Main(); // Llama a la siguiente ventana antes de cerrar la otra
                Brazo_fashion.dispose(); // Cierra la ventana actual

                System.out.println("Ventana cerrada después de 5 segundos.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    /**
     * Llama a la ventana principal después de cerrar la ventana actual.
     * <p>
     * Esta función inicializa la ventana principal y el controlador asociado.
     * </p>
     */
    public void llamar_Ventanita_Main() {
        Main_fashion = new MibrazitoMain();
        System.out.println("Hola");
        MasterDelMain = new mtr_Cerbrin_ild_Main(null, Main_fashion, Antebrazo_duro);
    }
}