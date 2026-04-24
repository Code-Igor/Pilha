public class Pilha {
    // criando a estrutura de dados pilha, baseada em vetor

    private Integer[] vetor;
    private int numElementos;
    private int topo;

    public Pilha (int tamanho) {
        this.vetor = new Integer[tamanho];
        this.numElementos = 0;
        this.topo = vetor[numElementos];
    }

    /// Funcionalidades necessarias:
    ///
    /// inserir ao topo (empilhar)
    /// remover do topo (desempilhar)
    /// verificar se a pilha está vazia


    public void empilhar(int valor) {}

    public void desempilhar(int valor) {}

    public boolean verificarVazio() {
        return false;
    }
}
