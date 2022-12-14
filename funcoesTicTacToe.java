import javax.swing.JOptionPane;

public class funcoesTicTacToe{

     public static void tabela(char[][] jogoDaVelha){
        JOptionPane.showMessageDialog(null,
                    "                 " + jogoDaVelha[0][0] + "  |  " + jogoDaVelha[0][1] + "  |  " + jogoDaVelha[0][2]+ " \n" +
                    "                 -----------\n" +
                    "                 " + jogoDaVelha[1][0] + "  |  " + jogoDaVelha[1][1] + "  |  " + jogoDaVelha[1][2]+ " \n" +
                    "                 -----------\n" +
                    "                 " + jogoDaVelha[2][0] + "  |  " + jogoDaVelha[2][1] + "  |  " + jogoDaVelha[2][2]+ " \n");

    }
    public static int[] comparacao(int[] ganhadores,char[][] jogoDaVelha,char y,int z) {
        if (jogoDaVelha[0][0] == y && jogoDaVelha[0][1] == y && jogoDaVelha[0][2] == y) {
                        ganhadores[2] = 1;
                        ganhadores[z]++;
                    } else if (jogoDaVelha[1][0] == y && jogoDaVelha[1][1] == y && jogoDaVelha[1][2] == y) {
                        ganhadores[2] = 1;
                        ganhadores[z]++;
                    } else if (jogoDaVelha[2][0] == y && jogoDaVelha[2][1] == y && jogoDaVelha[2][2] == y) {
                        ganhadores[2] = 1;
                        ganhadores[z]++;
                    } else if (jogoDaVelha[0][0] == y && jogoDaVelha[1][1] == y && jogoDaVelha[2][2] == y) {
                        ganhadores[2] = 1;
                        ganhadores[z]++;
                    } else if (jogoDaVelha[0][2] == y && jogoDaVelha[1][1] == y && jogoDaVelha[2][0] == y) {
                        ganhadores[2] = 1;
                        ganhadores[z]++;
                    } else if (jogoDaVelha[0][0] == y && jogoDaVelha[1][0] == y && jogoDaVelha[2][0] == y) {
                        ganhadores[2] = 1;
                        ganhadores[z]++;
                    } else if (jogoDaVelha[0][1] == y && jogoDaVelha[1][1] == y && jogoDaVelha[2][1] == y) {
                        ganhadores[2] = 1;
                        ganhadores[z]++;
                    } else if (jogoDaVelha[0][2] == y && jogoDaVelha[1][2] == y && jogoDaVelha[2][2] == y) {
                        ganhadores[2] = 1;
                        ganhadores[z]++;
                    } else if (jogoDaVelha[0][0] != '-' && jogoDaVelha[0][1] != '-' && jogoDaVelha[0][2] != '-' &&
                                jogoDaVelha[1][0] != '-' && jogoDaVelha[1][1] != '-' && jogoDaVelha[1][2] != '-' &&
                                jogoDaVelha[2][0] != '-' && jogoDaVelha[2][1] != '-' && jogoDaVelha[2][2] != '-') {
                            ganhadores[2] = 1;
                        }

                    return ganhadores;
    }
    public static char[][] l(int lugar1,char[][] jogoDaVelha,char y){
        
        if (lugar1 == 7) {
            if(jogoDaVelha[0][0]=='-'){
                jogoDaVelha[0][0] = y;
            }       
        } else if (lugar1 == 8) {
            if(jogoDaVelha[0][1]=='-'){

                jogoDaVelha[0][1] = y;
            }
        } else if (lugar1 == 9) {
            if(jogoDaVelha[0][2]=='-'){

                jogoDaVelha[0][2] = y;
            }
        } else if (lugar1 == 4) {
            if(jogoDaVelha[1][0]=='-'){

                jogoDaVelha[1][0] = y;
            }
        } else if (lugar1 == 5) {
            if(jogoDaVelha[1][1]=='-'){

                jogoDaVelha[1][1] = y;
            }
        } else if (lugar1 == 6) {
            if(jogoDaVelha[1][2]=='-'){

                jogoDaVelha[1][2] = y;
            }
        } else if (lugar1 == 1) {
            if(jogoDaVelha[2][0]=='-'){

                jogoDaVelha[2][0] = y;
            }
        } else if (lugar1 == 2) {
            if(jogoDaVelha[2][1]=='-'){

                jogoDaVelha[2][1] = y;
            }
        } else if (lugar1 == 3) {
            if(jogoDaVelha[2][2]=='-'){

                jogoDaVelha[2][2] = y;
            }
        }
        return jogoDaVelha;
    }
}