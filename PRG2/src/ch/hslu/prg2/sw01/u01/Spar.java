/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.sw01.u01;

/**
 *
 * @author Lorenz v15.02.27.01
 */
public class Spar extends Konto {

    private double maxOut;
    private double startRate = 0.015;
    private double startSaldo = 0.0;

    public Spar() {
        super(0, 1.05);
        this.maxOut = 20000.0;
    }

    public Spar(double startSaldo, double startRate) {
        super(startSaldo, startRate);
        this.maxOut = 20000.0;
    }

    @Override
    public double getSaldo() {

        return super.getSaldo();
    }

    @Override
    public void payOut(double amount) {
        super.payOut(amount);
    }

    @Override
    public void print() {

        super.print();
        System.out.println("Ihr Limit beträgt " + maxOut);
    }

    public static void main(String[] args) {
        Spar spar1 = new Spar();
        spar1.print();
        spar1.getSaldo();
        spar1.print();
        spar1.payIn(1000.50);
        spar1.print();
        spar1.payOut(2000.0);
        spar1.print();
    }

}
