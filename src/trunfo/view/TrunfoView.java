package trunfo.view;

import javax.swing.JOptionPane;
import trunfo.controller.TrunfoController;

/**
 *
 * @author Douglas Oliveira
 */
public class TrunfoView {

    int t = 0;
    int r = 0;

    public TrunfoView() {
        TrunfoController.iniciaLista();
    }

    public void menuPokemon() {
        String opcao = "";
        String um = "";
        String dois = "";
        String tres = "";
        String quatro = "";
        String cinco = "";
        String seis = "";
        String escolherUm = "";
        String escolherDois = "";
        int i = 0;

        do {
            opcao = JOptionPane.showInputDialog("Super Trunfo - Pokémon \n\n"
                    + "1-CADASTRAR POKÉMON \n"
                    + "2-INICIAR BATALHA \n"
                    + "3-MOSTRAR POKÉMON \n"
                    + "0-SAIR");

            switch (opcao) {
                case "1":
                    for (i = 1; i < 7; i++) {
                        switch (i) {
                            case 1:
                                r = r + 1;
                                TrunfoController.adicionarNome(
                                        JOptionPane.showInputDialog("Informe o nome:"));
                                TrunfoController.adicionarQuantidade(r);
                                break;
                            case 2:
                                TrunfoController.adicionarForca(
                                        JOptionPane.showInputDialog("Informe a forca:"));
                                break;
                            case 3:
                                TrunfoController.adicionarAtaque(
                                        JOptionPane.showInputDialog("Informe o ataque:"));
                                break;
                            case 4:
                                TrunfoController.adicionarDefesa(
                                        JOptionPane.showInputDialog("Informe a defesa:"));
                                break;
                            case 5:
                                TrunfoController.adicionarAgilidade(
                                        JOptionPane.showInputDialog("Informe a agilidade:"));

                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case "2":
                    if (TrunfoController.listaUmDois() == "Vazia") {
                        for (i = 1; i < 7; i++) {
                            if (i <= 3) {
                                opcao = JOptionPane.showInputDialog("JOGADOR UM: "
                                        + "Selecione 3 pokémons: \n"
                                        + TrunfoController.retornarPokemon());
                                switch (i) {
                                    case 1:
                                        um = opcao;
                                        break;
                                    case 2:
                                        dois = opcao;
                                        break;
                                    case 3:
                                        tres = opcao;
                                        break;

                                }

                            } else if (i > 3) {
                                opcao = JOptionPane.showInputDialog("JOGADOR DOIS: "
                                        + "Selecione 3 pokémons: \n" + TrunfoController
                                                .retornarPokemon());
                                switch (i) {
                                    case 4:
                                        quatro = opcao;
                                        break;
                                    case 5:
                                        cinco = opcao;
                                        break;
                                    case 6:
                                        seis = opcao;
                                        JOptionPane.showMessageDialog(
                                                null, "JOGADOR UM: \n" + TrunfoController.escolherPrimeiro(um, dois, tres)
                                                + "\n\nJOGADOR DOIS: \n" + TrunfoController.escolherSegundo(quatro, cinco, seis)
                                        );
                                        opcao = JOptionPane.showInputDialog("JOGADOR UM: \n"
                                                + TrunfoController.escolherUm(um, dois, tres));
                                        escolherUm = opcao;
                                        opcao = JOptionPane.showInputDialog("JOGADOR DOIS: \n"
                                                + TrunfoController.escolherDois(quatro, cinco, seis));
                                        escolherDois = opcao;

                                        opcao = JOptionPane.showInputDialog("Selecione o golpe a ser utilizado: \n"
                                                + "1-Força \n"
                                                + "2-Ataque \n"
                                                + "3-Defesa \n"
                                                + "4-Agilidade:");
                                        switch (opcao) {
                                            case "1":
                                                opcao = JOptionPane.showInputDialog(
                                                        TrunfoController.escolherForca(escolherUm, escolherDois));
                                                JOptionPane.showMessageDialog(
                                                        null, "Pokemons: \n" + TrunfoController.deletar(opcao, escolherUm, escolherDois));
                                                break;
                                            case "2":
                                                opcao = JOptionPane.showInputDialog(
                                                        TrunfoController.escolherAtaque(escolherUm, escolherDois));
                                                JOptionPane.showMessageDialog(
                                                        null, "Pokemons: \n" + TrunfoController.deletar(opcao, escolherUm, escolherDois));
                                                break;
                                            case "3":
                                                opcao = JOptionPane.showInputDialog(
                                                        TrunfoController.escolherDefesa(escolherUm, escolherDois));
                                                JOptionPane.showMessageDialog(
                                                        null, "Pokemons: \n" + TrunfoController.deletar(opcao, escolherUm, escolherDois));
                                                break;
                                            case "4":
                                                opcao = JOptionPane.showInputDialog(
                                                        TrunfoController.escolherAgilidade(escolherUm, escolherDois));
                                                JOptionPane.showMessageDialog(
                                                        null, "Pokemons: \n" + TrunfoController.deletar(opcao, escolherUm, escolherDois));
                                                break;
                                            default:
                                                break;
                                        }
                                        break;
                                }
                            }

                        }

                        break;
                    } else if (TrunfoController.listaUmDois() == "Adicionado") {
                        JOptionPane.showMessageDialog(
                                null, "JOGADOR UM: \n" + TrunfoController.listaUm()
                                + "\n\nJOGADOR DOIS: \n" + TrunfoController.listaDois()
                        );
                        opcao = JOptionPane.showInputDialog("JOGADOR UM: \n"
                                + TrunfoController.listaUm());
                        escolherUm = opcao;
                        opcao = JOptionPane.showInputDialog("JOGADOR DOIS: \n"
                                + TrunfoController.listaDois());
                        escolherDois = opcao;
                        opcao = JOptionPane.showInputDialog("Selecione o golpe a ser utilizado: \n"
                                + "1-Força \n"
                                + "2-Ataque \n"
                                + "3-Defesa \n"
                                + "4-Agilidade:");
                        switch (opcao) {
                            case "1":
                                opcao = JOptionPane.showInputDialog(
                                        TrunfoController.escolherForca(escolherUm, escolherDois));
                                JOptionPane.showMessageDialog(
                                        null, "Pokemon Ativo: \n" + TrunfoController.deletar(opcao, escolherUm, escolherDois));
                                break;
                            case "2":
                                opcao = JOptionPane.showInputDialog(
                                        TrunfoController.escolherAtaque(escolherUm, escolherDois));
                                JOptionPane.showMessageDialog(
                                        null, "Pkemon Ativo: \n" + TrunfoController.deletar(opcao, escolherUm, escolherDois));
                                break;
                            case "3":
                                opcao = JOptionPane.showInputDialog(
                                        TrunfoController.escolherDefesa(escolherUm, escolherDois));
                                JOptionPane.showMessageDialog(
                                        null, "Pokemon Ativo: \n" + TrunfoController.deletar(opcao, escolherUm, escolherDois));
                                break;
                            case "4":
                                opcao = JOptionPane.showInputDialog(
                                        TrunfoController.escolherAgilidade(escolherUm, escolherDois));
                                JOptionPane.showMessageDialog(
                                        null, "JPokemon Ativo: \n" + TrunfoController.deletar(opcao, escolherUm, escolherDois));
                                break;
                            default:
                                break;
                        }
                    }

                case "3":
                    String posicao = JOptionPane.showInputDialog("Qual pokemon deseja exibir? \n"+
                           TrunfoController.tamanhoLista());
                    JOptionPane.showMessageDialog(
                            null, TrunfoController.retornar(posicao));
                    break;
                default:
                    break;
            }

        } while (!opcao.equals("0"));
    }

}
