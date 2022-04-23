package trunfo.model;

/**
 *
 * @author Douglas Oliveira
 */
public class Pokemon {
    private String nome;
    private int forca;
    private int ataque;
    private int defesa;
    private int agilidade;
    private int quantidade;

    public Pokemon() {
    }

    public Pokemon(String nome, int forca, int ataque, int defesa, int agilidade, int quantidade) {
        this.nome = nome;
        this.forca = forca;
        this.ataque = ataque;
        this.defesa = defesa;
        this.agilidade = agilidade;
        this.quantidade += quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        
        return  quantidade + " - " + nome;
    }  
}


    
    

