package dao;

import java.util.List;
import modelo.Paciente;
import exception.ObjetoNaoEncontradoException;

public interface PacienteDAO
{

    public long cadastra(Paciente umPaciente);

    public void altera(Paciente umPaciente) throws ObjetoNaoEncontradoException;

    public void exclui(long id) throws ObjetoNaoEncontradoException;

    public Paciente recuperaPaciente(long numero) throws ObjetoNaoEncontradoException;

    public List<Paciente> recuperaPacientes();
}