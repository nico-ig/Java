// Faça um programa em Java que leia números inteiros enquanto não for digitado o
// número -1, e calcule e imprima a soma destes números.

import java.util.Scanner;

public class API
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in); 
    
    int s = 0;
    int n = 0;

    while (n != -1)
    {
      s += n;
      n = input.nextInt();
    }

    System.out.println("Soma: " + s);

    input.close();
  }
}
