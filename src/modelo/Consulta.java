package modelo;

import java.io.Serializable;

public class Consulta implements Serializable{
    private final static long serialVersionUID = 1;
    private long numero;

    public Consulta()
    {
    }

    public Consulta(long n)
    {
        this.numero = n;
    }

    public Long getNumero()
    {
        return numero;
    }
    
    public void setNumero(Long numero)
    {
        this.numero = numero;
    }    
}
