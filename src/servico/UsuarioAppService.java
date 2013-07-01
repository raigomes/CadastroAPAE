package servico;

import dao.UsuarioDAO;
import dao.fabrica.FabricaDeDAOs;

public class UsuarioAppService
{

    private static UsuarioDAO usuarioDAO = FabricaDeDAOs.getDAO(UsuarioDAO.class);
}
