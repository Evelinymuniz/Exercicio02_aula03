package Questao02;

import java.util.Scanner;

public class ValidacaoDeVotoTernario {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("SAIBA SE VOCÊ TEM DIREITO A VOTAR\n");
        System.out.print("Digite sua idade: ");
        Integer idade = input.nextInt();

        System.out.println(resultado(idade));

    }

    public static String resultado(Integer idade){

        String resultadoVoto = (idade >= 18 && idade < 70) ? "\"Voto Obrigatório!\"" :
                ((idade >= 16 && idade < 18) || idade >= 70) ? "\"Voto Facultativo!\"" : "\"Sem direito a votar!\"";
        return resultadoVoto;
    }

}
