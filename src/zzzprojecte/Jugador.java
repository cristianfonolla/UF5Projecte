/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zzzprojecte;

import java.io.Serializable;

/**
 *
 * @author cristian
 */
public class Jugador implements Serializable {

    private int posicio;
    private String equip;
    private String funcio;
    private int numero;

    public Jugador(int posicio, String equip, String funcio, int numero) {
        this.posicio = posicio;
        this.equip = equip;
        this.funcio = funcio;
        this.numero = numero;
    }

    public int getPosicio() {
        return posicio;
    }

    public void setPosicio(int posicio) {
        this.posicio = posicio;
    }

    public String getEquip() {
        return equip;
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }

    public String getFuncio() {
        return funcio;
    }

    public void setFuncio(String funcio) {
        this.funcio = funcio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
