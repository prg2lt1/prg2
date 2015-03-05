/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.sw01.u01;

/**
 * tha frickn GIROO Konto ist eine Unterklasse von Konto.
 * @author Lorenz
 */
public class Giro extends Konto {

    private double creditLimit; //als negative Zahl. z.B -200.00 Fr
    private double creditRate;

    /**
     *
     * @param startSaldo
     * @param creditLimit
     */
    public Giro(double startSaldo, double creditLimit) {
        super(startSaldo, 0.0);
        this.creditLimit = -200.00;
        this.creditRate = 1.01;
    }

    /**
     *
     * @param amount
     */
    @Override
    public void payOut(double amount) {
        if (super.getSaldo() - amount >= creditLimit) {
            super.setSaldo(amount);
        } else {
            System.out.println("Nope");
        }
    }

    /**
     *
     */
    @Override
    public void print() {
        super.print();
        System.out.println("Kreditlimit: " + creditLimit);
        System.out.println("Kreditrate: " + creditRate);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Giro giro1 = new Giro(2000.34, -400);
        giro1.print();
        giro1.payOut(1500);
        giro1.print();
        giro1.getSaldo();
        giro1.print();
        giro1.payOut(600.80);
        giro1.print();
        giro1.getSaldo();
        giro1.print();
        giro1.payOut(1000);
        giro1.print();
    }
}
