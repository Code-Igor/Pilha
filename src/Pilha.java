public class Pilha {
    // criando a estrutura de dados pilha (FIFO), baseada em vetor

    private Integer[] vetor;
    private int tamanho;
    private int topo;

    public Pilha (int tamanho) {
        this.vetor = new Integer[tamanho];
        this.tamanho = tamanho;
        this.topo = -1;
    }

    /// Funcionalidades necessarias:
    ///
    /// inserir ao topo (empilhar)
    /// remover do topo (desempilhar)
    /// verificar se a pilha está vazia


    public void empilhar(int valor) {
        if (topo >= tamanho) {
            throw new ArithmeticException("overflow da pilha!");
        }
        else {

            // insiro no vetor
            vetor[topo] = valor;
            // +1 numero de elementos
            topo++;
        }
    }

    public Integer desempilhar() {
        if (topo == -1) {
            throw new IllegalStateException("pilha vazia, não é possível remover elemento");
        }
        else {
            Integer valorRemovido = vetor[topo];
            vetor[topo] = null;
            topo--;

            return valorRemovido;
        }
    }

    public boolean verificarVazio() {
        return false;
    }
}
