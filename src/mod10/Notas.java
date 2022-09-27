package mod10;

import java.util.Scanner;

/**
 * @author guilherme.oliveira
 */

public class Notas 
{
    public static void main(String[] args)
    {
        /* Exercício do módulo 10
         * Calcular a media das notas e verificar o estado de aprovação do aluno
         */

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
        System.out.println("\nA média do aluno é: " + media);

        if(media >= 7)
        {
            System.out.println("\nAPROVADO!!");
        }
        else if(media >= 5)
        {
            System.out.println("\nRECUPERAÇÃO!!");
        }
        else
        {
            System.out.println("\nREPROVADO!!");
        }

        //Outra forma de fazer, mas arredonda a média para um valor inteiro
        int c = (int) media;

        switch(c) 
        {
            case 7,8,9,10:
                System.out.println("\nAPROVADO!!");
            break;

            case 5,6: 
                System.out.println("\nRECUPERAÇÃO!!");
            break; 

            case 0,1,2,3,4: 
                System.out.println("\nREPROVADO!!");
            break;

            default:
                System.out.println("\nVALOR INVÁLIDO");
            break;
        }
    }
}
