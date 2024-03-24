// Faça um programa em Java que leia números inteiros enquanto não for digitado o
// número -1, e calcule e imprima a soma destes números.

import java.util.Scanner;

public class API {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n, sum = 0;
    do {
      n = input.nextInt();
      sum += n;
    } while (n != -1);
    sum += 1;
    System.out.println(sum);
  }
}
