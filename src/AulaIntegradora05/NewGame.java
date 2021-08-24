package AulaIntegradora05;

public class NewGame {
    public static void main(String[] args) {
        UsuarioJogo jogador = new UsuarioJogo("Larissa", "LaNunes");
        System.out.println(jogador.getNome());
        System.out.println(jogador.getNickname());
        jogador.aumentarPontuacao(50);
        System.out.println(jogador.getPontuacao());
        jogador.aumentarNivel();
        System.out.println(jogador.getNivel());
        jogador.somarBonus(37);
        System.out.println(jogador.getPontuacao());

    }
}