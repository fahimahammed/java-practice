/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstruct;

/**
 *
 * @author Fahim
 */
public class Abstruct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal d = new Dog();
        Animal c = new Cat();
        c.makeNoise();
        d.makeNoise();
    }
    
}
