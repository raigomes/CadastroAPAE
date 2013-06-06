package dao.impl;

import exception.ObjetoNaoEncontradoException;
import java.util.List;
import modelo.Reserva;

public class ReservaDAOImpl implements dao.ReservaDAO
{

    @Override
    public long inclui(Reserva umaReserva)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void altera(Reserva umaReserva) throws ObjetoNaoEncontradoException
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void exclui(long id) throws ObjetoNaoEncontradoException
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Reserva recuperaUmaReserva(long numero) throws ObjetoNaoEncontradoException
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Reserva recuperaUmaReservaComLock(long numero) throws ObjetoNaoEncontradoException
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Reserva> recuperaReservas()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
