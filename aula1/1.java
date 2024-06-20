//Construa um programa em Java que leia um número e diga se ele é positivo

import java.util.Scanner;

public class API
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    if (n < 0)
    {
      System.out.println("Negativo");
    } 
    else 
    {
      System.out.println("Positivo");
    }

    input.close();
  }
}

