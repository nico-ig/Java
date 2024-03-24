// Construa um programa em Java que leia um número x, calcule e escreva o valor da
// função f(x), dada por:
// a) 0 <= x < 5, f(x) = x
// b) 5<= x <10; f(x) = 2x + 1
// c) x >=10; f(x) = x - 3

import java.util.Scanner;

public class API {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    if ( 0 <= x && x < 5 ) {
      System.out.println(x);
    } else if ( 5 <= x && x < 10 ) {
      System.out.println(2*x + 1);
    } else if ( x >= 10 ) {
      System.out.println(x-3);
    }
  }
}
