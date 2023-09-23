package org.dio.desafiodominiobancario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class SistemaAcionistas {
    public List<String> obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicial = df.parse(dataInicialStr);
        Date dataFinal = df.parse(dataFinalStr);

        // Simula uma base da dados em uma lista de análises:
        List<Analise> analises = new ArrayList<>();
        analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
        analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
        analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));
        analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
        analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));
        analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));

        //TODO: Implemente o filtro das análises dentro do período especificado. Dica: Crie uma lista para armazenar as análises filtradas e use um loop for para filtrar as análises.
        // TODO: Retorne a lista de análises filtradas.

        List<String> listafiltro = new ArrayList<>();
        for (Analise analise : analises) {
            if ((dataInicial.equals(analise.data) || dataInicial.before(analise.data))
                    && (dataFinal.equals(analise.data) || dataFinal.after(analise.data))) {
                listafiltro.add(analise.descricao);
            }
        }


        return listafiltro;
    }

    class Analise {
        Date data;
        String descricao;

        public Analise(Date data, String descricao) {
            this.data = data;
            this.descricao = descricao;
        }
    }


    public static void main(String[] args) throws ParseException {
        // Lê os dados de Entrada conforme descrito neste Desafio.
        Scanner scanner = new Scanner(System.in);
        String dataInicial = "01/04/2023";
        String dataFinal = "20/05/2023";

        SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
        List<String> analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

        for (String analise : analises) {
            System.out.println(analise);
        }
    }
}
