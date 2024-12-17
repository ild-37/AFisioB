/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Musculitos_ild;
import Vistas.Configuracion;
import Vistas.MibrazitoMain;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.WindowListener;

/**
 *
 * @author ild_37
 */
public class mtr_Cerbrin_ild_Main implements ActionListener{
   private Configuracion AjustesVentanitaMain;
   private MibrazitoMain VentanitaMain=new MibrazitoMain();
   private Musculitos_ild ModeloVentanita=new Musculitos_ild();

    
    /**
     * Constructor que inicializa las vistas y el modelo, y configura la ventana principal.
     * <p>
     * Este constructor asocia la vista principal y la configuración de la ventana, además de hacerla visible y asociar los escuchadores
     * para las acciones del usuario.
     * </p>
     *
     * @param AjustesVentanitaMain la ventana de configuración utilizada para cambiar ajustes
     * @param VentanitaMain la vista principal que se mostrará al usuario
     * @param ModeloVentanita el modelo que se utilizará para configurar la ventana
     */
    public mtr_Cerbrin_ild_Main(Configuracion AjustesVentanitaMain, MibrazitoMain VentanitaMain, Musculitos_ild ModeloVentanita) {
        this.AjustesVentanitaMain = AjustesVentanitaMain;
        this.ModeloVentanita = ModeloVentanita;
        this.VentanitaMain = VentanitaMain;
        System.out.println("Cerebrin del main hablando");
        ConfiguracionVentana();
        VentanitaMain.setVisible(true);
        asociarListenersEscuchadores(this);
    }

    /**
     * Configura la ventana principal.
     * <p>
     * Esta función ajusta el icono, el título, las dimensiones, la ubicación, el tamaño de la ventana y el color de fondo
     * utilizando los parámetros definidos en el modelo.
     * </p>
     */
    public void ConfiguracionVentana() {
        VentanitaMain.setIconImage(ModeloVentanita.getIconImage());
        VentanitaMain.setTitle(ModeloVentanita.getTitulo());
        VentanitaMain.setSize(new Dimension(ModeloVentanita.getAncho(), ModeloVentanita.getAlto()));
        VentanitaMain.setLocationRelativeTo(null);
        VentanitaMain.setResizable(false); // Deshabilita el cambio de tamaño
        VentanitaMain.getContentPane().setBackground(ModeloVentanita.rgbStringToColor(ModeloVentanita.ObtenerColorXml()));
        VentanitaMain.repaint();
    }

    /**
     * Asocia los escuchadores de acción para los botones de la ventana principal.
     * <p>
     * Esta función se asegura de que los botones de la ventana principal y de la ventana de configuración
     * tengan los correspondientes escuchadores de acción asignados.
     * </p>
     *
     * @param listener el escuchador de acción que responderá a los eventos de los botones
     */
    public void asociarListenersEscuchadores(ActionListener listener) {
        VentanitaMain.ClickBtnAjustes(this);
        AjustesVentanitaMain.ClickBtnCambiar(this);
    }

    /**
     * Responde a las acciones realizadas por el usuario en los botones de la interfaz gráfica.
     * <p>
     * Este método maneja las acciones de click en los botones de la vista principal, como la apertura de la ventana
     * de ajustes y el cambio de color de fondo de la ventana principal.
     * </p>
     *
     * @param e el evento que contiene información sobre la acción del usuario
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("  Se ha producido un click");
        switch (e.getActionCommand()) {
            case "Ajustes":
                System.out.println("Se ha clickeado el botón de ajustes");
                AjustesVentanitaMain = new Configuracion(VentanitaMain, true);
                AjustesVentanitaMain.ClickBtnCambiar(this);
                AjustesVentanitaMain.setVisible(true);
                break;
            case "Cambiar":
                System.out.println("Se ha pulsado cambiar color");
                // Obtiene el nuevo color seleccionado en la ventana de ajustes
                Color nuevoColor = AjustesVentanitaMain.getJColorColores().getColor();
                System.out.println("Nuevo color seleccionado: " + nuevoColor);

                // Cambia el fondo de la ventana principal
                VentanitaMain.getContentPane().setBackground(nuevoColor);
                VentanitaMain.repaint();
                ModeloVentanita.ActualizarColor(nuevoColor.toString());
                break;
            default:
                System.out.println("Comando de acción desconocido: " + e.getActionCommand());
        }
    }
}

   

