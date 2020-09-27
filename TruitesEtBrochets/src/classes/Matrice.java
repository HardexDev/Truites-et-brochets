/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author ar826955
 */
public class Matrice {
    private int numLines;
    private int numCols;
    
    private double[][] tab = new double[numLines][numCols];
    
    public Matrice(int lines, int cols){
        this.numLines = lines;
        this.numCols = cols;
    }

    public int getNumLines() {
        return numLines;
    }

    public int getNumCols() {
        return numCols;
    }
    
    public void setTab(double[][] tab){
        this.tab = tab;
    }
    
    public double[][] getTab(){
        return this.tab;
    }
    
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
    
    public void printMatrix(){
        for (int i=0 ; i<numLines ; i++){
            for (int j =0 ; j<numCols ; j++){
                System.out.print(tab[i][j]);
            }
            
            System.out.println();
        }
    }
    
}
