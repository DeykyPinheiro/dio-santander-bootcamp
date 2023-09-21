package org.dio.desafiopoo;

public class Iphone implements Internet, Musicial, Telefone {
    @Override
    public void exibirPagina() {
        System.out.println("exibirPagina");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionarNovaAba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizarPagina");

    }

    @Override
    public void tocar() {
        System.out.println("tocar");
    }

    @Override
    public void pausa() {
        System.out.println("pausa");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("selecionarMusica");

    }

    @Override
    public void ligar() {
        System.out.println("ligar");

    }

    @Override
    public void atender() {
        System.out.println("atender");

    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("iniciarCorrerioVoz");

    }
}
