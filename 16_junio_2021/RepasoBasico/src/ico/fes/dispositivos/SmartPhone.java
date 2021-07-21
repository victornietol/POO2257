/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.dispositivos;

/**
 *
 * @author VictorN
 */
public class SmartPhone {
    private String marca;   // Estos son los atributos
    private String modelo;
    private String color;
    private float tamanio;   

    public SmartPhone() {  // es lo mismo que abajo (metodo por defecto), constructor por defecto
    }                      // todos sus valores se vuelven los minimos (por defecto)

    public SmartPhone(String m, String mod, String c, float t) {  // se declaran ya los valores iniciales (metodo sobrecargado)
        this.marca = m;                                           // constructor sobrecargado
        this.modelo = mod;
        this.color = c;
        this.tamanio = t;
    }
    
    public SmartPhone(String m, String mod){
        this.marca = m;
        this.modelo = mod;
    }

    public SmartPhone(String m) {  // es lo mismo de arriba, pero es un caso aislado
        this.marca = m;            // constructor sobrecargado
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        System.out.println("Estableciendo un nuevo valor para tamanio");
        // validaciones de la logica del dominio del problema
        if(tamanio <= 10.0f && tamanio > 3.0f ){
        this.tamanio = tamanio;
        }else{
            System.out.println("Ese tamaño no corresponde al dominio del problema");
        }
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamanio=" + tamanio + '}';
    }
    
    public boolean encender(){
        System.out.println("Encendiendo el equipo "+ this.marca );
        return true;
    }
    
    /**
     * El método llamar simula el funcionamiento del programa de telefono de un 
     * un smartPhone, esto gracias a la posibilidad de la abstracción.
     * 
     * @param numeroDestino Número a llamar.
     * @return int que representa el numero de minutos que duró la llamada.
     * 
     */
    public int llamar(int numeroDestino){
        System.out.println("Llamando al numero " + numeroDestino );
        return 60;
    }
    
    public void tomarFoto(){
        System.out.println("Tomando foto ...");
    }
    
}
