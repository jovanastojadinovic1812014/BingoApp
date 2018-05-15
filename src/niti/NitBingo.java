/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niti;

import javax.swing.JLabel;

/**
 *
 * @author Jovana
 */
public class NitBingo extends Thread {

    private JLabel jlblBroj1;
    private JLabel jlblBroj2;
    private JLabel jlblBroj3;

    private boolean aktivan;

    public NitBingo(JLabel jlblBroj1, JLabel jlblBroj2, JLabel jlblBroj3) {
        this.jlblBroj1 = jlblBroj1;
        this.jlblBroj2 = jlblBroj2;
        this.jlblBroj3 = jlblBroj3;

        this.aktivan = true;
    }

    @Override
    public void run() {
        while (aktivan) {
            jlblBroj1.setText(String.valueOf(Math.round(Math.random() * 9)));
            jlblBroj2.setText(String.valueOf(Math.round(Math.random() * 9)));
            jlblBroj3.setText(String.valueOf(Math.round(Math.random() * 9)));
        }
    }

    public void prekiniNit() {
        this.aktivan = false;
    }

}
