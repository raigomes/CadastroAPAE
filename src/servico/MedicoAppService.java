package servico;

import dao.MedicoDAO;
import dao.fabrica.FabricaDeDAOs;

public class MedicoAppService
{
    private static MedicoDAO medicoDAO = FabricaDeDAOs.getDAO(MedicoDAO.class);
}
