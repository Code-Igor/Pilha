public class Pilha {
    // criando a estrutura de dados pilha (FIFO), baseada em vetor

    private Integer[] vetor;
    private int tamanho;
    private int numElementos;
    private int topo;

    public Pilha (int tamanho) {
        this.vetor = new Integer[tamanho];
        this.tamanho = tamanho;
        this.numElementos = 0;
        this.topo = vetor[numElementos];
    }

    /// Funcionalidades necessarias:
    ///
    /// inserir ao topo (empilhar)
    /// remover do topo (desempilhar)
    /// verificar se a pilha está vazia


    public void empilhar(int valor) {
        if (numElementos >= tamanho) {
            throw new ArithmeticException("overflow da pilha!");
        }
        else {

            // insiro no vetor
            vetor[numElementos] = valor;
            // +1 numero de elementos
            numElementos++;
            // o novo valor é o novo topo
            topo = valor;
        }
    }

    public void desempilhar(int valor) {}

    public boolean verificarVazio() {
        return false;
    }
}
