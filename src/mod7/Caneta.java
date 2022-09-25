package mod7;

/**
 * @author guilherme.oliveira
 * 
 * @see mod7.Caneta
 * 
 * @version 1.0
 */
public class Caneta 
{
    private String modelo, cor, tamanho;
    private boolean tampada;

    public String getModelo()
    {
        return this.modelo;
    }

    
    /** 
     * @param modelo
     */
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getCor() 
    {
        return this.cor;
    }

    
    /** 
     * @param cor
     */
    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public String getTamanho()
    {
        return this.tamanho;
    }

    
    /** 
     * @param tamanho
     */
    public void setTamanho(String tamanho)
    {
        this.tamanho = tamanho;
    }

    
    public boolean getTampada() 
    {
        return this.tampada;
    }

    
    /** 
     * @param tampada
     */
    public void setTampada(boolean tampada) 
    {
        this.tampada = tampada;
    }
}
