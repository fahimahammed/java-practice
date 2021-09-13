/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variableanddatatype;

/**
 *
 * @author Fahim
 */
public class Demot {
    public static void main(String[] args) {
        char c1 = 'A';
        double d1 = c1;
        System.out.println("char to double: "+d1);
        
        double d2 = 66.0;
        char c2 = (char)d2;
        System.out.println("double to char: "+c2);
    }
}
