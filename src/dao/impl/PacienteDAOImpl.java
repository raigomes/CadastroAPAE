package dao.impl;

import exception.ObjetoNaoEncontradoException;
import java.util.List;
import modelo.*;

public class PacienteDAOImpl implements dao.PacienteDAO
{

    @Override
    public long cadastra(Paciente umPaciente)
    {
        return 0;
        // Passos:
        //  1. Pegue uma conexão
        //  2. Inclua usando persistência o 'umPaciente'
        //  3. Retorne o ID de o 'umPaciente'
        //  
        //  Em caso de erros, jogue uma exceção de Infraestrutura (pois há um erro físico, e não lógico)
    }

    @Override
    public void altera(Paciente umPaciente) throws ObjetoNaoEncontradoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exclui(long id) throws ObjetoNaoEncontradoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Paciente recuperaPaciente(long numero) throws ObjetoNaoEncontradoException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Paciente> recuperaPacientes()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
