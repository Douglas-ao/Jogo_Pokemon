package trunfo.controller;

import java.util.ArrayList;
import trunfo.model.Pokemon;

/**
 *
 * @author Douglas Oliveira
 */
public class TrunfoController {
    
    private static Pokemon pokemon;
    private static ArrayList<Pokemon> listaPokemon;
    
    public static void iniciaLista(){
        listaPokemon = new ArrayList<>();
    }
    
    public static void novoPokemon(){
        pokemon = new Pokemon(); 
    }
    
    public static void adicionarNome(String nome){
        pokemon = new Pokemon();
        pokemon.setNome(nome);
    }
    
    public static void adicionarForca(String forca){
        pokemon.setForca(Integer.parseInt(forca));
    }
    
    public static void adicionarAtaque(String ataque){
        pokemon.setAtaque(Integer.parseInt(ataque));
    }
    
    public static void adicionarDefesa(String defesa){
        pokemon.setDefesa(Integer.parseInt(defesa));
    }
    
    public static void adicionarAgilidade(String agilidade){
        pokemon.setAgilidade(Integer.parseInt(agilidade));
        salvarPokemon();
    }
    
    public static void adicionarQuantidade(String quantidade){
            pokemon.setQuantidade(Integer.parseInt(quantidade));
        }
    
   public static void iniciarBatalha(String iniciar){
       for(int i = 1; i < listaPokemon.size(); i++){
        pokemon.setQuantidade(i);
       }
    }

    public static String retornarPokemon(){
         String retorno = "";
        for(Pokemon pokemon : listaPokemon){
            retorno += pokemon.toString() +"\n";
        }
        return retorno;
    }
    
    
    public static boolean salvarPokemon(){
        
        listaPokemon.add(pokemon);
        novoPokemon();
        return true;
    }
   
}
