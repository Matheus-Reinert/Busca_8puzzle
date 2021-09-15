package application;

import busca.Profundidade;
import estrutura.Busca;
import logicas.No;

import java.util.List;
import java.util.Scanner;

public class Principal {


    private Busca busca;
    private No no;
    private List<No> solucao;
    private int estado[][];

    public void estado_inicial_quebra_cabeca(int num) {

        switch (num) {
            case 0: {
                int[][] quebra_cabeca = {{7, 1, 3}, {2, 6, 0}, {5, 4, 8}};
                estado = quebra_cabeca;
                break;
            }
            case 1: {
                System.out.println("Planos futuros");
            }
            default:
                break;
        }
        no.setPai(null);
        no.setEstados(estado);
    }

    public Principal() {
        no = new No();
    }


    public int escolher_estado_inicial(){

        Scanner ler = new Scanner(System.in);

        int opcao_estado_inicial;
        System.out.println("Selecione um estado inicial");
        System.out.println("Digite 1 para => {7, 1, 3}, {2, 6, 0}, {5, 4, 8}");
        opcao_estado_inicial = ler.nextInt();

        return opcao_estado_inicial;

    }

    public void menu(){

        Scanner ler = new Scanner(System.in);
        int n;
        int proximo;
        int estado_inicial;

        System.out.println("Digite 1 para busca em profundidade");
        n = ler.nextInt();

        if (n == 1){

            estado_inicial = escolher_estado_inicial();

            if(estado_inicial == 1){

                estado_inicial_quebra_cabeca(0);
                busca = new Profundidade();
                busca.solucionar(no);
                System.out.println("Quantidade de nos expandidos: " + busca.getContador());
                System.out.println("Movimentos: " + busca.getMovimentos());
                solucao = busca.getSolucao();
                busca.setContador(0);

            }
        }
    }

}
