import java.util.Scanner;

public class Jogo {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.println("Digite a classe do personagem: ");
    String classePersonagem = in.nextLine();
    System.out.println("Qual o número de lados do dado? ");
    int lados = in.nextInt();
    System.out.println("Qual o inimigo você vai enfrentar('O' - Orc ou 'D' - Dragão)");
    char inimigo = in.next().charAt(0);

    RPGPlayer jogador = new RPGPlayer(classePersonagem);
    Dado dadoJogo = new Dado(lados);

    boolean venceu = jogador.jogar(dadoJogo, inimigo);
    String msg = venceu ? "Você venceu!" : "Você perdeu!";

    System.out.println(msg);
  }
}