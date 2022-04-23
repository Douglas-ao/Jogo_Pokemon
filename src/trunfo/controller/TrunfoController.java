package trunfo.controller;

import java.util.ArrayList;
import trunfo.model.Escolher;
import trunfo.model.Pokemon;

/**
 *
 * @author Douglas Oliveira
 */
public class TrunfoController {

    private static Pokemon pokemon;
    private static ArrayList<Pokemon> listaPokemon;
    private static ArrayList<Pokemon> listaPokemonDois;
    private static ArrayList<Pokemon> listaPokemonUm;

    public static void iniciaLista() {
        listaPokemon = new ArrayList<>();
        listaPokemonDois = new ArrayList<>();
        listaPokemonUm = new ArrayList<>();
    }

    public static void novoPokemon() {
        pokemon = new Pokemon();
    }

    public static void adicionarNome(String nome) {
        pokemon = new Pokemon();
        pokemon.setNome(nome);
    }

    public static void adicionarForca(String forca) {
        pokemon.setForca(Integer.parseInt(forca));
    }

    public static void adicionarAtaque(String ataque) {
        pokemon.setAtaque(Integer.parseInt(ataque));
    }

    public static void adicionarDefesa(String defesa) {
        pokemon.setDefesa(Integer.parseInt(defesa));
    }

    public static void adicionarAgilidade(String agilidade) {
        pokemon.setAgilidade(Integer.parseInt(agilidade));

        salvarPokemon();

    }

    public static void adicionarQuantidade(int quantidade) {
        pokemon.setQuantidade(quantidade);
    }

    public static String retornarPokemon() {
        String retorno = "";
        for (Pokemon pokemon : listaPokemon) {
            retorno += pokemon.toString() + "\n";
        }
        return retorno;
    }

    public static String retornarPokemonDois() {
        String retorno = "";
        for (Pokemon pokemon : listaPokemonDois) {
            retorno += pokemon.toString() + "\n";
        }
        return retorno;
    }

    public static Object escolherPrimeiro(String primeiro, String segundo, String terceiro) {
        int um = Integer.parseInt(primeiro);
        int dois = Integer.parseInt(segundo);
        int tres = Integer.parseInt(terceiro);
        Pokemon retornaUm = listaPokemon.get(um - 1);
        Pokemon retornaDois = listaPokemon.get(dois - 1);
        Pokemon retornaTres = listaPokemon.get(tres - 1);
        listaPokemonUm.add(retornaUm);
        listaPokemonUm.add(retornaDois);
        listaPokemonUm.add(retornaTres);
        return listaPokemonUm.get(0).getQuantidade() + " - " + listaPokemonUm.get(0).getNome() + " / "
                + listaPokemonUm.get(1).getQuantidade() + " - " + listaPokemonUm.get(1).getNome() + " / "
                + listaPokemonUm.get(2).getQuantidade() + " - " + listaPokemonUm.get(2).getNome();
    }

    public static Object escolherSegundo(String primeiro, String segundo, String terceiro) {
        int um = Integer.parseInt(primeiro);
        int dois = Integer.parseInt(segundo);
        int tres = Integer.parseInt(terceiro);
        Pokemon retornaUm = listaPokemon.get(um - 1);
        Pokemon retornaDois = listaPokemon.get(dois - 1);
        Pokemon retornaTres = listaPokemon.get(tres - 1);
        listaPokemonDois.add(retornaUm);
        listaPokemonDois.add(retornaDois);
        listaPokemonDois.add(retornaTres);
        return listaPokemonDois.get(0).getQuantidade() + " - " + listaPokemonDois.get(0).getNome() + " / "
                + listaPokemonDois.get(1).getQuantidade() + " - " + listaPokemonDois.get(1).getNome() + " / "
                + listaPokemonDois.get(2).getQuantidade() + " - " + listaPokemonDois.get(2).getNome();
    }

