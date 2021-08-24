package AulaIntegradora03;

import java.util.Scanner;

public class JoKemPo {
    public static void main(String[] args) {

        //Definição de entrada dos jogadores
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do Jogador1: ");
        String jogador1 = entrada.nextLine();
        System.out.println("Digite o nome do Jogador2: ");
        String jogador2 = entrada.nextLine();

        System.out.println( "\nConfronto entre " + jogador1 + " e " + jogador2);

        //Definição de entrada das jogadas
        Scanner escolha = new Scanner(System.in);
        System.out.println(jogador1 + " faça sua jogada pedra, papel, tesoura");
        String jogada1 = escolha.nextLine();

        System.out.println(jogador2 + " faça sua jogada pedra, papel, tesoura");
        String jogada2 = escolha.nextLine();

        int placar1 = 0;
        int placar2 = 0;

        //While para encerrar ou continuar as jogar
        while (!jogada1.equals("*")) {
            if(jogador1.equals(wichWin(jogador1, jogada1, jogador2, jogada2))) {
                placar1++;
                System.out.println("\n" + jogador1 + " É o vencedor dessa rodada");
            } else if (jogador2.equals(wichWin(jogador1, jogada1, jogador2, jogada2))) {
                placar2++;
                System.out.println("\n" + jogador2 + " É o vencedor dessa rodada");
            } else {
                System.out.println("Essa rodada empatou!");
            }

            System.out.println("\nPlacar está " + placar1 + " " + jogador1 + "   X  " + placar2 + " " + jogador2);

            //Recomeço da Rodada podendo o primeiro jogador parar ou continuar a partida dependendo da opção
            System.out.println("\n " + jogador1 + " Faça sua jogada novamente pedra, papel, tesoura ");
            jogada1 = escolha.nextLine();

            if (jogada1.equals("*")) {
                System.out.println("\nJogo finalizado o placar foi de " + placar1 + " " + jogador1 + "   X  " + placar2 + " " + jogador2);
            } else {
                System.out.println("\n " + jogador2 + " faça sua jogada novamente pedra, papel, tesoura");
                jogada2 = escolha.nextLine();
            }
        }
    }

    //Definindo a função
    public static String wichWin(String jogador1, String jogada1, String jogador2, String jogada2) {
        System.out.println("JoKenPô");
        String vencedor = "";
        if (jogada1.equals(jogada2)) {
            vencedor = "\n Empataram";
        } else if ((jogada1.equals("pedra") && jogada2.equals("tesoura")) || (jogada1.equals("papel") && jogada2.equals("pedra")) || (jogada1.equals("tesoura") && jogada2.equals("papel"))) {
            vencedor = jogador1;
        } else if ((jogada1.equals("tesoura") && jogada2.equals("pedra")) || (jogada1.equals("pedra") && jogada2.equals("papel")) || (jogada1.equals("papel") && jogada2.equals("tesoura"))) {
            vencedor = jogador2;
        }
        return vencedor;
    }
}
