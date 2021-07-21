/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author Victor
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil miBocho= new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println( miBocho);
        
        Automovil miAcura= new Automovil();
        miAcura.setMarca("Acura");
        miAcura.setSubMarca("NSX");
        miAcura.setModelo(2013);
        miAcura.setColor(Color.gray);
        System.out.println( miAcura );
        
        Automovil miMustang= new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setSubMarca("Mustang");
        miMustang.setModelo(2010);
        miMustang.setColor(Color.yellow);
        System.out.println( miMustang );
        
        Automovil miTsuru= new Automovil();
        miTsuru.setMarca("Nissan");
        miTsuru.setSubMarca("Tsuru");
        miTsuru.setModelo(1995);
        miTsuru.setColor(Color.red);
        System.out.println( miTsuru );
        
        Automovil miAMG= new Automovil();
        miAMG.setMarca("Mercedes-Benz");
        miAMG.setSubMarca("AMG GTR");
        miAMG.setModelo(2018);
        miAMG.setColor(Color.green);
        System.out.println( miAMG );
        
        Automovil miMclaren= new Automovil();
        miMclaren.setMarca("McLaren");
        miMclaren.setSubMarca("720s");
        miMclaren.setModelo(2017);
        miMclaren.setColor(Color.ORANGE);
        System.out.println( miMclaren );
    }
    
}
