/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fahim
 */
public class Exp {
    public static void booleanGussingGame(){
        Random generator = new Random();
        Scanner keyboard = new Scanner(System.in);
        int answer = generator.nextInt(100)+1;
        int guess = 0;
        while(answer != guess){
            guess = keyboard.nextInt();
            if(guess < answer){
                System.out.println("Lower...");
            }
            else if(guess == answer){
                System.out.println("You Win");
            }
            else{
                System.out.println("Higher...");
            }
        }
    }
    public static void main(String[] args) {
        booleanGussingGame();
    }
}
