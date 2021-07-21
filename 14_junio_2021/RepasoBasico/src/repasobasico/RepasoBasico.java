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
public class RepasoBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SmartPhone cel1 = new SmartPhone("Samsung");  //cel1 y cel2 son objetos, SmartPhone es la clase
        SmartPhone cel2 = new SmartPhone("Huawei", "P40", "Gris", 5.5f);
        SmartPhone cel3 = new SmartPhone("Apple" , "Iphone 8");
        SmartPhone cel4 = new SmartPhone();
        System.out.println(cel1);
        System.out.println(cel2);
        System.out.println(cel3);
        System.out.println(cel4);
        
        EncuestadorInegi enc1 = new EncuestadorInegi();
        enc1.setDispositivo(cel2); 
        
        // Uso de metodos de acceso
        cel1.setModelo("Galaxy Note 10");
        System.out.println(cel1);
        System.out.println("Marca del cel: " + cel1.getMarca() );
        
        // Uso de un atributo no protegido
        // cel1.tamanio = 6.5f;   // rompe con la logica del negocio (vda real), no se puede comprobar la inf.
        cel1.setTamanio(626.5f);
        System.out.println(cel1);
        
        cel1.setTamanio(5.5f);
        System.out.println(cel1);
    }
    
}
