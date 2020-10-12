package classes;

import java.text.NumberFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guifa
 */
public class Truites {
    
    private double x = 0; // Correspond au quota de pêche annuel (ici 8% mais on trouve des résultats étranges)
    
    public Truites(){}
    
    /**
     * Méthode qui nous donne la population à l'année stop mais cette fois par récurrence
     * @param stop --> jusqu'à quelle année on veut aller
     * @return un vecteur avec la pop d'adultes, de jeunes et alevins à l'année stop
     */
    public Matrice getPopulationNumberReq(int stop){
        Matrice M = new Matrice(3,3);
        double[][] tabM = new double[3][3];
        tabM[0][0] = 10/100.0 - x;
        tabM[0][1] = 30/100.0 - x;
        tabM[0][2] = 0;
        tabM[1][0] = 0;
        tabM[1][1] = 0;
        tabM[1][2] = 0.3/100.0;
        tabM[2][0] = 1500;
        tabM[2][1] = 0;
        tabM[2][2] = 0;
        
        M.setTab(tabM);
        
        
        Matrice Xn = new Matrice(3,1);
        double[][] tabXn = new double[3][1];
        tabXn[0][0] = 200;
        tabXn[1][0] = 0;
        tabXn[2][0] = 0;
        
        Xn.setTab(tabXn);
        
        Matrice XnPlusUn = new Matrice(3,1);
        double[][] tabXnPlusUn = new double[3][1];
        tabXnPlusUn = tabXn;
        XnPlusUn.setTab(tabXnPlusUn);
        
        for (int i = 1 ; i <= stop ; i++){
            XnPlusUn.setTab(M.multiply(Xn));
            Xn.setTab(XnPlusUn.getTab());
        }
        
        return XnPlusUn;
    }
    
    /**
     * Affichage en console de la population de truites
     * @return un string contenant toutes les informations
     */
    @Override
    public String toString(){
        String res = "Quota de pêche de " + x*100 + "%\n";
        NumberFormat nf = NumberFormat.getInstance();
        for (int i = 0; i<=30; i++){
           Matrice pop = this.getPopulationNumberReq(i);
           res += "Population à l'année "+ i + " :\n" + "Adultes : " + nf.format(Math.round(pop.getTab()[0][0])) + "\n" + "Jeunes : " + nf.format(Math.round(pop.getTab()[1][0])) + "\n" + "Alevins : " + nf.format(Math.round(pop.getTab()[2][0])) + "\n";
       }
        
        return res;
    }
}
    
    
