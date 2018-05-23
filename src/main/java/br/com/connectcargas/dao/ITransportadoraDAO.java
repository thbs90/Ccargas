package br.com.connectcargas.dao;

import java.util.List;

import br.com.connectcargas.model.Transportadora;

public interface ITransportadoraDAO {
	public boolean salvar(Transportadora transportadora);
	public boolean deletar(int id);
	public List<Transportadora> consultar();
	public Transportadora atualizar(Transportadora transportadora);

}
