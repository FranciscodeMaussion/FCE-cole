/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstracta;

import Datos.*;

/**
 *
 * @author demo
 */
public class Meter {

    public static Options[] addOpt(Options optAux, Options[] array) {
        /*for (int i = 0; i < array.length; i++) {
         if (array[i] != null) {
         System.out.println(array[i].toString());
         }
         }*/
        for (int i = 0; i < array.length; i++) {

            if (array[i] == null) {
                array[i] = optAux;
                return array;
            }
        }
        return array;
    }
}
