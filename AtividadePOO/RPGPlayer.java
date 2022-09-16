public class RPGPlayer {
  String classe = "Guerreiro";

  public RPGPlayer(String classe) {
    this.classe = classe;
    switch(classe) {
      case "Mago":
        System.out.println("Você é um Mago!");
        break;
      case "Elfo":
        System.out.println("Você é um Elfo!");
        break;
      case "Paladino":
        System.out.println("Você é um Paladino!");
        break;
      default:
        System.out.println("Você é um Guerreiro!");
        break;
    }
  }

  public boolean jogar(Dado dado, char inimigo) {

    int pontos = 0;

    int dadoGame = dado.jogarDado();
    System.out.println("Você jogou o dado: "+dadoGame);

    int vidaInimigo = ((int)dado.getLados() / 2);
    System.out.println("Life: "+vidaInimigo);

    switch (inimigo) {
      case 'O':
        if (this.classe.equals("mago"))
          pontos += 2;
        else if (this.classe.equals("guerreiro"))
          pontos -= 1;
        else if (this.classe.equals("elfo"))
          pontos += 1;
        else if (this.classe.equals("paladino"))
          pontos -= 2;
        break;

      case 'D':
        if (this.classe.equals("Mago"))
          pontos -= 1;
        else if (this.classe.equals("Guerreiro"))
          pontos += 3;
        else if (this.classe.equals("Elfo"))
          pontos -= 2;
        else if (this.classe.equals("Paladino"))
          pontos += 2;
        break;

      default:
        System.out.println("Inimigo inválido");
    }

    int totalPontos = dadoGame + pontos;
    boolean venceu = totalPontos > vidaInimigo ? true : false;
    return venceu;
  }
  }
