/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.NumberFormat;

/**
 *
 * @author ar826955
 */
public class Matrice {
    private int numLines;
    private int numCols;
    
    private double[][] tab = new double[numLines][numCols];
    
    /**
     * Constructeur par initialisation
     * @param lines -> nombre de lignes de la matrice
     * @param cols -> nombre de colonnes de la matrice
     */
    public Matrice(int lines, int cols){
        this.numLines = lines;
        this.numCols = cols;
    }
    
    /**
     * getter de numLines
     * @return le nb de lignes de la matrice
     */
    public int getNumLines() {
        return numLines;
    }
    
    /**
     * getter de numcols
     * @return le nb de colonnes de la matrice
     */
    public int getNumCols() {
        return numCols;
    }
    
    /**
     * setter de tab
     * @param tab le tableau correspondant à la matrice
     */
    public void setTab(double[][] tab){
        this.tab = tab;
    }
    
    public double[][] getTab(){
        return this.tab;
    }
    
    /**
     * Permet de multiplier une matrice avec une autre
     * @param m la matrice à multiplier avec la matrice courante
     * @return le produit des deux matrices
     */
    public double[][] multiply(Matrice m){
        double[][] res = new double[this.numLines][m.numCols];
        for (int i = 0 ; i<this.numLines ; i++){
            for (int j = 0 ; j<m.numCols ; j++){
                res[i][j] = 0;
            }
        }
        
        for (int i = 0 ; i<this.numLines ; i++){
            for (int j = 0 ; j<m.numCols ; j++){
                for (int k=0 ; k<this.numCols ; k++){
                    res[i][j] += (this.tab[i][k])*(m.tab[k][j]);
                }
            }
        }
        
        return res;
        
    }
    
    /**
     * Permet d'afficher une matrice dans la console
     */
    public void printMatrix(){
        for (int i=0 ; i<numLines ; i++){
            for (int j =0 ; j<numCols ; j++){
                System.out.print(tab[i][j]);
            }
            
            System.out.println();
        }
    }
    
}
