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
public class Tasks implements Serializable{
    private int number;
    private String text;
    private Options[] option = null;
    private int numOO; 

    public int getNumOO() {
        return numOO;
    }

    public void setNumOO(int numOO) {
        this.numOO = numOO;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Options[] getOption() {
        return option;
    }

    public void setOption(Options[] option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Tasks{" + "number=" + number + ", text=" + text + '}';
    }
    
}
