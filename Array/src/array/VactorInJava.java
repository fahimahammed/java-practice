/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Vector;

/**
 *
 * @author Fahim
 */
public class VactorInJava {
    public static void main(String[] args) {
        Vector V = new Vector();
        V.addElement("Fahim");
        V.addElement("Firoz");
        V.addElement("Shanto");
        
        for(int i=0; i<3; i++){
            System.out.println(V.elementAt(i));
        }
        System.out.println(V);
    }
   
}
