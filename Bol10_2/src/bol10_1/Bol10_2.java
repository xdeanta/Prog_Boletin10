/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol10_1;

import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author xdeantabelisario
 */
public class Bol10_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aNum, vidas, dato,i;
        Random rand;
        rand=new Random();
        //String res=JOptionPane.showInputDialog("Introduce un numero:");
        aNum=rand.nextInt(50);
        String res2=JOptionPane.showInputDialog("Introduce numero de intentos:");
        vidas=Integer.parseInt(res2);
        for(i=1;i<=vidas;++i){
            res2=JOptionPane.showInputDialog("Adivina el numero entre 1 y 50");
            dato=Integer.parseInt(res2);
            if(dato==aNum){
                JOptionPane.showMessageDialog(null, "Acertaste!");
                break;
            }
            if(dato<aNum){
                if((aNum-dato)> 20){
                    JOptionPane.showMessageDialog(null, "El numero esta muy lejos, Vidas restantes: " +(vidas-i));
                }else{
                    if((aNum-dato) >= 10 && (aNum-dato) <= 20){
                        JOptionPane.showMessageDialog(null, "El numero esta lejos, Vidas restantes: " +(vidas-i));
                    }else{
                        if((aNum-dato) > 5 && (aNum-dato) < 10){
                            JOptionPane.showMessageDialog(null, "El numero esta cerca, Vidas restantes: " +(vidas-i));
                        }else{
                            if((aNum-dato) <= 5){
                                JOptionPane.showMessageDialog(null, "El numero esta muy cerca, Vidas restantes: " +(vidas-i));
                            }
                        }
                    }
                }
            }
            if(dato>aNum){
                if((dato-aNum)> 20){
                    JOptionPane.showMessageDialog(null, "El numero esta muy lejos, Vidas restantes: " +(vidas-i));
                }else{
                    if((dato-aNum) >= 10 && (dato-aNum) <= 20){
                        JOptionPane.showMessageDialog(null, "El numero esta lejos, Vidas restantes: " +(vidas-i));
                    }else{
                        if((dato-aNum) > 5 && (dato-aNum) < 10){
                            JOptionPane.showMessageDialog(null, "El numero esta cerca, Vidas restantes: " +(vidas-i));
                        }else{
                            if((dato-aNum) <= 5){
                                JOptionPane.showMessageDialog(null, "El numero esta muy cerca, Vidas restantes: " +(vidas-i));
                            }
                        }
                    }
                }
            }
        }
        if(i>vidas){
            JOptionPane.showMessageDialog(null, "Has perdido, el numero era " +aNum);
        }
    }
    
}
