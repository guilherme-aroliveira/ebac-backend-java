package mod9;

import java.util.Scanner;
import java.util.Calendar;
/**
 * @author guilherme.oliveira
 */

public class Exercicio
{
    public static void main(String[] args)
    {
        // Fazer a conversão de uma variavél para o tipo Wrapper
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        int idade, anoNascimento, anoAtual;

        System.out.println("\n*** Conversão ***");

        System.out.print("Informe o seu ano de nascimento: ");
        anoNascimento = sc.nextInt();
        sc.close();

        anoAtual = cal.get(Calendar.YEAR);
        idade = anoAtual - anoNascimento;
        Integer idadeF = (Integer) idade;

        System.out.println("\nVocê está com " + idadeF + " anos de idade.");
    }
}