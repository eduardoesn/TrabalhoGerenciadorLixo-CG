public class FilaPrioridade <Tipo> {
    public NoFila<Tipo> head, tail;
    public int tamanho;

    public FilaPrioridade() {
        this.head = null;
        this.tail = null;
        this.tamanho = 0;
    }

    public boolean enqueue(Tipo valor) {
        NoFila<Tipo> novo = new NoFila<>(valor);
        if (tamanho == 0) {
            this.head = novo;
            this.tail = novo;
        } else {
            novo.prox = this.head;
            this.head = novo;
        }
        tamanho++;
        return true;
    }
    public boolean enqueuePrioridade(Tipo valor,int prioridade) {
        NoFila<Tipo> novo = new NoFila<>(valor,prioridade);
        if (tamanho == 0) {
            this.head = novo;
            this.tail = novo;
        } else {
            NoFila<Tipo> atual = this.head;
            while(atual.prox != null && novo.prioridade > atual.prox.prioridade){
                atual = atual.prox;
            }
            if (atual == this.head && novo.prioridade <= atual.prioridade) {
                novo.prox = this.head;
                this.head = novo;
            }else if(atual == this.tail){
                atual.prox = novo;
                this.tail = novo;
            }else{
                novo.prox = atual.prox;
                atual.prox = novo;
            }
        }
        tamanho++;
        return true;
    }

    public NoFila<Tipo> dequeue() {
        if (tamanho == 0) {
            System.out.println("Não há elementos na fila");
            return null;
        }
        NoFila<Tipo> elemento;

        if (this.head == this.tail) {
            elemento = this.head;
            this.head = null;
            this.tail = null;
        } else {
            NoFila<Tipo> atual = this.head;
            while(atual.prox != this.tail){
                atual = atual.prox;
            }

            elemento = atual.prox;
            this.tail = atual;
            atual.prox = null;
        }

        tamanho--;
        if(this.tail == null){
            this.head = null;
        }
        return elemento;
    }

}
