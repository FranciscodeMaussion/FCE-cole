/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template File, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author demo
 */
public class File {
    private static String archivo = "Default.fce";
    private static FileInputStream fis = null;
    private static ObjectInputStream ois = null;
    private static FileOutputStream fos = null;
    private static ObjectOutputStream oos = null;
    
    public static String saveExam(Exam exam,String path) {
        if (path!=null){
            archivo=path;
        }
        String ret = "You charge it OK";
        boolean flag = true;
        String fileTmp = "tmpFile.fce";
        //Se carga el array en un archivo temporal
        try {
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);            
            oos.writeObject(exam);


        } catch (FileNotFoundException ex) {
            flag = false;
            ret = "File not founded" + ex;
            return ret;
        } catch (IOException ex) {
            flag = false;
            ret = "Fail to save the archive " + ex;
            return ret;
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                    oos = null;
                }
                if (fos != null) {
                    fos.close();
                    fos = null;
                }
            } catch (IOException e) {
                System.out.println("Closing Error "+ e);
            }
        }
        


        return ret;

    }


    public static Exam openExam(String path) {
        if (path!=null){
            archivo=path;
        }
        Exam obj=null;       

        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);

            while (true) {
                obj =(Exam) ois.readObject();                               
            }

        }catch (EOFException e1) {
            //END OF FILE!
        } catch (Exception e2) {
            System.out.println("Error!!!" + e2);
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                    ois = null;
                }
                if (fis != null) {
                    fis.close();
                    fis = null;
                }
            } catch (IOException e) {
                System.out.println("Closing Error " + e);
            }
        }

        return obj;
    }
}
