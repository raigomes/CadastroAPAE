package dao.fabrica;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import exception.InfraestruturaException;

public class FabricaDeDAOs
{

    private static ResourceBundle prop;

    static
    {
        try
        {
            prop = ResourceBundle.getBundle("dao");
        } catch (MissingResourceException e)
        {
            System.out.println("Aquivo dao.properties não encontrado.");
            throw new InfraestruturaException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T getDAO(Class<T> tipo)
    {
        T dao = null;
        String nomeDaClasse = null;

        try
        {
            nomeDaClasse = prop.getString(tipo.getSimpleName());
            dao = (T) Class.forName(nomeDaClasse).newInstance();
        } catch (InstantiationException e)
        {
            System.out.println("Não foi possível criar um objeto do tipo " + nomeDaClasse);
            throw new InfraestruturaException(e);
        } catch (IllegalAccessException e)
        {
            System.out.println("Não foi possível criar um objeto do tipo " + nomeDaClasse);
            throw new InfraestruturaException(e);
        } catch (ClassNotFoundException e)
        {
            System.out.println("Classe " + nomeDaClasse + " não encontrada");
            throw new InfraestruturaException(e);
        } catch (MissingResourceException e)
        {
            System.out.println("Chave " + tipo + " não encontrada em dao.properties");
            throw new InfraestruturaException(e);
        }

        return dao;
    }
}
