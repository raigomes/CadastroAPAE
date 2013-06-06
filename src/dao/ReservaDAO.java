package dao;

import java.util.List;
import modelo.Reserva;
import exception.ObjetoNaoEncontradoException;

public interface ReservaDAO
{

    public long inclui(Reserva umaReserva);

    public void altera(Reserva umaReserva) throws ObjetoNaoEncontradoException;

    public void exclui(long id) throws ObjetoNaoEncontradoException;

    public Reserva recuperaUmaReserva(long numero) throws ObjetoNaoEncontradoException;

    public Reserva recuperaUmaReservaComLock(long numero) throws ObjetoNaoEncontradoException;

    public List<Reserva> recuperaReservas();
}