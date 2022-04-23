package trunfo.model;

/**
 *
 * @author Douglas Oliveira
 */
public class Escolher {
    private int um;
    private int dois;
    private int tres;
    private int primeiro;
    private int segundo;
    private int terceiro;

    public Escolher() {
    }

    public Escolher(int um, int dois, int tres, int primeiro, int segundo, int terceiro) {
        this.um = um;
        this.dois = dois;
        this.tres = tres;
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.terceiro = terceiro;
    }

    public int getUm() {
        return um;
    }

    public void setUm(int um) {
        this.um = um;
    }

    public int getDois() {
        return dois;
    }

    public void setDois(int dois) {
        this.dois = dois;
    }

    public int getTres() {
        return tres;
    }

    public void setTres(int tres) {
        this.tres = tres;
    }

    public int getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(int primeiro) {
        this.primeiro = primeiro;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getTerceiro() {
        return terceiro;
    }

    public void setTerceiro(int terceiro) {
        this.terceiro = terceiro;
    }

    @Override
    public String toString() {
        return "Escolher{" + "um=" + um + ", dois=" + dois + ", tres=" + tres + ", primeiro=" + primeiro + ", segundo=" + segundo + ", terceiro=" + terceiro + '}';
    }   
    
}
