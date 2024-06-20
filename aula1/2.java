// Construa um programa em Java que leia um número inteiro e diga se ele é par ou ímpar.
import java.util.Scanner;

public class API
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();

    if (n % 2 == 0)
    {
      System.out.println("Par");
    }
    else
    {
      System.out.println("Impar");
    }

    input.close();
  }
}
