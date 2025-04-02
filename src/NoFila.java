public class NoFila<Tipo> {
    Tipo valor;
    int prioridade;
    NoFila<Tipo> prox;
    NoFila<Tipo> ant;
    public NoFila(Tipo valor){
        this.valor = valor;
        this.prioridade = 0;
        this.prox = null;
        this.ant = null;
    }
    public NoFila(Tipo valor,int prioridade){
        this.valor = valor;
        this.prioridade = prioridade;
        this.prox = null;
        this.ant = null;
    }
}
