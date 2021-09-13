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
public class ArrayInit {
    public static void main(String[] args) {
        int [] n = new int[5];
        n[0] = 1;
        n[1] = 2;
        n[2] = 3;
        n[3] = 4;
        n[4] = 5;
        
        for(int i=0; i<5; i++){
            System.out.println("n["+i+"] = "+n[i]);
        }
    }
    
}
