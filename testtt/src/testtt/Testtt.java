/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtt;

/**
 *
 * @author clecioferreira
 */
public class Testtt {

    /**
     * @param args the command line arguments
     */
    public enum Animals { RABBIT, PARROT, DOG };
    public static void main(String[] args) {
        Animals[] d2 = Animals.values();
        System.out.println(d2[2]);
    }
    
}
