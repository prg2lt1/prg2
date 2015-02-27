/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.sw01.u01;

import ch.hslu.prg2.sw01.u01.Konto;

/**
 *
 * @author Lorenz
 */
public class Spar extends Konto {

    private double maxOut;

    public Spar() {
        super();
        super.setRate(1.05);
        this.maxOut = 20000.0;
    }

    public double getSaldo() {

        return super.getSaldo();
    }

    public void payOut(double amount) {
        super.payOut(amount);
    }

    public void print() {

        super.print();
        System.out.println("Ihr Limit beträgt" + maxOut);
    }

}