    public static Object escolherUm(String primeiro, String segundo, String terceiro) {
        int um = Integer.parseInt(primeiro);
        int dois = Integer.parseInt(segundo);
        int tres = Integer.parseInt(terceiro);
        Pokemon retornaUm = listaPokemon.get(um - 1);
        Pokemon retornaDois = listaPokemon.get(dois - 1);
        Pokemon retornaTres = listaPokemon.get(tres - 1);
        return retornaUm + "  \n" + retornaDois + "  \n" + retornaTres;
    }

    public static Object escolherDois(String primeiro, String segundo, String terceiro) {
        int um = Integer.parseInt(primeiro);
        int dois = Integer.parseInt(segundo);
        int tres = Integer.parseInt(terceiro);
        Pokemon retornaUm = listaPokemon.get(um - 1);
        Pokemon retornaDois = listaPokemon.get(dois - 1);
        Pokemon retornaTres = listaPokemon.get(tres - 1);
        return retornaUm + "  \n" + retornaDois + "  \n" + retornaTres;
    }

    public static Object pokemonUm(String primeiro) {
        int um = Integer.parseInt(primeiro);
        return null;
    }

    public static Object pokemonDois(String segundo) {
        int dois = Integer.parseInt(segundo);
        return null;
    }

    public static Object escolherForca(String escolherUm, String escolherDois) {
        int um = Integer.parseInt(escolherUm);
        int dois = Integer.parseInt(escolherDois);
        int retornaUm = listaPokemon.get(um - 1).getForca();
        String retornaNome = listaPokemon.get(um - 1).getNome();
        int retornaDois = listaPokemon.get(dois - 1).getForca();
        String retornaNomeD = listaPokemon.get(um - 1).getNome();
        if (retornaUm > retornaDois) {
            return "Jogador 1 Venceu a rodada: \n"
                    + "Golpe da rodada: Força \n\n"
                    + "Jogador 1: \n"
                    + um + "-" + retornaNome + "/Força:" + retornaUm
                    + "\n\nJogador 2: \n"
                    + dois + "-" + retornaNomeD + "/Força:" + retornaDois;
        } else {
            return "Jogador 2 Venceu a rodada: \n"
                    + "Golpe da rodada: Força \n\n"
                    + "Jogador 1: \n"
                    + um + "-" + retornaNome + "/Força:" + retornaUm
                    + "\n\nJogador 2: \n"
                    + dois + "-" + retornaNomeD + "/Força:" + retornaDois;
        }

    }

    public static Object escolherAtaque(String escolherUm, String escolherDois) {
        int um = Integer.parseInt(escolherUm);
        int dois = Integer.parseInt(escolherDois);
        int retornaUm = listaPokemon.get(um - 1).getAtaque();
        String retornaNome = listaPokemon.get(um - 1).getNome();
        int retornaDois = listaPokemon.get(dois - 1).getAtaque();
        String retornaNomeD = listaPokemon.get(um - 1).getNome();
        if (retornaUm > retornaDois) {
            return "Jogador 1 Venceu a rodada: \n"
                    + "Golpe da rodada: Ataque \n\n"
                    + "Jogador 1: \n"
                    + um + "-" + retornaNome + "/Ataque:" + retornaUm
                    + "\n\nJogador 2: \n"
                    + dois + "-" + retornaNomeD + "/Ataque:" + retornaDois;
        } else {
            return "Jogador 2 Venceu a rodada: \n"
                    + "Golpe da rodada: Ataque \n\n"
                    + "Jogador 1: \n"
                    + um + "-" + retornaNome + "/Ataque:" + retornaUm
                    + "\n\nJogador 2: \n"
                    + dois + "-" + retornaNomeD + "/Ataque:" + retornaDois;
        }

    }

