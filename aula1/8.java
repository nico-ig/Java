// Faça um programa em Java que leia os valores do peso e da altura de pessoas, enquanto
// não for digitado o número -1, conte e escreva quantas pessoas estão acima do peso. A
// condição (peso /(altura*altura)) <= 25 diz que a pessoa está no peso normal.

import java.util.Scanner;

public class API {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int w, h, cnt = 0;
    while (true) {
      w = input.nextInt();
      if ( w == -1 ) {
        break;
      }

      h = input.nextInt();
      if ( h == -1 ) {
        break;
      }


      if ((double)w / (h * h) > 25) {
        cnt++;
      }
    } 

    System.out.println(cnt);
  }
}
