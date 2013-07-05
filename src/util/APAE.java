package util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Consulta;
import modelo.Medico;
import modelo.Paciente;
import modelo.Usuario;

public class APAE implements Serializable
{

    private List<Paciente> listaDePacientes;
    private List<Medico> listaDeMedicos;
    private List<Consulta> listaDeConsultas;
    private List<Usuario> listaDeUsuarios;

    public APAE()
    {
        listaDeConsultas = new ArrayList<>();
        listaDeMedicos = new ArrayList<>();
        listaDePacientes = new ArrayList<>();
        listaDeUsuarios = new ArrayList<>();
    }

    public int adicionaPaciente(Paciente umPaciente)
    {
        listaDePacientes.add(umPaciente);
        return listaDePacientes.indexOf(umPaciente);
    }

    public boolean adicionaMedico(Medico umMedico)
    {
        return listaDeMedicos.add(umMedico);
    }

    public boolean adicionaConsulta(Consulta umaConsulta)
    {
        return listaDeConsultas.add(umaConsulta);
    }

    public boolean adicionaUsuario(Usuario umUsuario)
    {
        return listaDeUsuarios.add(umUsuario);
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

    @Override
    public String toString()
    {
        String out = "APAE{ ";
        for (modelo.Paciente e : listaDePacientes)
        {
            out += e;
        }
        out += '}';
        return out;
    }
}