    public static Object escolherDefesa(String escolherUm, String escolherDois) {
        int um = Integer.parseInt(escolherUm);
        int dois = Integer.parseInt(escolherDois);
        int retornaUm = listaPokemon.get(um - 1).getDefesa();
        String retornaNome = listaPokemon.get(um - 1).getNome();
        int retornaDois = listaPokemon.get(dois - 1).getDefesa();
        String retornaNomeD = listaPokemon.get(um - 1).getNome();
        if (retornaUm > retornaDois) {
            return "Jogador 1 Venceu a rodada: \n"
                    + "Golpe da rodada: Defesa \n\n"
                    + "Jogador 1: \n"
                    + um + "-" + retornaNome + "/Defesa:" + retornaUm
                    + "\n\nJogador 2: \n"
                    + dois + "-" + retornaNomeD + "/Defesa:" + retornaDois;
        } else {
            return "Jogador 2 Venceu a rodada: \n"
                    + "Golpe da rodada: Defesa \n\n"
                    + "Jogador 1: \n"
                    + um + "-" + retornaNome + "/Defesa:" + retornaUm
                    + "\n\nJogador 2: \n"
                    + dois + "-" + retornaNomeD + "/Defesa:" + retornaDois;
        }

    }

    public static Object escolherAgilidade(String escolherUm, String escolherDois) {
        int um = Integer.parseInt(escolherUm);
        int dois = Integer.parseInt(escolherDois);
        int retornaUm = listaPokemon.get(um - 1).getAgilidade();
        String retornaNome = listaPokemon.get(um - 1).getNome();
        int retornaDois = listaPokemon.get(dois - 1).getAgilidade();
        String retornaNomeD = listaPokemon.get(dois - 1).getNome();
        if (retornaUm > retornaDois) {
            return "Jogador 1 Venceu a rodada: \n"
                    + "Golpe da rodada: Agilidade \n\n"
                    + "Jogador 1: \n"
                    + um + "-" + retornaNome + "/Agilidade:" + retornaUm
                    + "\n\nJogador 2: \n"
                    + dois + "-" + retornaNomeD + "/Agilidade:" + retornaDois;
        } else {
            return "Jogador 2 Venceu a rodada: \n"
                    + "Golpe da rodada: Agilidade \n\n"
                    + "Jogador 1: \n"
                    + um + "-" + retornaNome + "/Agilidade:" + retornaUm
                    + "\n\nJogador 2: \n"
                    + dois + "-" + retornaNomeD + "/Agilidade:" + retornaDois;
        }

    }

    public static Object deletar(String opcao, String escolherUm, String escolherDois) {
        int opc = Integer.parseInt(opcao);
        int um = Integer.parseInt(escolherUm);
        int dois = Integer.parseInt(escolherDois);
        Pokemon retornaUm = listaPokemon.get(um - 1);
        Pokemon retornaDois = listaPokemon.get(dois - 1);
        if (opc == 1) {
            listaPokemonUm.remove(retornaUm);
            return listaPokemonUm;
        } else if (opc ==2){
            listaPokemonDois.remove(retornaDois);
            return listaPokemonDois;

        }
        return null;
    }

    public static Object listaUm(){
          return listaPokemonUm;
    }
    
    public static Object listaDois() {
        return listaPokemonDois;
    }
    
    

    public static Object listaUmDois() {
        if (listaPokemonUm.isEmpty() || listaPokemonDois.isEmpty()) {
            return "Vazia";
        } else {
            return "Adicionado";
        }
    }
    public static Object tamanhoLista() {
        int quantidade = listaPokemon.size();
        return "A lista só tem: " +quantidade + " Pokémons cadastado";
    }
    
    
     public static String retornar(String quantidade) {
          int um = Integer.parseInt(quantidade);
        String retorno = "";
            retorno += listaPokemon.get(um-1).getQuantidade()+" - "+listaPokemon.get(um-1).getNome()+"\n"
                    +"Força: "+ listaPokemon.get(um-1).getForca() + "\n"
                    + "Ataque: "+ listaPokemon.get(um-1).getAtaque()+"\n"
                    + "Defesa: "+ listaPokemon.get(um-1).getDefesa()+"\n"
                    + "Agilidade: "+listaPokemon.get(um-1).getAgilidade();
        return retorno;
    }

    public static boolean salvarPokemon() {

        listaPokemon.add(pokemon);

        return true;
    }

}
