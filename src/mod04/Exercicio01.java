package mod04;

import java.util.Scanner;

public class Exercicio01 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o ambiente: ");
        String ambiente = sc.nextLine();
        sc.close();
        
        if(ambiente.equalsIgnoreCase("DEV"))
        {
            System.out.println("Executando em DEV");
        }
        else if(ambiente.equalsIgnoreCase("TEST"))
        {
            System.out.println("Executando em TEST");
        }
        else
        {
            System.out.println("Executando em abiente " + ambiente);
        }
        System.out.println();
    }
}
