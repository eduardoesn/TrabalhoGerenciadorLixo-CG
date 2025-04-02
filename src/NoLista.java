public class NoLista<Tipo> {
    public Tipo valor;
    public NoLista<Tipo> prox;
    public NoLista<Tipo> ant;
    public NoLista(Tipo valor){
        this.valor = valor;
        this.prox = null;
        this.ant = null;
    }
}
