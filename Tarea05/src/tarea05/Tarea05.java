/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea05;

import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
import ico.fes.equipo.Computadora;

/**
 *
 * @author Victor
 */
public class Tarea05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora computadoraA = new Computadora();
        computadoraA.setMarca(1);
        computadoraA.setModelo(1001);
        
        Monitor[] tmpMonitorA = new Monitor[3];
        tmpMonitorA[0] = new Monitor("BenQ Zowie", "XL2546K", 24);
        tmpMonitorA[1] = new Monitor("Alienware", "AW2518HF", 25);
        tmpMonitorA[2] = new Monitor("Asus ROG", "PG259QNR", 24);
        computadoraA.setMonitor(tmpMonitorA);
        
        Mouse[] tmpMouseA = new Mouse[2];
        tmpMouseA[0] = new Mouse("Logitech", "Pro X Superlight", "Óptico");
        tmpMouseA[1] = new Mouse("Razer", "Viper Ultimate", "Óptico");
        computadoraA.setMouse(tmpMouseA);
        
        Teclado[] tmpTecladoA = new Teclado[2];
        tmpTecladoA[0] = new Teclado("Razer", "Huntsman Mini", 61, 0);
        tmpTecladoA[1] = new Teclado("Wooting", "One", 88, 0);
        computadoraA.setTeclado(tmpTecladoA);
        
        computadoraA.setCpu( new Cpu("AMD", "Ryzen 9 5900X", 3));
        
        
        Computadora computadoraB = new Computadora();
        computadoraB.setMarca(2);
        computadoraB.setModelo(2002);
        
        Monitor[] tmpMonitorB = new Monitor[2];
        tmpMonitorB[0] = new Monitor("BenQ", "MOBIUZ EX2510", 24);
        tmpMonitorB[1] = new Monitor("Asus", "VG259Q", 24);
        computadoraB.setMonitor(tmpMonitorB);
        
        Mouse[] tmpMouseB = new Mouse[1];
        tmpMouseB[0] = new Mouse("HyperX", "Pulse Fire Haste", "Óptico");
        computadoraB.setMouse(tmpMouseB);
        
        Teclado[] tmpTecladoB = new Teclado[1];
        tmpTecladoB[0] = new Teclado("HyperX", "Alloy FPS Pro", 88, 0);
        computadoraB.setTeclado(tmpTecladoB);
        
        computadoraB.setCpu(new Cpu("AMD", "Ryzen 5 5600X", 3));
        
        
        System.out.println( computadoraA );
        System.out.println( computadoraB ); 
       
        
        
    }
    
}
