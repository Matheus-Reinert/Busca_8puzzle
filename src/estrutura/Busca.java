package estrutura;

import logicas.No;

import java.util.List;
import java.util.Stack;

public abstract class Busca {

    protected int objetivo[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
    protected Stack<No> pilha;
    protected List solucao;
    protected int movimentos;
    protected int contador;

    public abstract void solucionar(No no);

    public List getSolucao(){
        return solucao;
    }

    public int getMovimentos() {
        return movimentos;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
