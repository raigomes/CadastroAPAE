package util;

import java.io.Serializable;
import java.util.List;
import modelo.Consulta;
import modelo.Medico;
import modelo.Paciente;
import modelo.Usuario;

public class Banco implements Serializable {
    List<Paciente> listaDePacientes;
    List<Medico> listaDeMedicos;
    List<Consulta> listaDeConsultas;
    List<Usuario> listaDeUsuarios;
    
}
