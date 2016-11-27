/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzzprojecte;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author cristian
 */
class ProvaEx1 {
    //sout.
    private PrintWriter f = null;

    void metode1() {
        metode2();
    }
    //Aqui peta nose  REVISAR A CASA
    void metode2() {
        metode3();
    }

    void metode3() {
        metode4();
    }

    void metode4() {
        try {
            f = new PrintWriter("c:/exit.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Fitxer no trobat. " + e.getMessage());
        }
    }

}
