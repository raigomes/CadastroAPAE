package modelo;

import java.io.Serializable;
import java.sql.Date;

public class Paciente implements Serializable
{

    /** Atributos **/
    private final static long serialVersionUID = 1;
    private long matricula;
    private String nome;
    private String endereco;
    private String telefone;
    private Date dataDeNascimento;
    private String setor;
    private String diagnostico;

    /** Construtores **/
    public Paciente()
    {
    }

    public Paciente(String nome, String endereco, String telefone, Date dataDeNascimento, String setor, String diagnostico)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.setor = setor;
        this.diagnostico = diagnostico;
    }

    public Paciente(long matricula, String nome, String endereco, String telefone, Date dataDeNascimento, String setor, String diagnostico)
    {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.setor = setor;
        this.diagnostico = diagnostico;
    }

    /** Getters & Setters **/
    public long getMatricula()
    {
        return matricula;
    }

    public void setMatricula(long matricula)
    {
        this.matricula = matricula;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public Date getDataDeNascimento()
    {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento)
    {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getSetor()
    {
        return setor;
    }

    public void setSetor(String setor)
    {
        this.setor = setor;
    }

    public String getDiagnostico()
    {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico)
    {
        this.diagnostico = diagnostico;
    }
}