package servico;

import java.util.List;
import util.JPAUtil;
import modelo.Paciente;
import dao.PacienteDAO;
import dao.fabrica.FabricaDeDAOs;
import exception.AplicacaoException;
import exception.InfraestruturaException;
import exception.ObjetoNaoEncontradoException;

public class PacienteAppService
{

    private static PacienteDAO pacienteDAO = FabricaDeDAOs.getDAO(PacienteDAO.class);

    public long inclui(Paciente umPaciente)
    {
        try
        {
            // NENHUMA VALIDAÇÃO ESTÁ SENDO REALIZADA AQUI!!!

            JPAUtil.beginTransaction();

            long numero = pacienteDAO.cadastra(umPaciente);

            JPAUtil.commitTransaction();

            return numero;
        } catch (InfraestruturaException e)
        {
            try
            {
                JPAUtil.rollbackTransaction();
            } catch (InfraestruturaException ie)
            {
            }

            throw e;
        } finally
        {
            JPAUtil.closeEntityManager();
        }
    }

    public void altera(Paciente umPaciente)
            throws AplicacaoException
    {
        try
        {
            JPAUtil.beginTransaction();

            pacienteDAO.altera(umPaciente);

            JPAUtil.commitTransaction();
        } catch (ObjetoNaoEncontradoException e)
        {
            try
            {
                JPAUtil.rollbackTransaction();
            } catch (InfraestruturaException ie)
            {
                throw ie;
            }

            throw new AplicacaoException("Paciente não encontrado");
        } catch (InfraestruturaException e)
        {
            try
            {
                JPAUtil.rollbackTransaction();
            } catch (InfraestruturaException ie)
            {
            }

            throw e;
        } finally
        {
            JPAUtil.closeEntityManager();
        }
    }

    public void exclui(long numero)
            throws AplicacaoException
    {
        try
        {
            JPAUtil.beginTransaction();

            pacienteDAO.exclui(numero);

            JPAUtil.commitTransaction();
        } catch (ObjetoNaoEncontradoException e)
        {
            try
            {
                JPAUtil.rollbackTransaction();
            } catch (InfraestruturaException ie)
            {
                throw ie;
            }

            throw new AplicacaoException("Paciente não encontrada");
        } catch (InfraestruturaException e)
        {
            try
            {
                JPAUtil.rollbackTransaction();
            } catch (InfraestruturaException ie)
            {
            }

            throw e;
        } finally
        {
            JPAUtil.closeEntityManager();
        }
    }

    public Paciente recuperaUmaReserva(long numero)
            throws AplicacaoException
    {
        try
        {
            Paciente umPaciente = pacienteDAO.recuperaPaciente(numero);

            return umPaciente;
        } catch (ObjetoNaoEncontradoException e)
        {
            throw new AplicacaoException("Reserva não encontrada");
        } finally
        {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Paciente> recuperaReservas()
    {
        try
        {
            List<Paciente> pacientes = pacienteDAO.recuperaPacientes();

            return pacientes;
        } finally
        {
            JPAUtil.closeEntityManager();
        }
    }
}