import java.util.Scanner;

import javax.swing.JOptionPane;

public class ticTacToe {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] jogoDaVelha = new char[3][3];
        char x = 'x', o = 'o';
        int primeiro = 0, um = 0, dois = 1;
        String jogador[] = { "jogador 1 - O", "jogador 2 - X" };
        int[] ganhadores = new int[3];

        JOptionPane.showMessageDialog(null, "O jogo Funciona com base no teclado numerico", "Forma do jogo",
                JOptionPane.INFORMATION_MESSAGE);

        primeiro = JOptionPane.showOptionDialog(null, " escolha quem vai jogar primeiro: ", "escolha",
                JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, jogador, jogador[0]);

        while (ganhadores[0] < 2 && ganhadores[1] < 2 && primeiro != -1) {

            for (int l = 0; l < 3; l++) {
                for (int c = 0; c < 3; c++) {
                    jogoDaVelha[l][c] = '-';
                }
            }

            System.out.println("");

            funcoesTicTacToe.tabela(jogoDaVelha);

            if (primeiro == 0) {
                ganhadores[2] = 0;
                while (ganhadores[2] == 0) {

                    funcoesTicTacToe.l(Integer.parseInt(JOptionPane.showInputDialog("onde deseja inserir jogador 1: ")),
                            jogoDaVelha, o);
                    System.out.println("");

                    funcoesTicTacToe.tabela(jogoDaVelha);

                    funcoesTicTacToe.comparacao(ganhadores, jogoDaVelha, o, um);

                    if (ganhadores[2] == 1) {
                        if (ganhadores[0] == 1) {
                            JOptionPane.showMessageDialog(null, "Ganhador é...\nVencedor 1");
                        }
                    }
                    if (ganhadores[2] != 1) {

                        funcoesTicTacToe.l(
                                Integer.parseInt(JOptionPane.showInputDialog("onde deseja inserir jogador 2: ")),
                                jogoDaVelha, x);
                        System.out.println("");

                        funcoesTicTacToe.tabela(jogoDaVelha);

                        funcoesTicTacToe.comparacao(ganhadores, jogoDaVelha, x, dois);
                        if (ganhadores[2] == 1) {
                            if (ganhadores[1] == 1) {
                                JOptionPane.showMessageDialog(null, "Ganhador é...\nVencedor 2");
                            }

                        }
                    }

                }
            } else if (primeiro == 1) {

                ganhadores[2] = 0;
                while (ganhadores[2] == 0) {

                    funcoesTicTacToe.l(Integer.parseInt(JOptionPane.showInputDialog("onde deseja inserir jogador 2: ")),
                            jogoDaVelha, x);
                    System.out.println("");

                    funcoesTicTacToe.tabela(jogoDaVelha);

                    funcoesTicTacToe.comparacao(ganhadores, jogoDaVelha, x, dois);
                    if (ganhadores[2] == 1) {
                        if (ganhadores[2] == 1) {
                            JOptionPane.showMessageDialog(null, "Ganhador é...\nVencedor 2");
                        }
                    }

                    if (ganhadores[2] != 1) {

                        funcoesTicTacToe.l(
                                Integer.parseInt(JOptionPane.showInputDialog("onde deseja inserir jogador 1: ")),
                                jogoDaVelha, o);
                        System.out.println("");

                        funcoesTicTacToe.tabela(jogoDaVelha);

                        funcoesTicTacToe.comparacao(ganhadores, jogoDaVelha, o, um);
                        if (ganhadores[2] == 1) {
                            if (ganhadores[1] == 1) {
                                JOptionPane.showMessageDialog(null, "Ganhador é...\nVencedor 1");
                            }
                        }
                    }
                }
            }

        }

        if (primeiro == -1) {
            JOptionPane.showMessageDialog(null, "Fim do programa...", null, JOptionPane.INFORMATION_MESSAGE);
        }
        if (ganhadores[0] == 2) {
            JOptionPane.showMessageDialog(null, "==================================\n" +
                    "O viToRiosO foi UM 11111111 !!!!!!\n" +
                    "==================================");
        } else if (ganhadores[1] == 2) {
            JOptionPane.showMessageDialog(null, "==================================\n"
                    + "O viToRiosO foi Dois 22222222 !!!!!!\n" + "==================================");
        }
    }
}