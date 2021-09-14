/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classandobject;

/**
 *
 * @author Fahim
 */
public class Cvalue {
    public static void main(String[] args) {
        double b = 0;
        
        Calculator c = new Calculator();
        b = c.add(4.98, 45.33);
        
        System.out.println("Result: "+b);
        
        System.out.println("Sub: "+c.sub(45.00, 23.50));
        
        AddName n = new AddName();
        
        System.out.println(n.nameAdd("Fahim", "Ahammed"));
    }
}
class Calculator {
    static int x = 7, y;
    public static double add(double p, double q){
        return p+q;
    }
    public static double sub(double p, double q){
        return p-q;
    }
}

class AddName{
    public static String nameAdd(String name1, String name2){
        return name1+ " " +name2;
    }
}