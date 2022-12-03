
public class funcoesTicTacToe{

     static void tabela(char[][] jogoDaVelha){
        System.out
                                .println(" " + jogoDaVelha[0][0] + " | " + jogoDaVelha[0][1] + " | " + jogoDaVelha[0][2]
                                        + " \n" +
                                        "-----------\n" +
                                        " " + jogoDaVelha[1][0] + " | " + jogoDaVelha[1][1] + " | " + jogoDaVelha[1][2]
                                        + " \n" +
                                        "-----------\n" +
                                        " " + jogoDaVelha[2][0] + " | " + jogoDaVelha[2][1] + " | " + jogoDaVelha[2][2]
                                        + " \n");
    }
    public static char[][] l1(int lugar1,char[][] jogoDaVelha){
        
        if (lugar1 == 7) {
            if(jogoDaVelha[0][0]=='-'){
                jogoDaVelha[0][0] = 'o';
            }       
        } else if (lugar1 == 8) {
            if(jogoDaVelha[0][1]=='-'){

                jogoDaVelha[0][1] = 'o';
            }
        } else if (lugar1 == 9) {
            if(jogoDaVelha[0][2]=='-'){

                jogoDaVelha[0][2] = 'o';
            }
        } else if (lugar1 == 4) {
            if(jogoDaVelha[1][0]=='-'){

                jogoDaVelha[1][0] = 'o';
            }
        } else if (lugar1 == 5) {
            if(jogoDaVelha[1][1]=='-'){

                jogoDaVelha[1][1] = 'o';
            }
        } else if (lugar1 == 6) {
            if(jogoDaVelha[1][2]=='-'){

                jogoDaVelha[1][2] = 'o';
            }
        } else if (lugar1 == 1) {
            if(jogoDaVelha[2][0]=='-'){

                jogoDaVelha[2][0] = 'o';
            }
        } else if (lugar1 == 2) {
            if(jogoDaVelha[2][1]=='-'){

                jogoDaVelha[2][1] = 'o';
            }
        } else if (lugar1 == 3) {
            if(jogoDaVelha[2][2]=='-'){

                jogoDaVelha[2][2] = 'o';
            }
        }
        return jogoDaVelha;
    }
    public static char[][] l2(int lugar1,char[][] jogoDaVelha){
        
        if (lugar1 == 7) {
            if(jogoDaVelha[0][0]=='-'){
                jogoDaVelha[0][0] = 'x';
            }       
        } else if (lugar1 == 8) {
            if(jogoDaVelha[0][1]=='-'){

                jogoDaVelha[0][1] = 'x';
            }
        } else if (lugar1 == 9) {
            if(jogoDaVelha[0][2]=='-'){

                jogoDaVelha[0][2] = 'x';
            }
        } else if (lugar1 == 4) {
            if(jogoDaVelha[1][0]=='-'){

                jogoDaVelha[1][0] = 'x';
            }
        } else if (lugar1 == 5) {
            if(jogoDaVelha[1][1]=='-'){

                jogoDaVelha[1][1] = 'x';
            }
        } else if (lugar1 == 6) {
            if(jogoDaVelha[1][2]=='-'){

                jogoDaVelha[1][2] = 'x';
            }
        } else if (lugar1 == 1) {
            if(jogoDaVelha[2][0]=='-'){

                jogoDaVelha[2][0] = 'x';
            }
        } else if (lugar1 == 2) {
            if(jogoDaVelha[2][1]=='-'){

                jogoDaVelha[2][1] = 'x';
            }
        } else if (lugar1 == 3) {
            if(jogoDaVelha[2][2]=='-'){

                jogoDaVelha[2][2] = 'x';
            }
        }
        return jogoDaVelha;
    }

}