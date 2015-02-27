/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.sw01.u01;

/**
 *
 * @author Lorenz (i)GITTT
 */
public class Spar extends Konto {

    private double maxOut;
    private double startRate = 0.015;
    private double startSaldo = 0.0;

    public Spar(startSaldo, startRate){
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
        System.out.println("Ihr Limit beträgt" + maxOut);
    }

    public static void main(String args[]) {
        Spar sparkonto = new Spar();
    }

}
