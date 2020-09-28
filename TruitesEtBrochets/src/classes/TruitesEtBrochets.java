/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author guifa
 */
public class TruitesEtBrochets {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       
       Crevettes c = new Crevettes();
       NumberFormat nf = NumberFormat.getInstance();
       for (int i = 0; i<30; i++){
           Matrice pop = c.getPopulationNumberReq(i);
           System.out.println("Population à l'année "+ i + " :\n" + "Larves : " + nf.format(Math.round(pop.getTab()[0][0])) + "\n" + "Adultes : " + nf.format(Math.round(pop.getTab()[1][0])));
       }
       
       
        
    }
    
}
