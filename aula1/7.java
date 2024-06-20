// Faça um programa em Java que leia as 4 notas de 30 alunos da turma e escreva a maior
// nota de cada aluno e a maior nota da turma.

import java.util.Scanner;

public class API
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    
    int maxTurma = 0;
    for (int i = 0; i < 5; i++)
    {
      int maxAluno = 0;

      for (int j = 0; j < 4; j++)
      {
        int nota = input.nextInt();

        if (nota > maxAluno)
          maxAluno = nota;
      }

      System.out.println("Maior nota aluno: " + maxAluno);

      if (maxAluno > maxTurma)
        maxTurma = maxAluno;
    }

    System.out.println("Maior nota turma: " + maxTurma);
    input.close();
  }
}
