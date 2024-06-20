// Faça um programa em Java que leia os valores do peso e da altura de pessoas, enquanto
// não for digitado o número -1, conte e escreva quantas pessoas estão acima do peso. A
// condição (peso /(altura*altura)) <= 25 diz que a pessoa está no peso normal.

import java.util.Scanner;

public class API
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    int cnt = 0;
    float peso = input.nextFloat();

    while (peso != -1)
    {
      float altura = input.nextFloat();

      if (altura == -1)
        break;
      
      if (peso/(altura * altura) > 25)
        cnt++;

      peso = input.nextFloat();
    }

    System.out.println("Quantidade de pessoas a cima do peso: " + cnt);
    input.close();
  }
}
