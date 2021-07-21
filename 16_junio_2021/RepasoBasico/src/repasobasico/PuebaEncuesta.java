/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasobasico;

import ico.fes.dispositivos.SmartPhone;
import ico.fes.inegi.EncuestadorInegi;

/**
 *
 * @author Victor
 */
public class PuebaEncuesta {
    // psvm para hacer la estructura
    public static void main(String[] args) {
        EncuestadorInegi e1 = new EncuestadorInegi();
        e1.setNombre("Jose");  // se esta asignando el nombre
        e1.setDispositivo( new SmartPhone("LG", "MT1" , "Gris", 6.0f) );
        System.out.println(e1.getNombre());
        e1.setNombre("Mario");   // se esta cambiando el nombre
        System.out.println(e1.getNombre());
        System.out.println(e1.getDispositivo().getColor());  // se muestra solo el color del dispositivo
        e1.getDispositivo().setModelo("LTT23");  // se esta cambiando el modelo del dispositivo
        System.out.println(e1.getDispositivo());
    }
}
