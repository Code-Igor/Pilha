public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);

        // esperado: estar vazia
        pilha.pilhaVazia();

        pilha.empilhar(10); pilha.empilhar(20); pilha.empilhar(30);

        //esperado: não vazia
        pilha.pilhaVazia();

        // esperado: 30
        System.out.println(pilha.desempilhar());
        pilha.desempilhar(); pilha.desempilhar();

        //esperado: vazia
        pilha.pilhaVazia();
    }
}