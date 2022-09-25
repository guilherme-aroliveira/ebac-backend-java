package mod8;

import java.util.Scanner;

/**
 * @author guilherme.oliveira
 */

public class Notas 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;
        int n = 1;

        System.out.println("\n**** Calcular a média de 4 notas ****");
        
        System.out.print("Informe o valor da " + n + " nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Informe o valor da " + (n + 1) + " nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Informe o valor da " + (n + 2) + " nota: ");
        nota3 = sc.nextDouble();
        System.out.print("Informe o valor da " + (n + 3) + " nota: ");
        nota4 = sc.nextDouble();
        sc.close();
        
        media = (nota1 + nota2 + nota3 + nota4) / 4; 

        System.out.println("\nA média das notas é: " + media);
    }
}
