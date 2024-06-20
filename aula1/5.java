// Construa um programa em Java que leia um número x, calcule e escreva o valor da
// função f(x), dada por:
//    a) 0 <= x < 5, f(x) = x
//    b) 5<= x <10; f(x) = 2x + 1
//    c) x >=10; f(x) = x - 3

import java.util.Scanner;

public class API
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);

    int x = input.nextInt();

    int fx;
    if (0 <= 5 && x < 5)
    {
      fx = x;
    }
    else if (x < 10)
    {
      fx = 2 * x + 1;
    }
    else
    {
      fx = x - 3;
    }
    
    System.out.println("f(x) = " + fx);
    input.close();
  }
}
