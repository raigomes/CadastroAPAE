package servico;

import java.util.List;
//import util.ConnUtil;
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
            /** Passos:
             *      1. Inicie uma transação.
             *      2. Chame o método DAO relativo do Objeto referenciado.
             *      3. Salve as alterações.
             *      4. Retorne o ID do Objeto, no caso 'umPaciente'.
             *      5. Feche a transação.
             * 
             *      Em caso de erros, jogue uma exceção de Infraestrutura (pois há um erro físico, e não lógico) e efetue o 'rollback'.
             *          
             **/
            
            // NENHUMA VALIDAÇÃO ESTÁ SENDO REALIZADA AQUI!!!
            //ConnUtil.beginTransaction();
            long numero = pacienteDAO.cadastra(umPaciente);

            //ConnUtil.commitTransaction();

            return numero;
        } catch (InfraestruturaException e)
        {
            try
            {
                //ConnUtil.rollbackTransaction();
            } catch (InfraestruturaException ie)
            {
            }

            throw e;
        } finally
        {
            //ConnUtil.closeEntityManager();
        }
    }

    public void altera(Paciente umPaciente) throws AplicacaoException
    {
        try
        {
            //ConnUtil.beginTransaction();

            pacienteDAO.altera(umPaciente);

            //ConnUtil.commitTransaction();
        } catch (ObjetoNaoEncontradoException e)
        {
            try
            {
                //ConnUtil.rollbackTransaction();
            } catch (InfraestruturaException ie)
            {
                throw ie;
            }

            throw new AplicacaoException("Paciente não encontrado");
        } catch (InfraestruturaException e)
        {
            try
            {
                //ConnUtil.rollbackTransaction();
            } catch (InfraestruturaException ie)
            {
            }

            throw e;
        } finally
        {
            //ConnUtil.closeEntityManager();
        }
    }

    public void exclui(long numero) throws AplicacaoException
    {
        try
        {
            //ConnUtil.beginTransaction();

            pacienteDAO.exclui(numero);

            //ConnUtil.commitTransaction();
        } catch (ObjetoNaoEncontradoException e)
        {
            try
            {
                //ConnUtil.rollbackTransaction();
            } catch (InfraestruturaException ie)
            {
                throw ie;
            }

            throw new AplicacaoException("Paciente não encontrado");
        } catch (InfraestruturaException e)
        {
            try
            {
                //ConnUtil.rollbackTransaction();
            } catch (InfraestruturaException ie)
            {
            }

            throw e;
        } finally
        {
            //ConnUtil.closeEntityManager();
        }
    }

    public Paciente recuperaUmPaciente(long numero) throws AplicacaoException
    {
        try
        {
            Paciente umPaciente = pacienteDAO.recuperaPaciente(numero);

            return umPaciente;
        } catch (ObjetoNaoEncontradoException e)
        {
            throw new AplicacaoException("Paciente não encontrado");
        } finally
        {
            //ConnUtil.closeEntityManager();
        }
    }

    public List<Paciente> recuperaListaDePacientes()
    {
        try
        {
            List<Paciente> pacientes = pacienteDAO.recuperaPacientes();

            return pacientes;
        } finally
        {
            //ConnUtil.closeEntityManager();
        }
    }
}