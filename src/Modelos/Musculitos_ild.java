/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
 
   /**
     * Obtiene el título de la aplicación.
     *
     * @return el título de la aplicación.
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * Obtiene el ancho de la ventana de la aplicación.
     *
     * @return el ancho de la ventana.
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * Obtiene la altura de la ventana de la aplicación.
     *
     * @return la altura de la ventana.
     */
    public int getAlto() {
        return alto;
    }

    /**
     * Obtiene el ícono de la ventana de la aplicación.
     * <p>
     * La imagen es cargada desde los recursos de la aplicación y escalada a un tamaño de 80x80 píxeles.
     * </p>
     *
     * @return el ícono de la ventana de la aplicación.
     */
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

    /**
     * Obtiene el color de fondo desde un archivo XML.
     * <p>
     * Lee el archivo `Apariencia.xml` para obtener el color de fondo configurado en el nodo `<Color>` dentro de `<Background>`.
     * </p>
     *
     * @return el color de fondo en formato RGB como una cadena de texto.
     */
    public String ObtenerColorXml() {
        String color = "";
        try {
            // Ruta del archivo XML
            File xmlFile = new File("src/Apariencia.xml");

            // Crear un parser para leer el archivo XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            org.w3c.dom.Document document = builder.parse(xmlFile);

            // Normalizar el documento
            document.getDocumentElement().normalize();

            // Obtener el nodo <Colors> y luego el nodo <Background> y dentro de ese el nodo <Color>
            org.w3c.dom.Element colorsElement = (org.w3c.dom.Element) document.getElementsByTagName("Colors").item(0);
            if (colorsElement != null) {
                org.w3c.dom.Element backgroundColor = (org.w3c.dom.Element) colorsElement.getElementsByTagName("Background").item(0);
                if (backgroundColor != null) {
                    org.w3c.dom.Element colorElement = (org.w3c.dom.Element) backgroundColor.getElementsByTagName("Color").item(0);
                    if (colorElement != null) {
                        color = colorElement.getTextContent();
                        System.out.println("Color actual de fondo: " + color);
                    } else {
                        System.out.println("El nodo <Color> no se encontró en <Background>.");
                    }
                } else {
                    System.out.println("El nodo <Background> no se encontró dentro de <Colors>.");
                }
            } else {
                System.out.println("El nodo <Colors> no se encontró en el documento.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return color;
    }

    /**
     * Actualiza el color de fondo en el archivo XML.
     * <p>
     * Modifica el archivo `Apariencia.xml` para establecer el nuevo color de fondo especificado.
     * </p>
     *
     * @param NuevoColor el nuevo color de fondo en formato RGB como una cadena de texto.
     */
    public void ActualizarColor(String NuevoColor) {
        try {
            // Ruta del archivo XML
            File xmlFile = new File("src/Apariencia.xml");

            // Crear un parser para leer el archivo XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            org.w3c.dom.Document document = builder.parse(xmlFile);

            // Normalizar el documento
            document.getDocumentElement().normalize();

            // Obtener el nodo <Colors> y luego el nodo <Background> y dentro de ese el nodo <Color>
            org.w3c.dom.Element colorsElement = (org.w3c.dom.Element) document.getElementsByTagName("Colors").item(0);
            if (colorsElement != null) {
                org.w3c.dom.Element backgroundColor = (org.w3c.dom.Element) colorsElement.getElementsByTagName("Background").item(0);
                if (backgroundColor != null) {
                    org.w3c.dom.Element colorElement = (org.w3c.dom.Element) backgroundColor.getElementsByTagName("Color").item(0);
                    if (colorElement != null) {
                        // Modificar el color
                        // Color hexadecimal nuevo
                        colorElement.setTextContent(NuevoColor);
                        System.out.println("Color de fondo actualizado a: " + NuevoColor);

                        // Guardar los cambios en el archivo XML
                        TransformerFactory transformerFactory = TransformerFactory.newInstance();
                        Transformer transformer = transformerFactory.newTransformer();
                        DOMSource source = new DOMSource(document);
                        StreamResult result = new StreamResult(xmlFile);
                        transformer.transform(source, result);

                        System.out.println("Archivo XML actualizado correctamente.");
                    } else {
                        System.out.println("El nodo <Color> no se encontró en <Background>.");
                    }
                } else {
                    System.out.println("El nodo <Background> no se encontró dentro de <Colors>.");
                }
            } else {
                System.out.println("El nodo <Colors> no se encontró en el documento.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Convierte una cadena de texto con valores RGB a un objeto `Color`.
     * <p>
     * La cadena debe estar en formato `r,g,b`, donde `r`, `g`, y `b` son los valores de los componentes de color en formato decimal.
     * </p>
     *
     * @param rgb la cadena de texto que representa el color en formato RGB.
     * @return el color correspondiente en formato `Color`, o `Color.BLACK` si ocurre un error durante la conversión.
     */
    public Color rgbStringToColor(String rgb) {
        try {
            

        // Eliminar el texto innecesario y los corchetes
        rgb = rgb.substring(rgb.indexOf('[') + 1, rgb.indexOf(']'));

        // Dividir la cadena en partes
        String[] components = rgb.split(",");

        // Extraer los valores
        int r = Integer.parseInt(components[0].split("=")[1]);
        int g = Integer.parseInt(components[1].split("=")[1]);
        int b = Integer.parseInt(components[2].split("=")[1]);
            
            return new Color(r, g, b);
        } catch (Exception e) {
            System.out.println("Error al convertir el string RGB: " + rgb);
            return Color.BLACK; // Color por defecto en caso de error
        }
    }
}