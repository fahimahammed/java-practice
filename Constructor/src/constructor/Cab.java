/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Fahim
 */
public class Cab {
    public static void main(String[] args) {
        add s = new add();
        System.out.println(s.sum());
        add st = new add("Hello");
    }
}

class add{
    int x, y;
    add(){
        x = 4;
        y = 5;
    }
    add(String m){
        System.out.println(m);
    }
    public int sum(){
        return x + y;
    }
}
