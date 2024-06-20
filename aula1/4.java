// Faça um programa em Java que calcule e imprima a soma dos 10 
// primeiros múltiplos de 3.

public class API
{
  public static void main(String args[])
  {
    int s = 0;
    for (int i = 0; i < 10; i++)
    {
      s += (3 * i); 
    }

    System.out.println("Soma: " + s);
  }
}
