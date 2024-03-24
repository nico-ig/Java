// Faça um programa em Java que calcule e imprima a soma dos 10 primeiros múltiplos de 3.

public class API {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 10; i++ ) {
      sum += (i * 3); 
    }
    System.out.println(sum);
  }
}
