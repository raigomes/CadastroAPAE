package servico;

import java.util.List;
import util.JPAUtil;
import modelo.Reserva;
import dao.ReservaDAO;
import dao.fabrica.FabricaDeDAOs;
import exception.AplicacaoException;
import exception.InfraestruturaException;
import exception.ObjetoNaoEncontradoException;

public class ReservaAppService
{

    private static ReservaDAO reservaDAO = FabricaDeDAOs.getDAO(ReservaDAO.class);

    public long inclui(Reserva umaReserva)
    {
        try
        {
            // NENHUMA VALIDAÇÃO ESTÁ SENDO REALIZADA AQUI!!!

            JPAUtil.beginTransaction();

            long numero = reservaDAO.inclui(umaReserva);

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

    public void altera(Reserva umaReserva)
            throws AplicacaoException
    {
        try
        {
            JPAUtil.beginTransaction();

            reservaDAO.altera(umaReserva);

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

            throw new AplicacaoException("Reserva não encontrada");
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

            reservaDAO.exclui(numero);

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

            throw new AplicacaoException("Reserva não encontrada");
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

    public Reserva recuperaUmaReserva(long numero)
            throws AplicacaoException
    {
        try
        {
            Reserva umaReserva = reservaDAO.recuperaUmaReserva(numero);

            return umaReserva;
        } catch (ObjetoNaoEncontradoException e)
        {
            throw new AplicacaoException("Reserva não encontrada");
        } finally
        {
            JPAUtil.closeEntityManager();
        }
    }

    public List<Reserva> recuperaReservas()
    {
        try
        {
            List<Reserva> reservas = reservaDAO.recuperaReservas();

            return reservas;
        } finally
        {
            JPAUtil.closeEntityManager();
        }
    }
}