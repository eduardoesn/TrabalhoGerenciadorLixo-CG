public class CaminhaoGrande {
    private String id;
    private final int capacidade = 20;
    private double cargaAtual;
    private int viagensRealizadas;
    private String status;
    private int tempoEspera;
    private final int tempoMaximoEspera;

    public CaminhaoGrande(int tempoMaximoEspera) {
        this.id = id;
        this.cargaAtual = 0;
        this.viagensRealizadas = 0;
        this.status = "disponível";
        this.tempoEspera = 0;
        this.tempoMaximoEspera = tempoMaximoEspera;
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

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public int getTempoMaximoEspera() {
        return tempoMaximoEspera;
    }

    public boolean adicionarCarga(double quantidade) {
        if (cargaAtual + quantidade <= capacidade) {
            cargaAtual += quantidade;
            if (cargaAtual == capacidade) {
                status = "cheio";
            }
            return true;
        }
        return false;
    }

    public boolean devePartir() {
        return cargaAtual == capacidade || tempoEspera >= tempoMaximoEspera;
    }

    public void partirParaAterro() {
        if (devePartir()) {
            viagensRealizadas++;
            cargaAtual = 0;
            status = "disponível";
            tempoEspera = 0;
        }
    }

    public boolean receberCargaDePequeno(CaminhaoPequeno pequeno) {
        double cargaTransferida = pequeno.getCargaAtual();

        if (this.cargaAtual + cargaTransferida <= this.capacidade) {
            this.cargaAtual += cargaTransferida;
            pequeno.setCargaAtual(0); // Esvazia o caminhão pequeno
            return true;
        }

        return false; // Se não houver espaço suficiente
    }

}
