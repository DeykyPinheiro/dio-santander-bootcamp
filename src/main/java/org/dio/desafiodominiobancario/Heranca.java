package org.dio.desafiodominiobancario;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Heranca {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        String titular = scanner.next();
        int numeroConta = scanner.nextInt();
        double saldo = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();

        ContaPoupancaHeranca contaPoupanca = new ContaPoupancaHeranca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
    }
}

class ContaBancariaHeranca {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancariaHeranca(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}

class ContaPoupancaHeranca extends ContaBancariaHeranca {

    private double taxaJuros;

    public ContaPoupancaHeranca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        super.exibirInformacoes();
        System.out.println("Taxa de juros: " + decimalFormat.format(taxaJuros)+ "%");
    }
}