/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author demo
 */
public class Files {

    public static String selector() {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Audio");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                System.out.println("Directorio: " + chooser.getSelectedFile());
                return "file:///" + chooser.getSelectedFile();
                //return chooser.getSelectedFile() + "";
            } else {
                System.out.println("No  hay seleccion ");
                JOptionPane.showMessageDialog(chooser, " Be careful. You have not insert any file!", "Error", JOptionPane.ERROR_MESSAGE);
                //return "No  hay seleccion ";
                return null;
            }
        
    }
    
    public static String selectorT() {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Audio");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                System.out.println("Directorio: " + chooser.getSelectedFile());
                //return "file:///" + chooser.getSelectedFile();
                return chooser.getSelectedFile() + "";
            } else {
                System.out.println("No  hay seleccion ");
                JOptionPane.showMessageDialog(chooser, " Be careful. You have not insert any file!", "Error", JOptionPane.ERROR_MESSAGE);
                //return "No  hay seleccion ";
                return null;
            }
        
    }

}
