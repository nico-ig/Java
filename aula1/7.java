// Faça um programa em Java que leia as 4 notas de 30 alunos da turma e escreva a maior
// nota de cada aluno e a maior nota da turma.

import java.util.Scanner;

public class API {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int max = -99999, max_s = -99999;
    for (int student = 0; student < 30; student++) {
      for (int grade = 0; grade < 4; grade++) {
        int n = input.nextInt();
        max_s = Math.max(max_s, n);
      }
      System.out.println(max_s);
      max = Math.max(max, max_s);
    }
    System.out.println(max);
  }
}
