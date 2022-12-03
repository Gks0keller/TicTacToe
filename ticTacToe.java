import java.util.Scanner;

public class ticTacToe {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] jogoDaVelha = new char[3][3];
        int primeiro, dois = 0, um = 0;
        boolean v = false;

        while (um < 2 && dois < 2) {

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

            System.out.println(" " + jogoDaVelha[0][0] + " | " + jogoDaVelha[0][1] + " | " + jogoDaVelha[0][2] + " \n" +
                    "-----------\n" +
                    " " + jogoDaVelha[1][0] + " | " + jogoDaVelha[1][1] + " | " + jogoDaVelha[1][2] + " \n" +
                    "-----------\n" +
                    " " + jogoDaVelha[2][0] + " | " + jogoDaVelha[2][1] + " | " + jogoDaVelha[2][2] + " \n");

            if (primeiro == 1) {
                v = false;
                while (v == false) {
                    int lugar1 = 0, lugar2 = 0;
                    System.out.print("onde deseja inserir jogador 1: ");
                    lugar1 = sc.nextInt();
                    System.out.println("");
                    if (lugar1 == 7) {
                        jogoDaVelha[0][0] = 'o';
                    } else if (lugar1 == 8) {
                        jogoDaVelha[0][1] = 'o';
                    } else if (lugar1 == 9) {
                        jogoDaVelha[0][2] = 'o';
                    } else if (lugar1 == 4) {
                        jogoDaVelha[1][0] = 'o';
                    } else if (lugar1 == 5) {
                        jogoDaVelha[1][1] = 'o';
                    } else if (lugar1 == 6) {
                        jogoDaVelha[1][2] = 'o';
                    } else if (lugar1 == 1) {
                        jogoDaVelha[2][0] = 'o';
                    } else if (lugar1 == 2) {
                        jogoDaVelha[2][1] = 'o';
                    } else if (lugar1 == 3) {
                        jogoDaVelha[2][2] = 'o';
                    }
                    System.out.println(" " + jogoDaVelha[0][0] + " | " + jogoDaVelha[0][1] + " | " + jogoDaVelha[0][2]
                            + " \n" +
                            "-----------\n" +
                            " " + jogoDaVelha[1][0] + " | " + jogoDaVelha[1][1] + " | " + jogoDaVelha[1][2] + " \n" +
                            "-----------\n" +
                            " " + jogoDaVelha[2][0] + " | " + jogoDaVelha[2][1] + " | " + jogoDaVelha[2][2] + " \n");

                    if (jogoDaVelha[0][0] == 'o' && jogoDaVelha[0][1] == 'o' && jogoDaVelha[0][2] == 'o') {
                        v = true;
                        um++;
                    } else if (jogoDaVelha[1][0] == 'o' && jogoDaVelha[1][1] == 'o' && jogoDaVelha[1][2] == 'o') {
                        v = true;
                        um++;
                    } else if (jogoDaVelha[2][0] == 'o' && jogoDaVelha[2][1] == 'o' && jogoDaVelha[2][2] == 'o') {
                        v = true;
                        um++;
                    } else if (jogoDaVelha[0][0] == 'o' && jogoDaVelha[1][1] == 'o' && jogoDaVelha[2][2] == 'o') {
                        v = true;
                        um++;
                    } else if (jogoDaVelha[0][2] == 'o' && jogoDaVelha[1][1] == 'o' && jogoDaVelha[2][0] == 'o') {
                        v = true;
                        um++;
                    } else if (jogoDaVelha[0][0] == 'o' && jogoDaVelha[1][0] == 'o' && jogoDaVelha[2][0] == 'o') {
                        v = true;
                        um++;
                    } else if (jogoDaVelha[0][1] == 'o' && jogoDaVelha[1][1] == 'o' && jogoDaVelha[2][1] == 'o') {
                        v = true;
                        um++;
                    } else if (jogoDaVelha[0][2] == 'o' && jogoDaVelha[1][2] == 'o' && jogoDaVelha[2][2] == 'o') {
                        v = true;
                        um++;
                    }
                    if (v != true) {

                        System.out.print("onde deseja inserir jogador 2: ");
                        lugar2 = sc.nextInt();
                        System.out.println("");
                        if (lugar2 == 7) {
                            jogoDaVelha[0][0] = 'x';
                        } else if (lugar2 == 8) {
                            jogoDaVelha[0][1] = 'x';
                        } else if (lugar2 == 9) {
                            jogoDaVelha[0][2] = 'x';
                        } else if (lugar2 == 4) {
                            jogoDaVelha[1][0] = 'x';
                        } else if (lugar2 == 5) {
                            jogoDaVelha[1][1] = 'x';
                        } else if (lugar2 == 6) {
                            jogoDaVelha[1][2] = 'x';
                        } else if (lugar2 == 1) {
                            jogoDaVelha[2][0] = 'x';
                        } else if (lugar2 == 2) {
                            jogoDaVelha[2][1] = 'x';
                        } else if (lugar2 == 3) {
                            jogoDaVelha[2][2] = 'x';
                        }
                        System.out
                                .println(" " + jogoDaVelha[0][0] + " | " + jogoDaVelha[0][1] + " | " + jogoDaVelha[0][2]
                                        + " \n" +
                                        "-----------\n" +
                                        " " + jogoDaVelha[1][0] + " | " + jogoDaVelha[1][1] + " | " + jogoDaVelha[1][2]
                                        + " \n" +
                                        "-----------\n" +
                                        " " + jogoDaVelha[2][0] + " | " + jogoDaVelha[2][1] + " | " + jogoDaVelha[2][2]
                                        + " \n");

                        if (jogoDaVelha[0][0] == 'x' && jogoDaVelha[0][1] == 'x' && jogoDaVelha[0][2] == 'x') {
                            v = true;
                            dois++;
                        } else if (jogoDaVelha[1][0] == 'x' && jogoDaVelha[1][1] == 'x' && jogoDaVelha[1][2] == 'x') {
                            v = true;
                            dois++;
                        } else if (jogoDaVelha[2][0] == 'x' && jogoDaVelha[2][1] == 'x' && jogoDaVelha[2][2] == 'x') {
                            v = true;
                            dois++;
                        } else if (jogoDaVelha[0][0] == 'x' && jogoDaVelha[1][1] == 'x' && jogoDaVelha[2][2] == 'x') {
                            v = true;
                            dois++;
                        } else if (jogoDaVelha[0][2] == 'x' && jogoDaVelha[1][1] == 'x' && jogoDaVelha[2][0] == 'x') {
                            v = true;
                            dois++;
                        } else if (jogoDaVelha[0][0] == 'x' && jogoDaVelha[1][0] == 'x' && jogoDaVelha[2][0] == 'x') {
                            v = true;
                            dois++;
                        } else if (jogoDaVelha[0][1] == 'x' && jogoDaVelha[1][1] == 'x' && jogoDaVelha[2][1] == 'x') {
                            v = true;
                            dois++;
                        } else if (jogoDaVelha[0][2] == 'x' && jogoDaVelha[1][2] == 'x' && jogoDaVelha[2][2] == 'x') {
                            v = true;
                            dois++;
                        } else if (jogoDaVelha[0][0] != '-' && jogoDaVelha[0][1] != '-' && jogoDaVelha[0][2] != '-' &&
                                jogoDaVelha[1][0] != '-' && jogoDaVelha[1][1] != '-' && jogoDaVelha[1][2] != '-' &&
                                jogoDaVelha[2][0] != '-' && jogoDaVelha[2][1] != '-' && jogoDaVelha[2][2] != '-') {
                            v = true;
                        }
                    }
                }
            } else if (primeiro == 2) {
                v = false;
                while (v == false) {
                    int lugar1 = 0, lugar2 = 0;
                    System.out.print("onde deseja inserir jogador 2: ");
                    lugar2 = sc.nextInt();
                    System.out.println("");
                    if (lugar2 == 7) {
                        jogoDaVelha[0][0] = 'x';
                    } else if (lugar2 == 8) {
                        jogoDaVelha[0][1] = 'x';
                    } else if (lugar2 == 9) {
                        jogoDaVelha[0][2] = 'x';
                    } else if (lugar2 == 4) {
                        jogoDaVelha[1][0] = 'x';
                    } else if (lugar2 == 5) {
                        jogoDaVelha[1][1] = 'x';
                    } else if (lugar2 == 6) {
                        jogoDaVelha[1][2] = 'x';
                    } else if (lugar2 == 1) {
                        jogoDaVelha[2][0] = 'x';
                    } else if (lugar2 == 2) {
                        jogoDaVelha[2][1] = 'x';
                    } else if (lugar2 == 3) {
                        jogoDaVelha[2][2] = 'x';
                    }
                    System.out.println(" " + jogoDaVelha[0][0] + " | " + jogoDaVelha[0][1] + " | " + jogoDaVelha[0][2]
                            + " \n" +
                            "-----------\n" +
                            " " + jogoDaVelha[1][0] + " | " + jogoDaVelha[1][1] + " | " + jogoDaVelha[1][2] + " \n" +
                            "-----------\n" +
                            " " + jogoDaVelha[2][0] + " | " + jogoDaVelha[2][1] + " | " + jogoDaVelha[2][2] + " \n");

                    if (jogoDaVelha[0][0] == 'x' && jogoDaVelha[0][1] == 'x' && jogoDaVelha[0][2] == 'x') {
                        v = true;
                        dois++;
                    } else if (jogoDaVelha[1][0] == 'x' && jogoDaVelha[1][1] == 'x' && jogoDaVelha[1][2] == 'x') {
                        v = true;
                        dois++;
                    } else if (jogoDaVelha[2][0] == 'x' && jogoDaVelha[2][1] == 'x' && jogoDaVelha[2][2] == 'x') {
                        v = true;
                        dois++;
                    } else if (jogoDaVelha[0][0] == 'x' && jogoDaVelha[1][1] == 'x' && jogoDaVelha[2][2] == 'x') {
                        v = true;
                        dois++;
                    } else if (jogoDaVelha[0][2] == 'x' && jogoDaVelha[1][1] == 'x' && jogoDaVelha[2][0] == 'x') {
                        v = true;
                        dois++;
                    } else if (jogoDaVelha[0][0] == 'x' && jogoDaVelha[1][0] == 'x' && jogoDaVelha[2][0] == 'x') {
                        v = true;
                        dois++;
                    } else if (jogoDaVelha[0][1] == 'x' && jogoDaVelha[1][1] == 'x' && jogoDaVelha[2][1] == 'x') {
                        v = true;
                        dois++;
                    } else if (jogoDaVelha[0][2] == 'x' && jogoDaVelha[1][2] == 'x' && jogoDaVelha[2][2] == 'x') {
                        v = true;
                        dois++;
                    }

                    if (v != true) {

                        System.out.print("onde deseja inserir jogador 1: ");
                        lugar1 = sc.nextInt();
                        System.out.println("");
                        if (lugar1 == 7) {
                            jogoDaVelha[0][0] = 'o';
                        } else if (lugar1 == 8) {
                            jogoDaVelha[0][1] = 'o';
                        } else if (lugar1 == 9) {
                            jogoDaVelha[0][2] = 'o';
                        } else if (lugar1 == 4) {
                            jogoDaVelha[1][0] = 'o';
                        } else if (lugar1 == 5) {
                            jogoDaVelha[1][1] = 'o';
                        } else if (lugar1 == 6) {
                            jogoDaVelha[1][2] = 'o';
                        } else if (lugar1 == 1) {
                            jogoDaVelha[2][0] = 'o';
                        } else if (lugar1 == 2) {
                            jogoDaVelha[2][1] = 'o';
                        } else if (lugar1 == 3) {
                            jogoDaVelha[2][2] = 'o';
                        }
                        System.out
                                .println(" " + jogoDaVelha[0][0] + " | " + jogoDaVelha[0][1] + " | " + jogoDaVelha[0][2]
                                        + " \n" +
                                        "-----------\n" +
                                        " " + jogoDaVelha[1][0] + " | " + jogoDaVelha[1][1] + " | " + jogoDaVelha[1][2]
                                        + " \n" +
                                        "-----------\n" +
                                        " " + jogoDaVelha[2][0] + " | " + jogoDaVelha[2][1] + " | " + jogoDaVelha[2][2]
                                        + " \n");                                    
                        if (jogoDaVelha[0][0] == 'o' && jogoDaVelha[0][1] == 'o' && jogoDaVelha[0][2] == 'o') {
                            v = true;
                            um++;
                        } else if (jogoDaVelha[1][0] == 'o' && jogoDaVelha[1][1] == 'o' && jogoDaVelha[1][2] == 'o') {
                            v = true;
                            um++;
                        } else if (jogoDaVelha[2][0] == 'o' && jogoDaVelha[2][1] == 'o' && jogoDaVelha[2][2] == 'o') {
                            v = true;
                            um++;
                        } else if (jogoDaVelha[0][0] == 'o' && jogoDaVelha[1][1] == 'o' && jogoDaVelha[2][2] == 'o') {
                            v = true;
                            um++;
                        } else if (jogoDaVelha[0][2] == 'o' && jogoDaVelha[1][1] == 'o' && jogoDaVelha[2][0] == 'o') {
                            v = true;
                            um++;
                        } else if (jogoDaVelha[0][0] == 'o' && jogoDaVelha[1][0] == 'o' && jogoDaVelha[2][0] == 'o') {
                            v = true;
                            um++;
                        } else if (jogoDaVelha[0][1] == 'o' && jogoDaVelha[1][1] == 'o' && jogoDaVelha[2][1] == 'o') {
                            v = true;
                            um++;
                        } else if (jogoDaVelha[0][2] == 'o' && jogoDaVelha[1][2] == 'o' && jogoDaVelha[2][2] == 'o') {
                            v = true;
                            um++;
                        } else if (jogoDaVelha[0][0] != '-' && jogoDaVelha[0][1] != '-' && jogoDaVelha[0][2] != '-' &&
                                jogoDaVelha[1][0] != '-' && jogoDaVelha[1][1] != '-' && jogoDaVelha[1][2] != '-' &&
                                jogoDaVelha[2][0] != '-' && jogoDaVelha[2][1] != '-' && jogoDaVelha[2][2] != '-') {
                            v = true;
                        }

                    }
                }
            }

        }
        if (um == 2) {
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