package modelo;

import java.io.Serializable;

public class Medico implements Serializable{
    private final static long serialVersionUID = 1;
    private long numero;
    private int CRM;
    private double salario;
    

    public Medico()
    {
    }

    public Medico(long n)
    {
        this.numero = n;
    }

    public long getNumero()
    {
        return numero;
    }
    
    public void setNumero(Long numero)
    {
        this.numero = numero;
    }
}
