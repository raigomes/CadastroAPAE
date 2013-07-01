package dao;

import exception.ObjetoNaoEncontradoException;
import java.util.List;
import modelo.Consulta;
import modelo.Paciente;

public interface MedicoDAO {

    public Paciente recuperaPaciente(long numero) throws ObjetoNaoEncontradoException;

    public List<Paciente> recuperaPacientes();
    
    public List<Consulta> recuperaConsultas();
    
}
