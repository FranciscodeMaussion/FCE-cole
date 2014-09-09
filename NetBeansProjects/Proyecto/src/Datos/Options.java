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
public class Options implements Serializable{
    private int number;
    private String text;
    private boolean correct;

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

    public boolean getCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Options{" + "number=" + number + ", text=" + text + ", correct=" + correct + '}';
    }
    
}
