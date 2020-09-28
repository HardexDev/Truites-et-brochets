package classes;

import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guifa
 */
public class Crevettes {
    private int adultes;
    private int larves;
    private int annee;
    
    public Crevettes(int larves, int adultes)
    {
        this.adultes = adultes;
        this.larves = larves;
        this.annee = 0;
    }
    
    public Crevettes(){
        
    }
    
    public void anneeSuivante(){
        //Création de nouvelle variable pour stocker les nouvelles valeurs
        float larve = larves;
        float adulte = adultes;
        
        //Changement des valeurs à l'année n+1
        larve = adultes * 40000;
        adulte = adultes * 0.1f + larves * 0.0001f;
        
        //Renvoie des valeurs changé
        this.larves = (int)larve;
        this.adultes = (int)adulte;  
        
        annee += 1;
        
    }
    
    public void ToString()
    {
        System.out.println("Annee : "+annee);
        System.out.println("Nombre de larves : "+larves);
        System.out.println("Nombre d'adultes : "+adultes);
        
    }
    
    /**
     * Méthode qui nous donne la population à l'année n
     * @param year l'année souhaitée
     * @return un vecteur avec le nb de crevettes et de larves
     */
    public Matrice getPopulationNumber(int year){
        // result
        Matrice res = new Matrice(2,1);
        double[][] tabRes = new double[2][1];
        res.setTab(tabRes);
        
        // P --> matrice de changement de base
        Matrice P = new Matrice(2,2);
        double[][] tabP = new double[2][2];
        tabP[0][0] = 1;
        tabP[0][1] = 1;
        tabP[1][0] = (0.1-Math.sqrt(16.01))/80000;
        tabP[1][1] = (0.1+Math.sqrt(16.01))/80000;
        P.setTab(tabP);
        
        // D --> matrice diagonale
        Matrice D = new Matrice(2,2);
        double[][] tabD = new double[2][2];
        double valPropre1 = ((0.1-Math.sqrt(16.01))/2);
        double valPropre2 = ((0.1+Math.sqrt(16.01))/2);
        tabD[0][0] = Math.pow(valPropre1, year);
        tabD[0][1] = 0;
        tabD[1][0] = 0;
        tabD[1][1] = Math.pow(valPropre2, year);
        
        D.setTab(tabD);
        
        // P-1 --> Inverse de la matrice de changement de base
        Matrice PInverse = new Matrice(2,2);
        double[][] tabPInverse = new double[2][2];
        double a = (Math.sqrt(1601) + 1601)/3202;
        double b = -((400000*Math.sqrt(1601))/1601);
        double c = (Math.sqrt(1601) + 1601)/3202;
        double d = (400000*Math.sqrt(1601))/1601;
        tabPInverse[0][0] = a;
        tabPInverse[0][1] = b;
        tabPInverse[1][0] = c;
        tabPInverse[1][1] = d;
        
        PInverse.setTab(tabPInverse);
        
        // P0 --> Population à l'année 0
        Matrice P0 = new Matrice(2,1);
        double[][] tabP0 = new double[2][1];
        tabP0[0][0] = 0;
        tabP0[1][0] = 1000;
        
        P0.setTab(tabP0);

        
        // Première multiplication (P*D)
        Matrice temp = new Matrice(2,2);
        temp.setTab(P.multiply(D));
        
        // Deuxième multiplication ((P*D)*P-1) = M^n
        Matrice M = new Matrice(2,2);
        M.setTab(temp.multiply(PInverse));
        
        // Multiplication finale (M^n * P0)
        res.setTab(M.multiply(P0));
        
        return res; 
    }
    
    
    /**
     * Méthode qui nous donne la population à l'année stop mais cette fois par récurrence
     * @param stop --> jusqu'à quelle année on veut aller
     * @return un vecteur avec la pop de larve et de crevettes à l'année stop
     */
    public Matrice getPopulationNumberReq(int stop){
        Matrice M = new Matrice(2,2);
        double[][] tabM = new double[2][2];
        tabM[0][0] = 0;
        tabM[0][1] = 40000;
        tabM[1][0] = 0.0001;
        tabM[1][1] = 0.1;
        
        M.setTab(tabM);
        
        
        Matrice Xn = new Matrice(2,1);
        double[][] tabXn = new double[2][1];
        tabXn[0][0] = 0;
        tabXn[1][0] = 1000;
        
        Xn.setTab(tabXn);
        
        Matrice XnPlusUn = new Matrice(2,1);
        double[][] tabXnPlusUn = new double[2][1];
        tabXnPlusUn = tabXn;
        XnPlusUn.setTab(tabXnPlusUn);
        
        for (int i = 1 ; i <= stop ; i++){
            XnPlusUn.setTab(M.multiply(Xn));
            Xn.setTab(XnPlusUn.getTab());
        }
        
        return XnPlusUn;
        
        
    }
    
}