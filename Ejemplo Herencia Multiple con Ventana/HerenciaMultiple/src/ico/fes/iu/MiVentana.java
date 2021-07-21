/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.iu;

import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Victor
 */
public class MiVentana extends JFrame implements WindowListener,MouseListener {

    public MiVentana() throws HeadlessException {
        super("Herencia multiple");
        setSize(600, 400);
        setVisible(true);
        addWindowListener(this);
        addMouseListener(this);
        
    }

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Abriendo ventana...");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Cerrando ventana...");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {
        
    }

    @Override
    public void windowIconified(WindowEvent we) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        
    }

    @Override
    public void windowActivated(WindowEvent we) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Se presionó un boton del raton");
        System.out.println( "X: "+me.getX() + " Y: "+me.getY() );
        System.out.println("Se hizo clic button: "+ me.getButton()+"\n");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
    
}
