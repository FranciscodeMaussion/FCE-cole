/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import java.io.Serializable;

/**
 *
 * @author demo
 */
public class Part implements Serializable{
    private int numOT; //numero de tasks
    private Tasks[] task=null;
    private String pathDePart=null;

    public String getPathDePart() {
        return pathDePart;
    }

    public void setPathDePart(String pathDePart) {
        this.pathDePart = pathDePart;
    }

    public Tasks[] getTask() {
        return task;
    }

    public void setTask(Tasks[] task) {
        this.task = task;
    }
    
     public int getNumOT() {
        return numOT;
    }

    public void setNumOT(int numOT) {
        this.numOT = numOT;
    }
    
}
