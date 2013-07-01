package servico;

import dao.DiretoraDAO;
import dao.fabrica.FabricaDeDAOs;

public class DiretoraAppService
{
    private static DiretoraDAO diretoraDAO = FabricaDeDAOs.getDAO(DiretoraDAO.class);
}
