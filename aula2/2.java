/* Construa um programa em Java que leia 10 valores de idades de pessoas, calcule e
/  imprima a média e, a seguir, imprima quais idades estão acima e quais idades estão abaixo
/  da média.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class API {
  public static void main(String[] args) {
    ArrayList<Integer> idades = new ArrayList<Integer>();

    Scanner input = new Scanner(System.in);
    int media = 0;
    for (int i = 0; i < 10; i++) {
      int idade = input.nextInt();
      media += idade;
      idades.add(idade);
    }

    media /= 10;
    System.out.println("Media: " + media);
    System.out.print("Acima:");
    for (int idade : idades) {
      if (idade >= media) {
        System.out.print(" " + idade);
      }
    };
    System.out.println();
    System.out.print("Abaixo:");
    for (int idade : idades) {
      if (idade < media) {
        System.out.print(" " + idade);
      }
    };
    System.out.println();
  }
}
