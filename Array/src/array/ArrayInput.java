/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Fahim
 */
public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []n = new int[5];
        for(int i=0; i<5; i++){
            n[i] = input.nextInt();
        }
        for(int j=0; j<5; j++){
            System.out.println("n["+j+"] = "+n[j]);
        }
    }
}
