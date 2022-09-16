import java.util.Random;

public class Dado {
  int lados = 6;

  public Dado() {
  }
  
  public Dado(int numLados) {
    this.lados = numLados;
  }
  
  public int getLados() {
    return this.lados;
  }
  
  public int jogarDado() {
    Random randNum = new Random();
    int resultado = randNum.nextInt(this.lados) + 1;
    return resultado;
  }
}