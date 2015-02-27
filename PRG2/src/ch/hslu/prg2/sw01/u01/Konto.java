/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.sw01.u01;

/**
 *
 * @author tobias mit änderung GIT test 2
 */
public class Konto {

    private static int count = 0;
    private final int no;
    private double saldo;
    private double rate;

    public Konto() {
        count = +1;
        no = count;
        saldo = 0.0;
        rate = 0.0;

    }

    public Konto(double startSaldo, double actualRate) {

        count = +1;
        no = count;
        saldo = startSaldo;
        rate = actualRate;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;

    }

    public void payIn(double amount) {
        if (amount > 0.0) {
            saldo = +amount;
        }

    }

    public void payOut(double amount) {
        if (saldo - amount >= 0.0) {
            saldo = -amount;
        }
    }

    public void print() {

        System.out.println("Kontonummer: " + no);
        System.out.println("Saldo = " + saldo);
        System.out.println("Rate = " + rate);

    }
}
