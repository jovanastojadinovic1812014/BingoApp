/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Jovana
 */
public class NitSat implements Runnable{

    private JLabel jlblSat;

    public NitSat(JLabel jlblSat) {
        this.jlblSat = jlblSat;
    }
    
    
    @Override
    public void run() {
        
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        while(true){
            try {
                jlblSat.setText(df.format(new Date()));
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
}
