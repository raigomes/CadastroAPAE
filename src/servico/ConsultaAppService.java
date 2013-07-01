package servico;

import dao.ConsultaDAO;
import dao.fabrica.FabricaDeDAOs;

public class ConsultaAppService
{
    private static ConsultaDAO consultaDAO = FabricaDeDAOs.getDAO(ConsultaDAO.class);
}
