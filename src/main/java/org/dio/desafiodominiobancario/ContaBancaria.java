package org.dio.desafiodominiobancario;

import java.util.Scanner;

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);

        System.out.println("Informacoes:");
        System.out.println("Conta: " + contaBancaria.numero);
        System.out.println("Titular: " + contaBancaria.titular);
        System.out.println("Saldo: R$ " + contaBancaria.saldo);

    }
}