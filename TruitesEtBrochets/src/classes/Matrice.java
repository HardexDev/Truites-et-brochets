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
    
    private int[][] tab = new int[numLines][numCols];
    
    public Matrice(int lines, int cols){
        this.numLines = lines;
        this.numCols = cols;
    }
    
    public void setTab(int[][] tab){
        this.tab = tab;
    }
    
    public int[][] getTab(){
        return this.tab;
    }
    
    public int[][] multiply(Matrice m){
        int[][] res = new int[2][2];
        for (int i = 0 ; i<2 ; i++){
            for (int j = 0 ; j<2 ; j++){
                res[i][j] = 0;
            }
        }
        
        for (int i = 0 ; i<2 ; i++){
            for (int j = 0 ; j<2 ; j++){
                for (int k=0 ; k<2 ; k++){
                    res[i][j] += (this.tab[i][k])*(m.tab[k][j]);
                }
            }
        }
        
        return res;
        
    }
    
    public void printMatrix(){
        for (int i=0 ; i<2 ; i++){
            for (int j =0 ; j<2 ; j++){
                System.out.print(tab[i][j]);
            }
            
            System.out.println();
        }
    }
    
}
