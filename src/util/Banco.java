package util;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import modelo.Consulta;
import modelo.Medico;
import modelo.Paciente;
import modelo.Usuario;

public class Banco implements Serializable
{

    List<Paciente> listaDePacientes;
    List<Medico> listaDeMedicos;
    List<Consulta> listaDeConsultas;
    List<Usuario> listaDeUsuarios;

    public boolean adicionaPaciente(Paciente umPaciente)
    {
        listaDePacientes.add(umPaciente);
        return true;
    }

    public boolean adicionaMedico(Medico umMedico)
    {
        listaDeMedicos.add(umMedico);
        return true;
    }

    public boolean adicionaConsulta(Consulta umaConsulta)
    {
        listaDeConsultas.add(umaConsulta);
        return true;
    }

    public boolean adicionaUsuario(Usuario umUsuario)
    {
        listaDeUsuarios.add(umUsuario);
        return true;
    }

    public List<Paciente> getListaDePacientes()
    {
        return listaDePacientes;
    }

    public List<Medico> getListaDeMedicos()
    {
        return listaDeMedicos;
    }

    public List<Consulta> getListaDeConsultas()
    {
        return listaDeConsultas;
    }

    public List<Usuario> getListaDeUsuarios()
    {
        return listaDeUsuarios;
    }

    public static void log(String msg)
    {
        System.out.println(new Date() + ": " + msg.toUpperCase());
    }
}
