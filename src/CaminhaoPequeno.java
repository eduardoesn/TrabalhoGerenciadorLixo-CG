
public class CaminhaoPequeno {
    private String id ;
    private int capacidade;
    private double cargaAtual;
    private int viagensRealizadas;
    private String status;
    private int tempoMinPico;
    private int tempoMaxPico;
    private int tempoMinForaPico;
    private int tempoMaxForaPico;


    public CaminhaoPequeno(int capacidade){
        this.id = id;
        this.capacidade = capacidade;
        this.cargaAtual = 0;
        this.viagensRealizadas = 0;
        this.status = "disponível";
        this.tempoMinPico = tempoMinPico;
        this.tempoMaxPico = tempoMaxPico;
        this.tempoMinForaPico = tempoMinForaPico;
        this.tempoMaxForaPico = tempoMaxForaPico;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(double cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public int getViagensRealizadas() {
        return viagensRealizadas;
    }

    public void setViagensRealizadas(int viagensRealizadas) {
        this.viagensRealizadas = viagensRealizadas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean carregarLixo(int quantidade) {
        if (cargaAtual + quantidade <= capacidade) {
            cargaAtual += quantidade;
            return true;
        } else {
            return false;
        }
    }

    public int calcularTempoViagem(boolean horarioPico) {
        if (horarioPico) {
            return (int) (Math.random() * (tempoMaxPico - tempoMinPico + 1) + tempoMinPico);
        } else {
            return (int) (Math.random() * (tempoMaxForaPico - tempoMinForaPico + 1) + tempoMinForaPico);
        }
    }
}
