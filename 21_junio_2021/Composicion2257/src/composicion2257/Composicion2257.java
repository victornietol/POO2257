/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion2257;

import ico.fes.objetos.Puerta;
import ico.fes.objetos.PuertaDeSeguridad;
import ico.fes.objetos.Ventana;
import ico.fes.partes.Muro;
import java.awt.Color;

/**
 *
 * @author Victor
 */
public class Composicion2257 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Muro muroNorte = new Muro();
        muroNorte.setPuerta( new Puerta("Madera", Color.white, true) );
        Ventana[] tmpVentanas = new Ventana[2];   // asi se reserva espacio en memoria para el arreglo
        tmpVentanas[0] = new Ventana("Madera", Color.yellow, 0.5f, 1.0f);
        tmpVentanas[1] = new Ventana("Madera", Color.green, 0.5f, 1.0f);
        muroNorte.setVentanas(tmpVentanas);
        
        System.out.println( muroNorte );
        System.out.println( muroNorte.getVentanas()[0]); // mostrar la ventana 1
        System.out.println( muroNorte.getVentanas()[1]); // mostrar la ventana 2
        
        muroNorte.getPuerta().setMaterial("Aluminio");  // cambiar el material de la puerta
        System.out.println( muroNorte );
        
        muroNorte.getVentanas()[1].setMaterial("Aluminio");  // cambiar el material de la ventana 2
        System.out.println( muroNorte.getVentanas()[1]);
        
        
        Muro muroSur = new Muro(5.0f, 4.5f, 2.5f, Color.blue, 
                new Puerta("Aluminio", Color.white, false), null);  // creando un objeto Puerta con caracteristicas definidas
        // Muro muroSur = new Muro(5.0f, 4.5f, 2.5f, Color.blue, new Puerta(), null);  // crear objeto muro pero sin definir los valores de Puerta
        
        System.out.println("------------------Ejemplos de herencia----------------");
        PuertaDeSeguridad puer1 = new PuertaDeSeguridad();
        puer1.abrir();
        puer1.cerrar();
        puer1.setColor(Color.gray);
        System.out.println("La puerta de seguridad es de color: "+ puer1.getColor());
        
        PuertaDeSeguridad puer2 = new PuertaDeSeguridad("Chapa electronica", "1234dios", "Metal", Color.gray, false);
        System.out.println( puer2.toString() );
        
    }
    
}
