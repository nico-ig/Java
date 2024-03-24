// Construa um programa em Java que leia um número e diga se ele é positivo.

import java.util.Scanner;

public class API {
  public static void main(String[] args) {
    int a;
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    if (a >= 0) {
      System.out.println("Positivo");
    }
    else {
      System.out.println("Negativo");
    }
  }
}
