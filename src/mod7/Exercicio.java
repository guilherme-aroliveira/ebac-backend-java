package mod7;

public class Exercicio 
{
    public static void main(String[] args)
    {
        Caneta caneta = new Caneta();

        caneta.setCor("Azul");
        caneta.setModelo("Bic");
        caneta.setTamanho("Pequena");

        System.out.println(caneta.getModelo());
        System.out.println(caneta.getCor());
        System.out.println(caneta.getTamanho());
    }
}
