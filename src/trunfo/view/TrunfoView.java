package trunfo.view;

import javax.swing.JOptionPane;
import trunfo.controller.TrunfoController;

/**
 *
 * @author Douglas Oliveira
 */
public class TrunfoView {

    int t = 0;

    public TrunfoView() {
        TrunfoController.iniciaLista();
    }

    public void menuPokemon() {
        String opcao = "";
        int i = 0;

        do {
            opcao = JOptionPane.showInputDialog("Super Trunfo - Pokémon \n\n"
                    + "1-CADASTRAR POKÉMON \n"
                    + "2-INICIAR BATALHA \n"
                    + "3-MOSTRAR POKÉMON \n"
                    + "0-SAIR");

            switch (opcao) {
                case "1":
                    for (i = 1; i < 6; i++) {
                        switch (i) {
                            case 1:
                                TrunfoController.adicionarNome(
                                        JOptionPane.showInputDialog("Informe o nome:"));
                                TrunfoController.adicionarQuantidade("1");
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
                        t += i;
                        t = -5;
                    }   break;
                case "2":
                    TrunfoController.iniciarBatalha(
                            JOptionPane.showInputDialog("Selecione 3 pokémons: \n"+ TrunfoController.retornarPokemon()));
                    break;
                case "3":
                    JOptionPane.showMessageDialog(
                            null, TrunfoController.retornarPokemon());
                    break;
                default:
                    break;
            }

        } while (!opcao.equals("0"));
    }

}
