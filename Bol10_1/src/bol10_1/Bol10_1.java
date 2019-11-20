/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol10_1;

import javax.swing.JOptionPane;


/**
 *
 * @author xdeantabelisario
 */
public class Bol10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aNum, vidas, dato,i;
        String res=JOptionPane.showInputDialog("Introduce un numero:");
        aNum=Integer.parseInt(res);
        String res2=JOptionPane.showInputDialog("Introduce numero de intentos:");
        vidas=Integer.parseInt(res2);
        for(i=1;i<=vidas;++i){
            res2=JOptionPane.showInputDialog("Adivina el numero entre 1 y 50");
            dato=Integer.parseInt(res2);
            if(dato<aNum){
                JOptionPane.showMessageDialog(null, "El numero es mas grande, Vidas restantes: " +(vidas-i));
            }else{
                if(dato>aNum){
                    JOptionPane.showMessageDialog(null, "El numero es mas pequeño, Vidas restantes: " +(vidas-i));
                }else{
                    JOptionPane.showMessageDialog(null, "Acertaste! el numero era " + aNum);
                    break;
                }
            }
        }
        if(i>vidas){
            JOptionPane.showMessageDialog(null, "Has perdido, el numero era " +aNum);
        }
    }
    
}
