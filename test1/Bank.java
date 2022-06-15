package test1;

import java.util.Scanner;

public class Bank {
    static double balance;
    static double rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public static void main (String args[]){
        double calculateInterest;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien vay ngan hang: ");
        balance = scanner.nextDouble();
        System.out.println("Nhap lai xuat hang nam(%) : ");
        rate = scanner.nextDouble();
        calculateInterest = balance * (rate/1200);
        System.out.println("So tien lai hang thang: "+ calculateInterest);
    }
}