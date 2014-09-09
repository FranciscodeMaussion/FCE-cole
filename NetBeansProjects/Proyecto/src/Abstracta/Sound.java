/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstracta;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.*;
import javax.media.format.AudioFormat;

/**
 *
 * @author demo
 */
public class Sound {

    public static void play(String args) {
        if (args != null) {
            try {
                /* Esta es la direccion del codec que decodifica los mp3 */
                String jffmpegAudioDecoder = "net.sourceforge.jffmpeg.AudioDecoder";
                /* Cargamos el codec y lo guardamos en un objeto de tipo Codec */
                Codec codecAudio = (Codec) Class.forName(jffmpegAudioDecoder).newInstance();
                /* Agregamos los codec al PlugInManager */
                PlugInManager.addPlugIn(jffmpegAudioDecoder,
                        codecAudio.getSupportedInputFormats(),
                        new Format[]{new AudioFormat("LINEAR")},
                        PlugInManager.CODEC);
                /* Y ahora podemos crear un objeto Player que es del JMF */
                Player miPlayer = Manager.createPlayer(new URL(args));
                /* Le ponemos Play a nuestro archivo cargado  */
                miPlayer.start();
            } catch (NoPlayerException ex) {
                Logger.getLogger(Sound.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(Sound.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Sound.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Sound.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Sound.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Sound.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
            System.out.println("ERROR: Debes pasar como parametro la direccion de un archivo mp3");
        }
    }
}
