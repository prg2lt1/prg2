/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.sw01.u01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author frowin
 */
public class Bank {

    private String name;
    private ArrayList<Konto> accountList;

    private Bank(String Bankname) {
        this.name = Bankname;
        this.accountList = new ArrayList<>();
    }

    /**
     *
     * @param kontoname
     */
    public void openKonto(Konto kontoname) {
        this.accountList.add(kontoname);
    }

    public void openSpar(Konto sparkontoname) {
        this.accountList.add(sparkontoname);
    }

    public int noOfAccounts() {
        return this.accountList.size();
    }

    public void printAccounts() {
        System.out.print("Accounts: ");
        Iterator<Konto> itr = this.accountList.iterator();
        while (itr.hasNext()) {
            Konto kontoname = itr.next();
            System.out.println(kontoname);
        }
    }

    public void printFund() {
        System.out.print("Fund: ");
        Iterator<Konto> itr = this.accountList.iterator();
        double saldo = 0;
        while (itr.hasNext()) {
            Konto kontoname = itr.next();
            saldo += kontoname.getSaldo();
        }
        System.out.println("Saldo: " + saldo);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Bank b1 = new Bank("Raiffeisen");

        Konto k1 = new Konto();
        Konto k2 = new Konto(1000, 1.5);

        Spar s1 = new Spar();
        Spar s2 = new Spar();

        b1.openKonto(k1);
        b1.openKonto(k2);
        b1.openSpar(s1);
        b1.openSpar(s2);

        b1.printAccounts();
        b1.printFund();
        
        System.out.println("No. of Accounts: " + b1.noOfAccounts());

    }

}
