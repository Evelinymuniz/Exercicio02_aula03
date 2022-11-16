package Questao01;

import java.util.Scanner;

public class ValidacaoDeVoto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("SAIBA SE VOCÊ TEM DIREITO A VOTAR\n");
        System.out.print("Digite sua idade: ");
        Integer idade = input.nextInt();

        resultado(idade);
    }

    public static void resultado(Integer idade) {

        if (idade >= 16 && idade <= 17 || idade >= 70) {
            System.out.println("VOTO FACULTATVO");
        } else if ((idade >= 18 && idade < 70)) {
            System.out.println("VOTO OBRIGATORIO");
        } else {
            System.out.println("SEM DIREITO A VOTAR");
        }
    }
}