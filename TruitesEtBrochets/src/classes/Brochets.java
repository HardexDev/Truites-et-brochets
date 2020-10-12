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
public class Brochets {
    private double x = 0.0005; // Correspond au quota de pêche approximatif pour les brochets
    
    public Brochets() {}
    
    /**
     * Méthode qui nous donne la population à l'année stop mais cette fois par récurrence
     * @param stop --> jusqu'à quelle année on veut aller
     * @return Un vecteur avec la population de brochets sur ses 7 années d'existance
     */
    public Matrice getPopulationNumberReq(int stop){
        Matrice M = new Matrice(8,8);
        double[][] tabM = new double[8][8];
        tabM[0][0] = 0;
        tabM[0][1] = 0.25 - x;
        tabM[0][2] = 0;
        tabM[0][3] = 0;
        tabM[0][4] = 0;
        tabM[0][5] = 0;
        tabM[0][6] = 0;
        tabM[0][7] = 0;
        tabM[1][0] = 0;
        tabM[1][1] = 0;
        tabM[1][2] = 0.45 - x;
        tabM[1][3] = 0;
        tabM[1][4] = 0;
        tabM[1][5] = 0;
        tabM[1][6] = 0;
        tabM[1][7] = 0;
        tabM[2][0] = 0;
        tabM[2][0] = 0;
        tabM[2][1] = 0;
        tabM[2][2] = 0;
        tabM[2][3] = 0.45 - x;
        tabM[2][4] = 0;
        tabM[2][5] = 0;
        tabM[2][6] = 0;
        tabM[2][7] = 0;
        tabM[3][0] = 0;
        tabM[3][1] = 0;
        tabM[3][2] = 0;
        tabM[3][3] = 0;
        tabM[3][4] = 0.45 - x;
        tabM[3][5] = 0;
        tabM[3][6] = 0;
        tabM[3][7] = 0;
        tabM[4][0] = 0;
        tabM[4][1] = 0;
        tabM[4][2] = 0;
        tabM[4][3] = 0;
        tabM[4][4] = 0;
        tabM[4][5] = 0.45 - x;
        tabM[4][6] = 0;
        tabM[4][7] = 0;
        tabM[5][0] = 0;
        tabM[5][1] = 0;
        tabM[5][2] = 0;
        tabM[5][3] = 0;
        tabM[5][4] = 0;
        tabM[5][5] = 0;
        tabM[5][6] = 0.45 - x;
        tabM[5][7] = 0;
        tabM[6][0] = 0;
        tabM[6][1] = 0;
        tabM[6][2] = 0;
        tabM[6][3] = 0;
        tabM[6][4] = 0;
        tabM[6][5] = 0;
        tabM[6][6] = 0;
        tabM[6][7] = 0.002 - x;
        tabM[7][0] = 0;
        tabM[7][1] = 0;
        tabM[7][2] = 2000;
        tabM[7][3] = 2000;
        tabM[7][4] = 2000;
        tabM[7][5] = 0;
        tabM[7][6] = 0;
        tabM[7][7] = 0;
        
        M.setTab(tabM);
        
        
        Matrice Xn = new Matrice(8,1);
        double[][] tabXn = new double[8][1];
        tabXn[0][0] = 0;
        tabXn[1][0] = 0;
        tabXn[2][0] = 0;
        tabXn[3][0] = 0;
        tabXn[4][0] = 0;
        tabXn[5][0] = 0;
        tabXn[6][0] = 100;
        tabXn[7][0] = 0;
        
        Xn.setTab(tabXn);
        
        Matrice XnPlusUn = new Matrice(8,1);
        double[][] tabXnPlusUn = new double[8][1];
        tabXnPlusUn = tabXn;
        XnPlusUn.setTab(tabXnPlusUn);
        
        for (int i = 1 ; i <= stop ; i++){
            XnPlusUn.setTab(M.multiply(Xn));
            Xn.setTab(XnPlusUn.getTab());
        }
        
        return XnPlusUn;
    }
    
    /**
     * Affichage en console de la population de brochets
     * @return un string contenant toutes les informations
     */
    @Override
    public String toString(){
        String res = "";
        NumberFormat nf = NumberFormat.getInstance();
        for (int i = 0; i<=30; i++){
           Matrice pop = this.getPopulationNumberReq(i);
           res += "Population à l'année "+ i + " :\n" + "Oeufs : " + nf.format(Math.round(pop.getTab()[7][0])) + "\n" + "Année 1 : " + nf.format(Math.round(pop.getTab()[6][0])) + "\n" + "Année 2 : " + nf.format(Math.round(pop.getTab()[5][0])) + "\n" + "Année 3 : " + nf.format(Math.round(pop.getTab()[4][0])) + "\n" + "Année 4 : " + nf.format(Math.round(pop.getTab()[3][0]))+ "\n" + "Année 5 : " + nf.format(Math.round(pop.getTab()[2][0]))+ "\n" + "Année 6 : " + nf.format(Math.round(pop.getTab()[1][0]))+ "\n" + "Année 7 : " + nf.format(Math.round(pop.getTab()[0][0])) + "\n";
       }
        
        return res;
    }
    
}
