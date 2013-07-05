package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BDUtil
{

    private static APAE conn;

    static
    {
        conn = new APAE();
    }

    public APAE getConnection()
    {
        return conn;
    }

    public boolean salvar()
    {
        // serializa o objeto e salva em um arquivo
        try
        {
            FileOutputStream fileOut = new FileOutputStream("pew.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(conn);
            out.close();
            fileOut.close();
            return true;
        } catch (IOException i)
        {
            System.out.println(i.getMessage());
            return false;
        }
    }

    public boolean carregar()
    {
        // carrega o arquivo, preenche os objetos
        try
        {
            FileInputStream fileIn = new FileInputStream("pew.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            conn = (APAE) in.readObject();
            in.close();
            fileIn.close();
            return true;
        } catch (IOException i)
        {
            //System.out.println("Arquivo não encontrado!");
            return false;
        } catch (ClassNotFoundException c)
        {
            //System.out.println("Classe não encontrada! " + c.getMessage());
            return false;
        }
    }
}
