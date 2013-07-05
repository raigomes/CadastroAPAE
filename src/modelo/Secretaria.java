package modelo;

import java.io.Serializable;

public class Secretaria extends Usuario implements Serializable{
    private final static long serialVersionUID = 1;
    private long numero;

    public Secretaria() {
    }

    public Secretaria(long numero) {
        this.numero = numero;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString()
    {
        return "Secretaria{" + "numero=" + numero + '}';
    }
    
    
}
