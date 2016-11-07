/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzzprojecte;

/**
 *
 * @author cristian
 */
public class UniCapsa<T> {

    private T t;
    private static int cont = 0;

    public boolean afegir(T t) {

        if (cont == 0) {
            this.t = t;
            cont = 1;
            return true;
        }
        return false;
    }

    public boolean esPlena() {

        if (cont == 1) {
            return true;
        }
        return false;
    }

    public T obtenir() {

        if (cont == 1) {
            return t;
        }
        return null;
    }

    public boolean buidar() {

        if (cont == 1) {
            cont = 0;
            return true;
        }
        return false;

    }
}
