package br.com.connectcargas.services;

import java.util.List;

import br.com.connectcargas.model.Transportadora;

public interface ITransportadoraService {
	
	public boolean salvar(Transportadora transportadora);
	public boolean deletar(int id);
	public List<Transportadora> consultar();
	public Transportadora atualizar(Transportadora transportadora);
	

}
