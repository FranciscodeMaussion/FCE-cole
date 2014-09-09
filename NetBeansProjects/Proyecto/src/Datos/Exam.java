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
public class Exam implements Serializable{
    private String name;
    private int number;
    private Section[] section= null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Section[] getSection() {
        return section;
    }

    public void setSection(Section[] section) {
        this.section = section;
    }

}
