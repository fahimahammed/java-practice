/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author Fahim
 */
public class Sum {
    public static void main(String[] args) {
        int result = AddTwoNum(1, 2);
        System.out.println("Result: "+result);
    }
    
    public static int AddTwoNum(int a, int b){
        int sum = a + b;
        return sum;
    }
}
