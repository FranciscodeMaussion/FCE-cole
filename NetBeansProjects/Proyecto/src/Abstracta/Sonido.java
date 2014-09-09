/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Abstracta;
import sun.audio.*;
import java.io.*;
import java.applet.*;

/**
 *
 * @author demo
 */
public class Sonido {
    private static AudioStream temp;
    
    public static void reproducir(String path,int option){
        AudioPlayer player = AudioPlayer.player;
        AudioStream audio;
        
        try {
            InputStream auSin = new FileInputStream(path);
            audio = new AudioStream(auSin);
            switch(option){
                case 0:
                    player.start(audio);
                    if(temp==null){
                        temp=audio;
                    }else{
                        player.stop(temp);
                        temp=audio;
                    }
                    break;
                case 1:
                    player.stop(temp);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } catch (Exception e) {
            System.out.print(""+e);
        }
    }
}
