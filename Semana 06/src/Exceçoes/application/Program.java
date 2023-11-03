package application;

import entities.Account;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inform os dados da conta:");

        System.out.println("Número: ");
        int number = sc.nextInt();

        System.out.println("Titular: ");
        sc.nextLine();  // consumir o ENTER antes e depois ler o holder
        String holder = sc.nextLine();

        System.out.println("Saldo inicial: ");
        Double balance = sc.nextDouble();

        System.out.println("Limite de saque: ");
        Double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();

        System.out.println("Informe uma quantia para sacar: ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }

        System.out.printf("Número: %d | Titular: %s | Saldo:  %.2f%n", acc.getNumber(), acc.getHolder(), acc.getBalance());

        sc.close();
    }
}
