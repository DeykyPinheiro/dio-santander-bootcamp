package org.dio.collections.list.ordenacao;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {



    List<Pessoa> listPessoa = new ArrayList<>();


    public void adicionarPessoa(String nome, Integer idade, Double altura) {
        this.listPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> ordenarPorIdade = new ArrayList<>(listPessoa);
        Collections.sort(ordenarPorIdade);
        return ordenarPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> ordenarPorAltura = new ArrayList<>(listPessoa);
        Collections.sort(ordenarPorAltura, new ComparatorPorAltura());
        return ordenarPorAltura;
    }


    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("p1", 4, 1.1);
        ordenacaoPessoa.adicionarPessoa("p2", 3, 1.2);
        ordenacaoPessoa.adicionarPessoa("p3", 2, 1.3);
        ordenacaoPessoa.adicionarPessoa("p4", 1, 1.4);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
