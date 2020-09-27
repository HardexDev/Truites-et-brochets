/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.HashSet;
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
       /*
       double[][] tab1 = new double[2][2];
       tab1[0][0] = 5;
       tab1[0][1] = 3;
       tab1[1][0] = 1;
       tab1[1][1] = 2;
       Matrice m1 = new Matrice(2,2);
       m1.setTab(tab1);
       
       double[][] tab2 = new double[2][1];
       tab2[0][0] = 1;
       tab2[1][0] = 2;
       
       Matrice m2 = new Matrice(2,1);
       m2.setTab(tab2);
       
       
       Matrice res = new Matrice(2, 1);
       res.setTab(m1.multiply(m2));
       
       res.printMatrix();
       */
       
       Crevettes c = new Crevettes();
       Matrice pop = c.getPopulationNumberReq(5);
       System.out.println("Population à l'année 5:\n" + "Larves : " + pop.getTab()[0][0] + "\n" + "Adultes : " + pop.getTab()[1][0]);
       
        
    }
    
}
