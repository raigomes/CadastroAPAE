package servico;

import dao.SecretariaDAO;
import dao.fabrica.FabricaDeDAOs;

public class SecretariaAppService
{
    private static SecretariaDAO secretariaDAO = FabricaDeDAOs.getDAO(SecretariaDAO.class);
}
