/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Fahim
 */
public class SortingArray {
    public static void main(String[] args) {
        int []n  = {3, 4, 1, 2, 5};
        int i, j, temp;
        for(i=4; i>=05; i--){
            for(j=0; j<=i; j++){
                if(n[j]>n[j+1]){
                    temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
            System.out.println(n[0]);
        }
        
    }
}
