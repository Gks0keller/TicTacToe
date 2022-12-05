import java.util.Scanner;

public class ticTacToe {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] jogoDaVelha = new char[3][3];
        int primeiro;
        int[] ganhadores=new int[3];

        while (ganhadores[0] < 2 && ganhadores[1] < 2) {

            for (int l = 0; l < 3; l++) {
                for (int c = 0; c < 3; c++) {
                    jogoDaVelha[l][c] = '-';
                }
            }

            System.out.print(" 1 = o - Jogador 1\n" +
                    " 2 = x - jogador 2\n" +
                    " escolha quem vai jogar primeiro: ");
            primeiro = sc.nextInt();

            System.out.println("");

            funcoesTicTacToe.tabela(jogoDaVelha);

            if (primeiro == 1) {
                ganhadores[2] = 0;
                while (ganhadores[2] == 0) {
                    
                    System.out.print("onde deseja inserir jogador 1: ");
                    funcoesTicTacToe.l1( sc.nextInt(),jogoDaVelha);
                    System.out.println("");
                    
                    funcoesTicTacToe.tabela(jogoDaVelha);

                    funcoesTicTacToe.comparacao(ganhadores,jogoDaVelha);
                   
                    if (ganhadores[2] != 1) {

                        System.out.print("onde deseja inserir jogador 2: ");
                        funcoesTicTacToe.l2(sc.nextInt(),jogoDaVelha);
                        System.out.println("");
                      
                        funcoesTicTacToe.tabela(jogoDaVelha);

                        funcoesTicTacToe.comparacao(ganhadores,jogoDaVelha);
                    }
                }
            } else if (primeiro == 2) {
                ganhadores[2] = 0;
                while (ganhadores[2] == 0) {
                    
                    System.out.print("onde deseja inserir jogador 2: ");
                    funcoesTicTacToe.l2(sc.nextInt(),jogoDaVelha);
                    System.out.println("");
                    
                    funcoesTicTacToe.tabela(jogoDaVelha);

                    funcoesTicTacToe.comparacao(ganhadores,jogoDaVelha);

                    if (ganhadores[2] != 1) {

                        System.out.print("onde deseja inserir jogador 1: ");
                        funcoesTicTacToe.l1( sc.nextInt(),jogoDaVelha);
                        System.out.println("");
                        
                        funcoesTicTacToe.tabela(jogoDaVelha);
                        
                        funcoesTicTacToe.comparacao(ganhadores,jogoDaVelha);
                    }
                }
            }

        }
        if (ganhadores[0] == 2) {
            System.out.println("==================================");
            System.out.println("O viToRiosO foi UM 11111111 !!!!!!");
            System.out.println("==================================");
        } else {
            System.out.println("==================================");
            System.out.println("O viToRiosO foi DOIS 22222222 !!!!!!");
            System.out.println("==================================");
        }
    }
}