package dao.impl;

import exception.ObjetoNaoEncontradoException;
import java.util.List;
import modelo.Consulta;
import modelo.Paciente;

public class MedicoDAOImpl implements dao.MedicoDAO
{

    @Override
    public Paciente recuperaPaciente(long numero) throws ObjetoNaoEncontradoException
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Paciente> recuperaPacientes()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Consulta> recuperaConsultas()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
