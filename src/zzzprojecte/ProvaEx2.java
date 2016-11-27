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
class ProvaEx2 {

    private PrintWriter f = null;

    void metode1() {
        metode2();
    }

    void metode2() {
        metode3();
    }

    void metode3() {
        try {
            metode4();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR NO TROBAT: " + e.getMessage());
        }
    }

    void metode4() throws FileNotFoundException {
        try {
            f = new PrintWriter("c:/exit.txt");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(e.getMessage());
        }

    }

}
