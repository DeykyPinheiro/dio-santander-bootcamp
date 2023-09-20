package org.dio.collections.list.exemplo.pesquisa;


import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> livroList = new ArrayList<>();

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, Integer ano) {
        Livro livro = new Livro(titulo, autor, ano);
        this.livroList.add(livro);
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAuthor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : this.livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAuthor.add(livro);
                }
            }
        }
        return livrosPorAuthor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(Integer anoInicial, Integer anoFinal) {
        List<Livro> pesquisaPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro livro : this.livroList) {
                Integer ano = livro.getAnoPublicacao();
                if (ano >= anoInicial && ano <= anoFinal) {
                    pesquisaPorIntervaloAnos.add(livro);
                }
            }
        }
        return pesquisaPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        for (Livro livro : this.livroList) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("l1", "a1", 1);
        catalogoLivros.adicionarLivro("l2", "a2", 2);
        catalogoLivros.adicionarLivro("l3", "a3", 3);
        catalogoLivros.adicionarLivro("l4", "a2", 2);


        System.out.println(catalogoLivros.pesquisaPorAutor("a2"));

        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(1, 2));






    }
}
