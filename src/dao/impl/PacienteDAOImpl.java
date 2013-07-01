package dao.impl;

import exception.ObjetoNaoEncontradoException;
import java.util.List;
import modelo.Paciente;

public class PacienteDAOImpl implements dao.PacienteDAO
{    

    @Override
    public long cadastra(Paciente umPaciente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void altera(Paciente umPaciente) throws ObjetoNaoEncontradoException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void exclui(long id) throws ObjetoNaoEncontradoException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Paciente recuperaPaciente(long numero) throws ObjetoNaoEncontradoException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Paciente> recuperaPacientes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
