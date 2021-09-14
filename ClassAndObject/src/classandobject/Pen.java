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
public class Pen {
    public static void main(String[] args) {
        addName n = new addName();
        calc c = new calc();
        
        System.out.println("Name: "+n.names("Fahim", "Ahammed"));
        System.out.println("Taka: "+c.add(50, 23));
    }
}

class addName{
    public static String names(String firstName, String lastName){
        return firstName + " " + lastName;
    }
}

class calc{
    public static int add(int num1, int num2){
        return num1+ num2;
    }
}