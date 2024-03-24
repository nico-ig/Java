/* Construa um programa Java com as seguintes classes:
/  * Uma classe telefone com os atributos: código do país (DDI), 
/    código de área (DDD), número e métodos para cadastrar e exibir.
/  * Uma classe principal que contenha um vetor que armazene cinco objetos
/   (números de telefone). Lembrando que os códigos de país válidos são: 55 (Brasil),
/   1 (Estados Unidos) e 61 (Austrália). Na sequência, exiba os números no seguinte
/   formato: +DDI (DDD) número.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class API {
  public static void main(String[] args) {
    Telefone[] telefones = new Telefone[5];
    for (int i = 0; i < 5; i++) {
      telefones[i] = new Telefone();
      Scanner input = new Scanner(System.in);
      String ddi = input.nextLine();
      String ddd = input.nextLine();
      String numero = input.nextLine();
      if (telefones[0].cadastrar(ddi, ddd, numero) == 0) {
        telefones[0].exibir();
      } else {
        System.out.println("Numero invalido");
        i--;
      }
    }
  }
}

public class Telefone {
  String ddi;
  String ddd;
  String numero;
  ArrayList<String> ddi_aceitos = new ArrayList<String>(Arrays.asList("1", "55", "61"));

  public int cadastrar(String ddi, String ddd, String numero) {
    if (!this.ddi_aceitos.contains(ddi)) {
      return 1;
    }

    this.ddi = ddi;
    this.ddd = ddd;
    this.numero = numero;
    return 0;
  }

  public void exibir() {
    System.out.println("+" + this.ddi + " (" + this.ddd + ") " + this.numero);
  }
}

