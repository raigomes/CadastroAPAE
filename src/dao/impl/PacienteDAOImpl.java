package dao.impl;

import exception.ObjetoNaoEncontradoException;
import java.util.List;
import modelo.*;

public class PacienteDAOImpl implements dao.PacienteDAO
{

    @Override
    public long cadastra(Paciente umPaciente)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
