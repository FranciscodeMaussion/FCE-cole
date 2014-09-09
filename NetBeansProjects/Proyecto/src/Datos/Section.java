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
public class Section implements Serializable{
    private Part[] part = null;

    public Part[] getPart() {
        return part;
    }

    public void setPart(Part[] part) {
        this.part = part;
    }


    
}
